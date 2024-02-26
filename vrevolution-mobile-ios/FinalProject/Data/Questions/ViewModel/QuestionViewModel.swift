//
//  QuestionViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 10.01.2024.
//

import Foundation
import SwiftUI

class QuestionViewModel: ObservableObject{
    
    @Published var questions: [QuestionModel] = [
        QuestionModel(questionContent: "When was the iphone first released", questionOptions: ["A","B","C","D"], questionCorrectAnswer: "A"),
        QuestionModel(questionContent: "Soru 2", questionOptions: ["A","B","C","D"],  questionCorrectAnswer: "A"),
        QuestionModel(questionContent: "Soru3 ", questionOptions: ["A","B","C","D"],  questionCorrectAnswer: "A"),
    ]
    

    
    func canSubmitQuiz() -> Bool{
        return questions.filter({
            $0.questionSelectedAnswer == nil
        }).isEmpty
    }
    
    func gradeQuiz() -> String{
        var correct: CGFloat = 0
        for question in questions{
            if question.questionSelectedAnswer == question.questionCorrectAnswer{
                correct += 1
            }
        }
        return "\((correct/CGFloat(questions.count)) * 100)"
    }
}
