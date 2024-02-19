//
//  AccessButton.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.12.2023.
//

import SwiftUI

struct AccessButton: View {
    
    let title: String
    var onButtonTapAction: (() ->Void)?
    
    var body: some View {
        Button(action: {
            onButtonTapAction?()
        },label:{
            Text(title)
                .foregroundColor(.white)
                .fontWeight(.medium)
        })
        .frame(width: 300,height: 50)
        .background(Color.buttonColor)
        .clipShape(RoundedRectangle(cornerRadius: 15))
        .shadow(color:Color.black.opacity(0.5), radius: 3,x: 0,y: 3.2)
        .padding(.bottom,20)
        .padding(.top,40)
    }
}

