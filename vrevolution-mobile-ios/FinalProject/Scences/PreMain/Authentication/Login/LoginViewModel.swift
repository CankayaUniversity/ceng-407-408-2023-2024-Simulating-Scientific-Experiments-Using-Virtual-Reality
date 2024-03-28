//
//  LoginViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.03.2024.
//

import Foundation
import SwiftUI

class LoginViewModel : ObservableObject{
    
    @Published var email    : String = ""
    @Published var username : String = ""
    @Published var password : String = ""
    
    @Published var showFalseEmailFormatAlert: Bool = false
    @Published var showFalseUserInfoAlert   : Bool = false
    @Published var isSuccesfullHomePageView : Bool = false
    
    @Published var networkManager = NetworkManager()
    
    func loginButtonAction() {
        
        let loginRequestModel = LoginRequestModel(email: email, password: password)
        
        networkManager.request(
            type: LoginModel.self,
            url: NetworkPath.BaseUrL.baseUrl.rawValue,
            endPoint: NetworkPath.Endpoints.login,
            bodyParameters: loginRequestModel.data,
            method: NetworkPath.HTTPMethods.post,
            completion: { [weak self] result in
                guard let self = self else {
                    return
                    
                }
                DispatchQueue.main.async {
                    switch result{
                        
                        case .success(let data):
                        
                        //Kullancı login işlemi başarılı yapıldığında yapılacak işlemler...
                        print("Kullanıcı giriş isteiği başarı ile tamamlandı.")
                        
                        if data.status == 400{
                            print("Email formatı hatalı!")
                            if let errorMessage = data.message{
                                self.showFalseEmailFormatAlert = true
                                print(errorMessage)
                                print(self.$showFalseEmailFormatAlert)
                            }
                        }else if data.status == 401{
                            print("Kullanıcı Adı veya şifre hatalı!")
                            if let errorMessage = data.message{
                                self.showFalseUserInfoAlert = true
                                print(errorMessage)
                                print(self.$showFalseUserInfoAlert)
                            }
                        }else{
                            self.username = data.user?.username ?? ""
                            print("Başarılı bir şekildeg giriş yapıldı.")
                                self.isSuccesfullHomePageView = true
                        }
                        
                        
                        case .failure(let error):
                            print("Login işlemi başarısız. Hata: \(error.localizedDescription)")
                    }
                }
               
            }
        )
    }
}
