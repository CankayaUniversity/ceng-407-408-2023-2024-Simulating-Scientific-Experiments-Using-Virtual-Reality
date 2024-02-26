//
//  QuestionDetail.swift
//  FinalProject
//
//  Created by Yiğit Özok on 22.02.2024.
//

import SwiftUI

struct QuestionDetail: View {
    @Binding var quesiton : QuestionModel
    var body: some View {
        VStack{
          
            Text(quesiton.questionContent)
            ForEach(quesiton.questionOptions, id: \.self){choice in
               
                    Button(action: {
                        quesiton.questionSelectedAnswer = choice
                    }, label: {
                        Text(choice)
                            .foregroundColor(.black)
                            .frame(width:150,height: 30)
                            .background(quesiton.questionSelectedAnswer == choice ? Color("AnswerColor") : Color.white)
                    })
            }
        }
        .frame(height: 550)
        .background(Color(uiColor: .systemGray6))
    }
        
}

