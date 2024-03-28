//
//  LoginModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.03.2024.
//

import Foundation


struct LoginModel: Codable{
    
    let user: UserInfo?
    let token: TokenModel?
    let status: Int?
    let message, path: String?
    let timestamp: Int?
    let validationErrors: ValidationErrors?
}
struct TokenModel : Codable{
    let prefix : String?
    let token : String?
}

struct UserInfo: Codable {
    let id: Int?
    let username : String?
    let email: String?
}
