//
//  RegisterRequestModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.03.2024.
//

import Foundation

// MARK: - RegisterRequestModel
struct RegisterRequestModel: Codable {
    var username: String?
    var email: String?
    var password: String?
    
    init(username: String? = nil, email: String? = nil, password: String? = nil) {
        self.username = username
        self.email = email
        self.password = password
    }
}
