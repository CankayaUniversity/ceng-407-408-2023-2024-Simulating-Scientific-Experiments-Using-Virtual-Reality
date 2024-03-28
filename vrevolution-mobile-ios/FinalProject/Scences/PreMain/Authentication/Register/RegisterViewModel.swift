//
//  RegisterViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 22.03.2024.
//

import Foundation
import SwiftUI

class RegisterViewModel: ObservableObject{
    
    //Kullanıcı bilgileri...
    @Published var userName   : String = ""
    @Published var email      : String = ""
    @Published var password   : String = ""
  
    
   
    @Published var networkManager = NetworkManager()
    
    //Uyarı bilgileri...
    @Published var showAlreadyUseEmailAlert : Bool = false
    @Published var showFalseUsernameAlert : Bool = false
    @Published var showFlaseUsePasswordAlert : Bool = false
    
    @Published var isSuccesfullLoginView : Bool = false
    func registerButtonAction() {
        
        
       
        
        let requestModel = RegisterRequestModel(username: userName, email: email, password: password)
        print(requestModel)

        
            networkManager.request(
                type: RegisterModel.self,
                url: NetworkPath.BaseUrL.baseUrl.rawValue,
                endPoint: NetworkPath.Endpoints.register,
                bodyParameters: requestModel.data,
                method: NetworkPath.HTTPMethods.post,
                completion: { [weak self] result in
                    guard let self =  self else {
                        return
                    }
                    
                    DispatchQueue.main.async {
                        switch result {
                            
                            case .success(let data):
                            // Başarılı durumda yapılacak işlemler
                            print("Kullanıcı oluşturma issteği başarı ile tamamlandı.")
                            
                            if data.status ==  400 {
                                print("Hata Status 400")
                                if let validationErrors = data.validationErrors{
                                    if let emailError = validationErrors.email{
                                        self.showAlreadyUseEmailAlert = true
                                        print(emailError)
                                        print(self.showAlreadyUseEmailAlert)
                                    }
                                    if let usernameError = validationErrors.username{
                                        self.showFalseUsernameAlert = true
                                        print(usernameError)
                                        print(self.showFalseUsernameAlert)
                                    }
                                    if let passwordError = validationErrors.password{
                                        self.showFlaseUsePasswordAlert = true
                                        print(passwordError)
                                        print(self.showFalseUsernameAlert)
                                    }
                                }
                            }
                            else{
                                print("Başarılı bir şekilde kullanıcı oluşturuldu.")
                                self.isSuccesfullLoginView = true
                                print(data)
                            }
                            case .failure(let error):
                            // Hata durumunda yapılacak işlemler
                            print("Register tamamlanamadı. Hata: \(error.localizedDescription)")
                            // Hata durumuna göre gerekli alert'ı göster veya diğer işlemleri yap
                        }
                    }
                    
                })
            
            
        }
   
    
}
