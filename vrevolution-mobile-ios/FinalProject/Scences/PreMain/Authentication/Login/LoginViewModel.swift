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
    @Published var password : String = ""
    
    @Published var networkManager = NetworkManager()
    
    func loginButtonAction() {
        
        let loginRequestModel = LoginRequestModel(email: email, password: password)
        
        networkManager.request(
            type: LoginModel.self,
            url: NetworkPath.BaseUrL.baseUrl.rawValue,
            endPoint: NetworkPath.Endpoints.login,
            bodyParameters: loginRequestModel.data,
            method: NetworkPath.HTTPMethods.post,
            completion: { result in
                switch result{
                    case .success(let data):
                    print("Giriş işlemi başarılı ile tamamlandı. Giriş yapılan veri: \(data))")
                    case .failure(let error):
                        print("Giriş işlemi başarısız. Hata: \(error.localizedDescription)")
                }
            }
        )
    }
}
