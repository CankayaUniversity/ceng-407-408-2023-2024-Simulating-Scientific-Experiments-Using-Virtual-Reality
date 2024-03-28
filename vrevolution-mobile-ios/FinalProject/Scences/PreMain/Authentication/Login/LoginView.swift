//
//  LoginView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 8.12.2023.
//

import SwiftUI

struct LoginView: View {
    
    //Kayıt olma işlemleri için...
    @StateObject var registerViewModel = RegisterViewModel()
    
    //Login olma işlemleri için..
    @StateObject var loginViewModel = LoginViewModel()
    
    var body: some View {
        NavigationStack{
            VStack{
                Image("vrevolution")
                    .resizable()
                    .padding(.top,30)
                    .padding(.horizontal,20)
                    subMainView
                
                VStack{
                    NavigationLink{
                        HomePage()
                            .environmentObject(loginViewModel)
                    } label: {
                        AccessButton(title: "Log In", onButtonTapAction: loginViewModel.loginButtonAction )
                    }
                   
                    HStack{
                        Text("Don't have an account ?")
                            .font(.system(size: Fonts.accountTittle.rawValue))
                            .fontWeight(.light)
                        NavigationLink{
                            RegisterView()
                                .environmentObject(registerViewModel)
                                
                        }label: {
                            Text("Register")
                                .font(.system(size: Fonts.accountTittle.rawValue))
                                .fontWeight(.semibold)
                            .foregroundColor(Color("Renk1"))
                        }
                        
                    }
                }
               
               
                
                .padding(.bottom,20)
            }
            .navigationDestination(isPresented: $loginViewModel.isSuccesfullHomePageView){
                HomePage()
                    .environmentObject(loginViewModel)
            }
            .alert("Something is Wrong!", isPresented: $loginViewModel.showFalseUserInfoAlert){
                Button("Ok",role: .cancel){}
            }message: { Text("Please check email or password.") }
            
        }
    }
    
    //SUB_MAIN VIEW
    private var subMainView: some View{
        VStack(alignment: .leading){
            VStack(alignment: .leading,spacing: 5){
                Text("Welcome Back")
                    .font(.system(size: Fonts.mainTitle.rawValue))
                Text("Please login with your information")
                    .font(.system(size: Fonts.subTitle.rawValue))
                    .fontWeight(.light)
                    .padding(.bottom,25)
            }
            VStack(spacing: 30){
                LoginTextField(value: $loginViewModel.email, textFieldIconName: "envelope", placeHolder: "Email")
                LoginTextField(value: $loginViewModel.password, textFieldIconName: "key.horizontal", placeHolder: "Password")
            }
        }
    }
   
}


