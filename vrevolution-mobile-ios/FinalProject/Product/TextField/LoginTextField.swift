//
//  LoginTextField.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.12.2023.
//

import SwiftUI

struct LoginTextField: View {
    //SISTEM TUTULACAK DEGERI TEMSIL EDER. (EMAIL YA DA PASSWORD)
    @Binding var value: String
    
    //TEXTFIELD'IN ICINDEKİ PLACEHOLDER VE ICON_NAME VERILERI BEKLENIYOR
    var textFieldIconName : String
    var placeHolder: String
    
    var body: some View {
        HStack{
            Image(systemName: textFieldIconName)
                .foregroundColor(.black.opacity(0.6))
            TextField(placeHolder, text: $value)
                .autocorrectionDisabled()
        }
        .padding(.horizontal,15)
        .frame(width: 350,height: 55)
        .background(Color.secondary.opacity(0.03))
        .cornerRadius(10)
        .overlay(
            RoundedRectangle(cornerRadius: 10)
                .stroke(Color.textFieldColor,lineWidth: 0.70)
                .shadow(color:Color.black.opacity(0.25), radius: 3,x: 0,y: 3.2)
        )
    }
}
