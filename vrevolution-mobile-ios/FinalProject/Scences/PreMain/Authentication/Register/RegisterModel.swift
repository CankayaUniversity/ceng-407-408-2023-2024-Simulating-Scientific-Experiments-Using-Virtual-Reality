//
//  RegisterModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.03.2024.
//

import Foundation

// MARK: - RegisterModel
struct RegisterModel: Codable {
    let status: Int?
    let message, path: String?
    let timestamp: Int?
    let validationErrors: ValidationErrors?
}

// MARK: - ValidationErrors
struct ValidationErrors: Codable {
    let email: String?
    let username: String?
    let password: String?
}
