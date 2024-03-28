//
//  Classes.swift
//  FinalProject
//
//  Created by Yiğit Özok on 21.02.2024.
//
//
//  Orders.swift
//  FinalProject
//
//  Created by Yiğit Özok on 30.11.2023.
//

import SwiftUI

struct ClassModel:  Identifiable{
    var id = UUID()
    var className: String

}

struct ClassesView : View {
    
    @State var classesList: [ClassModel] = [
        ClassModel(className: "5.Sınıf"),
        ClassModel(className: "6.Sınıf"),
        ClassModel(className: "7.Sınıf")
    ]
    
    
    var body: some View {
        NavigationStack{
            ZStack{
                Image("elipsebackground")
                    .resizable()
                Text("Sınıflar")
                    .font(.system(size: 40, weight: .bold))
                    .foregroundColor(Color.white)
                    .padding(.top,55)
            }
            .edgesIgnoringSafeArea(.top)
            .frame(height: 175)
            
            Text("Test'e girmek için sınıf seçin;")
                .foregroundColor(Color.black).opacity(0.75)
                .padding(.top,10)
                .padding(.bottom,20)
            
            ScrollView(showsIndicators: false){
                VStack(spacing: 40){
                    ForEach($classesList) { $item in
                       
                        NavigationLink(destination: QuizCardView(),
                                       label: { ClassButton(title: item.className)})
                        /*
                        ClassButton(title: item.className) {
                          
                                item.isPresented.toggle()
                            
                        }.navigationDestination(isPresented: $item
                            .isPresented){
                                QuizView()
                        }
                         */
                        
                    }
                }
            }
        }
    }

}


struct Classes_Previews: PreviewProvider {
    static var previews: some View {
        ClassesView()
    }
}
