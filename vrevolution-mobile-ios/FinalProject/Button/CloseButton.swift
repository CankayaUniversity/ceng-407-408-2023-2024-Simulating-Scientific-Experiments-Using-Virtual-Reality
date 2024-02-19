//
//  CloserMenuButton.swift
//  FinalProject
//
//  Created by Yiğit Özok on 26.12.2023.
//

import SwiftUI

struct CloseButton: View {
    @EnvironmentObject var menuData: MenuViewmodel
    
    var animation: Namespace.ID
    
    var body: some View{
        Button(action: {
            withAnimation(.easeOut){
                menuData.showDrawer.toggle()
            }
        }, label: {
            VStack(spacing: 5){
                Capsule()
                    .fill(menuData.showDrawer ? Color.white : Color.primary)
                    .frame(width: 35,height: 3)
                
                //EN YUKARIDAKI CIZGI'YI CARPI YAPMAK ICIN -50 YAPIYORUZ.
                    .rotationEffect(.init(degrees: menuData.showDrawer ? -50 : 0))
                    .offset(x: menuData.showDrawer ? 2 : 0, y:menuData.showDrawer ? 9 : 0)
                VStack(spacing: 5){
                    Capsule()
                        .fill(menuData.showDrawer ? Color.white : Color.primary)
                        .frame(width: 35,height: 3)
                        .offset(y: menuData.showDrawer ? 0 : 0)
                    Capsule()
                        .fill(menuData.showDrawer ? Color.white : Color.primary)
                        .frame(width: 35,height: 3)
                        .offset(y: menuData.showDrawer ? -8 : 0)
                }
                // CIZGIYI CARPMAK ICIN DIGER TARAFIDA UYGUN HALE GETIRIYORUZ (X)
                .rotationEffect(.init(degrees: menuData.showDrawer ? 50 : 0))
                
            }
        })
        //CARPI BOYUTUNU OLCEKLERİNİ KORUYARAK BIRAZ KUCULTUYORUZ
        .scaleEffect(0.8)
        .matchedGeometryEffect(id: "MENU_BUTTON", in: animation)
    }
}

