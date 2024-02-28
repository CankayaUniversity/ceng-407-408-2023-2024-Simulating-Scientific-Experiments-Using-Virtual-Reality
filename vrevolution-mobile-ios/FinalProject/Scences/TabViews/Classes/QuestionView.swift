//
//  QuestionView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 22.02.2024.
//

import SwiftUI

struct QuestionView: View {
    @StateObject var questionModelObject = QuestionViewModel(
        rectangleSize: UIScreen.main.bounds.width

    )
    
    var body: some View {
        
        TabView{
            ForEach(questionModelObject.questions.indices,id: \.self){index in
                
                

                VStack{
                    Text("\(index + 1)" + ".Soru")
                        .padding(.top,30)
                        .font(.system(size: 20,weight: .medium))
                    
                    ZStack(alignment: .leading){
                        
                        Rectangle()
                            .cornerRadius(10)
                            .frame(maxWidth: .infinity, maxHeight: 10)
                            .foregroundColor(Color("CompletedBarBack"))
                            .padding(.horizontal)
                        
                        Rectangle()
                            .cornerRadius(10)
                            .frame(width: questionModelObject.increaseComletedSize() ,height: 10)
                            .foregroundColor(Color("CompletedBarFront"))
                            .padding(.horizontal)
                    }
                    .padding(.top,20)
                    
                    QuestionDetail(quesiton: $questionModelObject.questions[index])
                    
                    //if let lastQuestion = questionModelObject.questions.last,
                    // lastQuestion.id == questionModelObject.questions[index].id
                    Button(action: {
                        print(questionModelObject.canSubmitQuiz())
                        print(questionModelObject.gradeQuiz())
                    }, label: {
                        Text("Submit")
                            .padding()
                            .frame(maxWidth: .infinity)
                            .foregroundColor(.white)
                            .background(
                                RoundedRectangle(cornerRadius: 20, style: .continuous)
                                    .fill(Color("AnswerColor"))
                                
                                
                            )
                            .padding()
                            .padding(.bottom,20)
                        
                    })
                    .buttonStyle(.plain)
                    .disabled(!questionModelObject.canSubmitQuiz())
                    .opacity(questionModelObject.questions.last?.id == questionModelObject.questions[index].id ? 1 : 0)
                    
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
