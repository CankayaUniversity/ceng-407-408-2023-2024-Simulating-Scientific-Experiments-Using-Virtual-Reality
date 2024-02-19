//
//  LoginView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 8.12.2023.
//

import SwiftUI

struct LoginView: View {

    @State var password: String = ""
    @State var name   : String = ""
    
    @State var isSuccesfulEnter : Bool = false
    @State var showWarningEnterAlert : Bool = false
    
    @StateObject var studentViewModel = StudentViewModel()
    
    var body: some View {
        NavigationStack{
            VStack{
                Image("vrevolution")
                    .resizable()
                    .padding(.top,30)
                    .padding(.horizontal,20)
                    subMainView
                VStack{
                    AccessButton(title: "Log In", onButtonTapAction: loginButtonAction)
                    HStack{
                        Text("Don't have an account ?")
                            .font(.system(size: Fonts.accountTittle.rawValue))
                            .fontWeight(.light)
                        NavigationLink {
                            RegisterView().environmentObject(studentViewModel)
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
            .navigationDestination(isPresented: $isSuccesfulEnter){
                HomePage(studentName: name)
            }
            .alert("Something is Wrong", isPresented: $showWarningEnterAlert){
                Button("Ok",role: .cancel){}
            }message: { Text("The entered username or password is incorrect!") }
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
                LoginTextField(value: $name, textFieldIconName: "envelope", placeHolder: "Email")
                LoginTextField(value: $password, textFieldIconName: "key.horizontal", placeHolder: "Password")
            }
        }
    }
    
    private func loginButtonAction() {
        isSuccesfulEnter = studentViewModel.isEnter(name: name, password: password)
        if isSuccesfulEnter == false{
            showWarningEnterAlert = true
        }
    }
}


struct LoginView_Previews: PreviewProvider {
    static var previews: some View {
        LoginView()
    }
}
