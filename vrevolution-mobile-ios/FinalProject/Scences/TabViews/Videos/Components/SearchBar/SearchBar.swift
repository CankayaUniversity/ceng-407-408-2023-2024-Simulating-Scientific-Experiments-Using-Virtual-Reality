//
//  SearchButton.swift
//  FinalProject
//
//  Created by Yiğit Özok on 9.01.2024.
//

import SwiftUI

struct SearchBar: View {
    @State private var searchItem: String = ""
    var body: some View {
        VStack{
            HStack{
                Image(systemName: "magnifyingglass")
                    .foregroundColor(.black.opacity(0.6))
                TextField("Search", text: $searchItem)
                    .autocorrectionDisabled()
            }
            .padding(.horizontal,15)
            .frame(height: 50)
            .cornerRadius(10)
            .overlay{
                RoundedRectangle(cornerRadius: 20)
                    .stroke(Color.textFieldColor, lineWidth: 1)
            }
            .padding(.vertical,20)
            
        }
    }
}


