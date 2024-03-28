//
//  LoginRequestModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.03.2024.
//

import Foundation

struct LoginRequestModel: Codable{
    var email: String?
    var password: String?
    
    init(email: String? = nil, password: String? = nil) {
        self.email = email
        self.password = password
    }
}
