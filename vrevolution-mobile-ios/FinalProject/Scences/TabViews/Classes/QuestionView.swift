//
//  QuestionView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 22.02.2024.
//

import SwiftUI

struct QuestionView: View {
    @StateObject var questionModelObject = QuestionViewModel()
    
    var body: some View {
        
        TabView{
            ForEach(questionModelObject.questions.indices,id: \.self){index in
                VStack{
                    QuestionDetail(quesiton: $questionModelObject.questions[index])
                    
                    if let lastQuestion = questionModelObject.questions.last,
                       lastQuestion.id == questionModelObject.questions[index].id {
                        Button(action: {
                            print(questionModelObject.canSubmitQuiz())
                            print(questionModelObject.gradeQuiz())
                        }, label: {
                            Text("Submit")
                                .padding()
                                .foregroundColor(.white)
                                .background(
                                    RoundedRectangle(cornerRadius: 20, style: .continuous)
                                        .fill(Color("AnswerColor"))
                                        .frame(width: 340))
                        })
                        .buttonStyle(.plain)
                        .disabled(!questionModelObject.canSubmitQuiz())
                        
                    }
                }
            }
            
        }
        .navigationBarBackButtonHidden(true)
        .tabViewStyle(.page)
    }
}

struct QuestionView_Previews: PreviewProvider {
    static var previews: some View {
        QuestionView()
    }
}
