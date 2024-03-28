//
//  NetworkHelper.swift
//  FinalProject
//
//  Created by Yiğit Özok on 1.03.2024.
//

import Foundation

struct NetworkPath{
    
    enum Endpoints: String{
        case login = "api/v1/auth"
        case register = "api/v1/users"
        case questions = ""
    }
    enum BaseUrL: String{
        case baseUrl = "https://vrevolution.azurewebsites.net/"
        
    }
    enum HTTPMethods: String{
        case get = "GET"
        case post = "POST"
    }
}

enum ErrorTypes: String, Error{
    case invalidData = "Invalid data"
    case invalidUrl = "Invalid url"
    case generalError = "An error happened"
}
