//
//  PlayButtonIcon.swift
//  FinalProject
//
//  Created by Yiğit Özok on 17.01.2024.
//

import SwiftUI

struct CancelButtonIcon: View {
    var body: some View {
        Image(systemName: "xmark")
            .font(.title3)
            .foregroundStyle(.white)
            .contentShape(Rectangle())
            .padding(10)
            .background(.ultraThinMaterial, in: Circle())
    }
}

