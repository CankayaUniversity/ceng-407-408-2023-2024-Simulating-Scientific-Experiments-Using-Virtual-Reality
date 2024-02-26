//
//  VideoViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 15.01.2024.
//

import Foundation
import SwiftUI


class VideoViewModel: ObservableObject{
    
    ///ALL COURSE( LIBRARY COURSE)
    @Published var videoList: [VideoModel] = [
        VideoModel(videoTitle: "Uzay ve Gezegenler", videoImageName: "gezegen2", videoDescription: "Uzay ve güneş sistemimizdeki gezegenler hakkında bilgilerin yer aldığı , bu bilgileri interaktif bir şekilde öğrenebileceğimiz VR video gösterimi yer alıyor.", quiz: [
            QuizModel(quizName: "Quiz 1",
                      quizPoint: 30,
                      quizTime: 60,
                      question: [
                        QuestionModel(
                            questionContent: "Soru1",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "B Şıkkı",
                            questionCorrectAnswer: "C Şıkkı"
                        ),
                        QuestionModel(
                            questionContent: "Soru 2",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "C Şıkkı",
                            questionCorrectAnswer: "A Şıkkı")
            ])
        ]),
        VideoModel(videoTitle: "Elementlerin Gösterimi", videoImageName: "gezegen4", videoDescription: "Mendelian Genetics", quiz: [
            QuizModel(quizName: "Quiz 1",
                      quizPoint: 30,
                      quizTime: 60,
                      question: [
                        QuestionModel(
                            questionContent: "Soru1",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "B Şıkkı",
                            questionCorrectAnswer: "C Şıkkı"
                        ),
                        QuestionModel(
                            questionContent: "Soru 2",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "C Şıkkı",
                            questionCorrectAnswer: "A Şıkkı")
            ])
        ]),
        VideoModel(videoTitle: "Elementlerin Gösterimi", videoImageName: "gezegen3", videoDescription: "Mendelian Genetics", quiz: [
            QuizModel(quizName: "Quiz 1",
                      quizPoint: 30,
                      quizTime: 60,
                      question: [
                        QuestionModel(
                            questionContent: "Soru1",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "B Şıkkı",
                            questionCorrectAnswer: "C Şıkkı"
                        ),
                        QuestionModel(
                            questionContent: "Soru 2",
                            questionOptions: ["A Şıkkı", "B Şıkkı", "C Şıkkı", "D Şıkkı"],
                            questionSelectedAnswer: "C Şıkkı",
                            questionCorrectAnswer: "A Şıkkı")
            ])
        ])
    ]
}
