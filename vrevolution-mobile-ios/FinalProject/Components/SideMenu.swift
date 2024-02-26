//
//  Drawer.swift
//  FinalProject
//
//  Created by Yiğit Özok on 25.11.2023.
//

import SwiftUI

struct SideMenu: View {
    @EnvironmentObject var menuData: MenuViewmodel
    @Environment(\.presentationMode) var presentationMode
    
    //Animation
    @Namespace var animation
    
    var studentName : String
    let menuCategoryList = [
        (name: "All Videos" , image: "books.vertical"),
        (name: "Classes"    , image: "folder"),
        (name: "Profile"    , image: "person"),
        (name: "Settings"   , image: "gear"),
    ]
    var body: some View {
        VStack{
            ///---PROFIL IMAGE AND CLOSE BUTTON---
            HeadProfilView
            
            ///---PROFIL INFORMATION---
            ProfilInformationView
            
            
            //MENU BUTTONS CONTENTS...
            MenuContentsView
            
            ///DIVIDER
            DividerComponent
            
            Spacer()
            
            ///SIGN OUT BUTTON
            SignOutButton
        }
        .frame(width: 250)
        .background(
            Color.categeoryColor
                .ignoresSafeArea(.all,edges: .vertical)
        )
    }
    ///PROFIL IMAGE AND CLOSE BUTTON
    private var HeadProfilView: some View{
        HStack{
            Image("profile")
                .resizable()
                .aspectRatio(contentMode: .fill)
                .frame(width: 65,height: 65)
                .clipShape(Circle())
                
            Spacer()
            
            //Closer Button IS PRESSED
            if menuData.showDrawer{
                CloseButton(animation: animation)
            }
        }
        .padding()
    }
    
    ///FIRST MESSAGE AND PROFIL NAME
    private var ProfilInformationView: some View{
        VStack(alignment: .leading, spacing: 10){
            Text("Hello")
                .font(.title2)
            Text(studentName)
                .font(.title)
                .fontWeight(.heavy)
        }
        .foregroundColor(.white)
        .frame(maxWidth: .infinity,alignment: .leading)
        .padding(.horizontal)
    }
    
    ///MENU BUTTONS
    private var MenuContentsView: some View{
        VStack(spacing: 20){
            ForEach(menuCategoryList, id: \.name) { category in
                Category(name: category.name, image: category.image, animation: animation).environmentObject(menuData)
            }
        }
        .padding(.leading)
        .frame(width: 250,alignment: .leading)
        .padding(.top,30)
        
    }
    
    ///DIVEDER
    private var DividerComponent: some View{
        Divider()
            .background(Color.white)
            .padding(.top,30)
            .padding(.horizontal,25)
    }
    
    ///SIGN OUT
    private var SignOutButton: some View{
        Category(name: "Sign Out", image: "rectangle.righthalf.inset.fill.arrow.right" , menuData: _menuData, animation: animation,onCategoryTapAction: onCategoryTapAction)
            .padding(.bottom)
    }
    
    
    private func onCategoryTapAction(){
        presentationMode.wrappedValue.dismiss()
    }
}
