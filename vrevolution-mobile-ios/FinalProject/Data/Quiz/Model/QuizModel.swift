//
//  QuizModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 10.01.2024.
//

import Foundation
import SwiftUI

struct QuizModel: Hashable, Codable, Identifiable{
    
    var id = UUID()
    var quizName : String?
    var quizPoint: Int?
    var quizTime : Int?
    
    var question:  [QuestionModel]
}
