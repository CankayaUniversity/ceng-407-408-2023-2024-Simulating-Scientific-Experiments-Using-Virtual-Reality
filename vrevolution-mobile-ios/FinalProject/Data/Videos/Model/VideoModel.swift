//
//  ViewData.swift
//  FinalProject
//
//  Created by Yiğit Özok on 15.01.2024.
//

import Foundation
import SwiftUI

struct VideoModel: Codable, Hashable, Identifiable{
    
    var id = UUID()
    
    var videoTitle  : String
    var videoImageName : String
    var videoDescription : String
    
    var quiz : [QuizModel]
    
    
}
