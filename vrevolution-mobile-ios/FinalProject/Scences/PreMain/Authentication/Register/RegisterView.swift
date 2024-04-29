//
//  RegisterView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 15.12.2023.
//

import SwiftUI

struct RegisterView: View {
    
    @EnvironmentObject var registerViewModel : RegisterViewModel
    
    var body: some View {
        NavigationStack{
            VStack{
               
                Image("vrevolution")
                    .resizable()

                
                VStack(alignment: .leading){
                    Text("Create Account")
                        .font(.system(size: Fonts.mainTitle.rawValue))
                    
                    VStack(spacing: 25) {
                        LoginTextField(
                            value: $registerViewModel.userName,
                            textFieldIconName: "envelope",
                            placeHolder: "UserName")
                        LoginTextField(
                            value: $registerViewModel.email,
                            textFieldIconName: "key.horizontal",
                            placeHolder: "Email")
                        LoginTextField(
                            value: $registerViewModel.password,
                            textFieldIconName: "key.horizontal",
                            placeHolder: "Confirm Password")
                    }
                }
                
                
                VStack{
                    
                    NavigationLink{
                        LoginView()
                    }label: {
                        AccessButton(title: "Register", onButtonTapAction: registerViewModel.registerButtonAction)
                    }
                    
                    HStack{
                        Text("Already have an account ?")
                            .font(.system(size: Fonts.accountTittle.rawValue))
                            .fontWeight(.light)
                        
                        NavigationLink {
                            LoginView()   
                        }label: {
                            Text("Login")
                                .font(.system(size: Fonts.accountTittle.rawValue))
                                .fontWeight(.semibold)
                                .foregroundColor(Color("Renk1"))
                        }
                    }
                    
                }
            }
            .navigationDestination(
                isPresented: $registerViewModel.isSuccesfullLoginView){ LoginView() }
            .alert("Something is Wrong!", isPresented: $registerViewModel.showFlaseUsePasswordAlert){
                Button("Ok",role: .cancel){}
            }message: { Text("The entered passwords must be the same.") }
            
                .alert("Something is Wrong", isPresented: $registerViewModel.showFalseUsernameAlert){
                    Button("Ok",role: .cancel){}
                }message: { Text("There is already a user with this name") }
        }
    }
    
        
    
  
}
