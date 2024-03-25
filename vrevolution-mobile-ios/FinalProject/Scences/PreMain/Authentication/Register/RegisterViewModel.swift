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
    @Published var isSuccesfulyBackLoginView : Bool = false
    
   
    @Published var networkManager = NetworkManager()
    
    //Uyarı bilgileri...
    @State var showPassordConfirmAlert : Bool = false
    @State var showAlreayAccountAlert : Bool = false
    
    
    func registerButtonAction() {
        
        
        /*if studentViewModel.alreadyStudent(userName: userName, password: password) == false{
            studentViewModel.addStudent(userName: userName, email: email,password: password)
            isSuccesfulyBackLoginView = true*/
        
        let requestModel = RegisterRequestModel(username: userName, email: email, password: password)
 

        
            networkManager.request(
                type: RegisterModel.self,
                url: NetworkPath.BaseUrL.baseUrl.rawValue,
                endPoint: NetworkPath.Endpoints.register,
                bodyParameters: requestModel.data,
                method: NetworkPath.HTTPMethods.post,
                completion: {result in
                    switch result {
                        case .success(let data):
                        // Başarılı durumda yapılacak işlemler
                        print("Register başarıyla tamamlandı. Veri: \(data)")
                        case .failure(let error):
                        // Hata durumunda yapılacak işlemler
                        print("Register tamamlanamadı. Hata: \(error.localizedDescription)")
                        // Hata durumuna göre gerekli alert'ı göster veya diğer işlemleri yap
                    }
                })
            
            
        }
    /*else{
            showAlreayAccountAlert = true
        }
     */
    
}
