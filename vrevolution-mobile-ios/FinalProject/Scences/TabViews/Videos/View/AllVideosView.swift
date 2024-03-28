//
//  Favourites.swift
//  FinalProject
//
//  Created by Yiğit Özok on 30.11.2023.
//

import SwiftUI

struct AllVideosView: View {
    
    @EnvironmentObject var studentInformation : LoginViewModel
    
    var body: some View {
        NavigationView {
            NavigationStack {
                
                VStack(){
                    /// HEADER VIEW
                    HeaderView
                    
                    /// THE OTHER SECTON
                    VStack{
                        SearchBar()
                        .padding(.horizontal,18)
                        CategoryVideoView()
                    }
                    Spacer()
                    
                }
                
            }
        }
    }
    
    private var HeaderView : some View{
        VStack(spacing: 10){
            HStack{
                Text("Hi, \(studentInformation.username)")
                    .font(.system(size: 30))
                Spacer()
                Button(action: {}, label: {Image(systemName: "bell.badge") .font(.system(size: 24))
                        .foregroundColor(Color("Renk1"))
                })
            }
            .padding(.leading,62.5)
            .padding(.trailing,20)
            HStack{
                Text("What do you want to learn today?")
                    .foregroundColor(Color.gray)
                Spacer()
            }
            .padding(.horizontal,20)
        }
        .padding(.top,50)
        
    }
}

struct AllVideosView_Previews: PreviewProvider{
    static var previews: some View {
        AllVideosView()
    }
}
