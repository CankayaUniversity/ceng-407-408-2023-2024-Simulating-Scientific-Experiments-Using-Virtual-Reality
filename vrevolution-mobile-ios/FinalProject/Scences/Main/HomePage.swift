//
//  Home.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.11.2023.
//

import SwiftUI

struct HomePage: View {
    @EnvironmentObject var loginViewModel : LoginViewModel
    
    
    @StateObject var menuData = MenuViewmodel()
    
    @Namespace var animation
    
    var body: some View {
        
        HStack(spacing: 0){
            //SIDE MENU and HOME_PAGE
            
            //SIDE MENU DEFAULT OLARAK GOZUKMEZ, AMA SHOW_DRAWER TRUE OLURSA GOZUKUR.
            SideMenu(animation: _animation,studentName: loginViewModel.email)
            
            TabView(selection: $menuData.selectedMenu){
                AllVideosView(studentName: loginViewModel.email)
                    .tag("All Videos")
                
                ClassesView()
                    .tag("Classes")
                
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

