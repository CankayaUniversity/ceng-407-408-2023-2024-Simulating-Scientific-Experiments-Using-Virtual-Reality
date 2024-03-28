//
//  CardView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 19.02.2024.
//

import SwiftUI

struct QuizView: View {
 
    var body: some View {
       
        NavigationStack {
            VStack(alignment: .leading){
                    Text("Test 1")
                        .font(.system(size: 25,weight: .bold))
                        .frame(maxWidth: .infinity,alignment: .leading)
                        .padding(.horizontal)
                    
                    Rectangle()
                        .frame(maxWidth: .infinity,maxHeight: 1)
                        .background(Color.gray)
                        .opacity(0.75)
                    
                    VStack(alignment: .leading){
                        VStack(alignment: .leading, spacing: 17.5){
                            HStack{
                                Text("Konu Başlığı:")
                                Text("Uzay ve Gezegenler")
                            }
                            
                            HStack{
                                Text("Soru Sayısı:")
                                Text("10")
                            }
                            
                            HStack{
                                Text("Zorluk Sevitesi:")
                                Text("Kolay")
                            }
                        }
                        .fontWeight(.medium)
                        
                        
                        HStack{
                            VStack{
                                Text("Test Katıl'a basıldıktan sonra")
                                Text("süre direk başlıycaktır!")
                                
                            }
                            .font(.system(size: 15))
                            .opacity(0.60)
                            
                            Spacer()
                            
                            NavigationLink{
                                QuestionView()
                            } label: {
                                Text("Test Katıl")
                                    .frame(width: 120, height: 30)
                                    .background(Color("NewGreen"))
                                    .clipShape(RoundedRectangle(cornerRadius: 14))
                                
                            }
                            
                          
                        }
                    }
                    .padding(.horizontal)
                }
                .padding(.vertical,5)
                .padding(.bottom,5)
                .background(Color.classesViewBackGroundColorTittle)
                .clipShape(RoundedRectangle(cornerRadius: 15))
                .padding(.horizontal,10)
            .foregroundColor(Color.white)
        }
           
            
            
        }
    
}

struct CardView_Previews: PreviewProvider {
    static var previews: some View {
        QuizView()
    }
}
