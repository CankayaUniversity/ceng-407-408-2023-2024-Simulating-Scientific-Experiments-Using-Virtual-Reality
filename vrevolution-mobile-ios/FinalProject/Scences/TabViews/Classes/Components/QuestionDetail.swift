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
            Spacer()
                Text(quesiton.questionContent)
                .padding()
                .frame(maxWidth: .infinity)
                .multilineTextAlignment(.center)
            Spacer()
                
            ForEach(Array(quesiton.questionOptions.keys.sorted()), id: \.self){ key in
               
                    Button(action: {
                        quesiton.questionSelectedAnswer = key
                    }, label: {
                        Text(key + ". " + (quesiton.questionOptions[key] ?? ""))
                            
                            .frame(maxWidth:.infinity,minHeight: 50, alignment: .leading)
                            .multilineTextAlignment(.leading)
                            .padding()
                            .background(quesiton.questionSelectedAnswer ?? "" == key ? Color("AnswerColor") : Color.white)
                            .foregroundColor(quesiton.questionSelectedAnswer ?? "" == key ? .white : .black)
                           
                            .cornerRadius(10)
                            .overlay(
                                RoundedRectangle(cornerRadius: 10)
                                    .stroke(
                                        Color.black.opacity(
                                            quesiton.questionSelectedAnswer ?? "" == key ? 0.0 : 0.75
                                        ),
                                        lineWidth: 0.74
                                    )
                            )
                            .padding(.horizontal)
                            .padding(.vertical,5)
                        
                    })
                    
                
            }
        }
       
    }
        
}

