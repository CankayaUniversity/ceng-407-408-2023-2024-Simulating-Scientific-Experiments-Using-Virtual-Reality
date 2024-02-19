//
//  Home.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.11.2023.
//

import SwiftUI

struct HomePage: View {
    
    let studentName: String
    
    @StateObject var menuData = MenuViewmodel()
    @Namespace var animation
    
    var body: some View {
        
        HStack(spacing: 0){
            //SIDE MENU and HOME_PAGE
            
            //SIDE MENU DEFAULT OLARAK GOZUKMEZ, AMA SHOW_DRAWER TRUE OLURSA GOZUKUR.
            SideMenu(animation: _animation,studentName: studentName)
            
            TabView(selection: $menuData.selectedMenu){
                AllVideosView(studentName: studentName)
                    .tag("All Videos")
                
                Testler()
                    .tag("Testler")
                
                Profile()
                    .tag("Profile")
                
                Settings()
                    .tag("Settings")
                
            }
            .frame(width: UIScreen.main.bounds.width)
        }
        .frame(width: UIScreen.main.bounds.width)
        .navigationBarHidden(true)
        //SHOW DRAWER AKTIF OLDUĞU ZAMAN YANDAN PANEL ACILACAK
        .offset(x: menuData.showDrawer ? 125 : -125)
        .overlay(
            ZStack{
                if !menuData.showDrawer{
                    CloseButton(animation: animation)
                        .padding()
                }
            },alignment: .topLeading
        )
        //Setting As Environment Object...
        //Dor Avoiding Re-Declarations...
        .environmentObject(menuData)
        
    }
}

struct Home_Previews: PreviewProvider {
    static var previews: some View {
        HomePage(studentName: "")
    }
}

