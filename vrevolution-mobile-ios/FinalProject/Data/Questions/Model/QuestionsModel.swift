//
//  QuestionsModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 10.01.2024.
//

import Foundation
import SwiftUI

struct QuestionModel: Identifiable, Codable, Hashable {
    var id = UUID()
    var questionContent: String
    var questionOptions: [String : String]
    var questionSelectedAnswer : String?
    var questionCorrectAnswer : String
}
