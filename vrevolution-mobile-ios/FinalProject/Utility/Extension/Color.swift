//
//  Color.swift
//  FinalProject
//
//  Created by Yiğit Özok on 8.12.2023.
//

import Foundation
import SwiftUI
extension Color{
    
    public static var buttonColor : LinearGradient{
        
        LinearGradient(
               colors: [Color("Renk1"), Color("Renk2")],
               startPoint: .topLeading, endPoint: .bottomTrailing
           )
    }
    public static var textFieldColor : Color{
        Color("Renk1")
    }
    
    public static var categeoryColor: LinearGradient{
        
        LinearGradient(colors: [Color("KategoriRenk1"), Color("KategoriRenk2")], startPoint: .topLeading, endPoint: .bottomTrailing)
    }
    
    public static var nonselectedCategeoryColor : LinearGradient{
        LinearGradient(colors: [Color.gray.opacity(0.2), Color.gray.opacity(0.1)], startPoint: .topLeading, endPoint: .bottomTrailing)
    }
    
    public static var loginBackGroundColor: LinearGradient{
        
        LinearGradient(colors: [Color("KategoriRenk1"), Color("KategoriRenk2"),Color("KategoriRenk2").opacity(0.9),Color("KategoriRenk2").opacity(0.7),Color("KategoriRenk2").opacity(0.5),Color("KategoriRenk2").opacity(0.3)], startPoint: .topLeading, endPoint: .bottomTrailing)
    }
}
