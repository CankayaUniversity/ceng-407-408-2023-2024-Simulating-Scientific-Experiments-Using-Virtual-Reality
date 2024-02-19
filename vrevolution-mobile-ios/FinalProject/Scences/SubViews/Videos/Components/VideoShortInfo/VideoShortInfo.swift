//
//  VideoShortInfo.swift
//  FinalProject
//
//  Created by Yiğit Özok on 17.01.2024.
//

import SwiftUI

struct VideoShortInfo: View {
    
    var videoDescription: String?
    var body: some View {
        VStack{
            HStack{
                Text(videoDescription ?? "")
                    .foregroundColor(.black.opacity(0.65))
                    .font(.system(size: 18,weight: .bold))
                Spacer()
            }
            .padding(.leading,10)
            .padding(.bottom,5)
            
            HStack{
                Image(systemName: "timer").font(.system(size: 17))
                Text("1h:35m").font(.system(size: 17))
                Spacer()
                HStack{
                    Text("Test:")
                    Text("5/5")
                        .font(.system(size: 20).weight(.medium))
                }.padding(.trailing,10)
            }
            .foregroundColor(.black.opacity(0.65))
            .padding(.leading,10)
        }
        .frame(width: 225,height: 85)
        .background(.ultraThinMaterial)
        .cornerRadius(15)
        .offset(x:0,y:130)
    }
}

struct VideoShortInfo_Previews: PreviewProvider {
    static var previews: some View {
        VideoShortInfo()
    }
}
