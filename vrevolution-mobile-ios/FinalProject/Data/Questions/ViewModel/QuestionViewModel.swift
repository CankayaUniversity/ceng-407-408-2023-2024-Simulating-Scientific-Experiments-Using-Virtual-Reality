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
        QuestionModel(questionContent: "Güneş sisteminde kaç gezen bulunmaktadır?",
                      questionOptions: ["A":"7","B":"8","C":"9","D":"10"],
                      questionCorrectAnswer: "B"),
        
        QuestionModel(questionContent: "Dünya'nın Güneş etrafında bir turu tamamlaması kaç gün sürer?",
                      questionOptions: ["A":"365","B":"366","C":"354","D":"360"],
                      questionCorrectAnswer: "A"),
        
        QuestionModel(questionContent: "Ay'ın Dünya etrafındaki hareketi sonucunda meydana gelen olay aşağıdakilerden hangisidir?",
                      questionOptions: ["A":"Gün dönümü","B":"Ay Tutulması","C":"Güneş tutulması","D":"Yıldız kayması"],
                      questionCorrectAnswer: "B"),
        
        QuestionModel(questionContent: "Aşağıdaki gezegenlerden hangisi Güneş'e en yakın olandır?",
                      questionOptions: ["A":"Venüs","B":"Mars","C":"Merkür","D":"Dünya"],
                      questionCorrectAnswer: "C"),
        
        QuestionModel(questionContent: "Güneş tutulması sırasında aşağıdakilerden hangisi gerçekleşir?",
                      questionOptions: ["A":"Ay,Dünya'nın önünden geçer.","B":"Dünya Ay'ın önünden geçer.","C":"Dünya,Güneş'in önünden geçerasjhdkjashdjkashjdkashdjkhsajkdhasjkdhaksjhdkjashdkjashdkjashdkjashdkjashdkjahsd.","D":"Ay, Güneş'in önünden geçer."],
                      questionCorrectAnswer: "D"),
        
        QuestionModel(questionContent: "Ay tutulması sadece hangi ay evresinde gerçekleşir?",
                      questionOptions: ["A":"Yeni Ay","B":"İlk Dördün","C":"Dolunay","D":"Son Dördün"],
                      questionCorrectAnswer: "C"),
        
        QuestionModel(questionContent: "Aşağıdaki gezegenlerin hangisinin halkası vardır?",
                      questionOptions: ["A":"Merkür","B":"Venüs","C":"Dünya","D":"Satürn"],
                      questionCorrectAnswer: "D"),
        
        QuestionModel(questionContent: "Güneş Sistemi'nde bulunan gezegenlerden hangisi 'Kızıl Gezegen' olarak bilinir?",
                      questionOptions: ["A":"Mars","B":"Jupiter","C":"Satürn","D":"Neptün"],
                      questionCorrectAnswer: "A"),
        
        QuestionModel(questionContent: "Aşağıdakilerden hangisi, gece gökyüzünde parlak bir şekilde görünen ve kuyruklu yıldız olarak da bilinen gök cismidir?",
                      questionOptions: ["A":"Meteor","B":"Astreoit","C":"Kuyruklu Yıldız","D":"Uydu"],
                      questionCorrectAnswer: "C"),
        
        QuestionModel(questionContent: "Aşağıdaki gezegenlerden hangisi kendi eksanı etrafında en hızlı dönen gezegendir",
                      questionOptions: ["A":"Jupiter","B":"Merkür","C":"Venüs","D":"Dünya"],
                      questionCorrectAnswer: "A"),
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
