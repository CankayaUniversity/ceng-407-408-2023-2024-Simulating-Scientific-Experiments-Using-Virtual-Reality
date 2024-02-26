//
//  ClassButton.swift
//  FinalProject
//
//  Created by Yiğit Özok on 20.02.2024.
//

import SwiftUI

struct ClassButton: View {
  
    var title: String
    var onButtonTapAction: (() -> Void)?
   
    var body: some View {
        Button(action: {
            onButtonTapAction?()
        },label: {
            HStack{
                Spacer()
                Text(title)
                    .fontWeight(.bold)
                    .foregroundColor(Color.white)
                    .font(.system(size: 24))
                    .padding(.leading,20)
                Spacer()
                Image(systemName: "arrowtriangle.down.fill")
                    .font(.system(size: 14))
                    .foregroundColor(Color.white).opacity(0.7)
                    .padding(.trailing,20)
            }
        })
        .frame(width: 325,height: 60)
        .background(Color.classesViewBackGroundColorButton)
        .clipShape(RoundedRectangle(cornerRadius: 10))
       
    }
}

