//
//  StudentModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 26.12.2023.
//

import Foundation
import SwiftUI

struct StudentModel: Identifiable, Codable, Hashable {
    
    //OGRENCI'NIN NAME VE PASSWORD OZELLIKLERI
    var id = UUID()
    let userName: String?
    let email: String?
    let password: String?
    
   
}
