//
//  RegisterView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 15.12.2023.
//

import SwiftUI

struct RegisterView: View {
    
    @State var name   : String = ""
    @State var password: String = ""
    @State var confirmPassword : String = ""
    @State var isSuccesfulyBackLoginView : Bool = false
    
    @State var showPassordConfirmAlert : Bool = false
    @State var showAlreayAccountAlert : Bool = false
    
    @EnvironmentObject var studentViewModel: StudentViewModel
    
    var body: some View {
        NavigationStack{
            VStack{
               
                Image("vrevolution")
                    .resizable()
                    
                
                VStack(alignment: .leading){
                    Text("Create Account")
                        .font(.system(size: Fonts.mainTitle.rawValue))
                    VStack(spacing: 25) {
                        LoginTextField(value: $name, textFieldIconName: "envelope", placeHolder: "Email")
                        LoginTextField(value: $password, textFieldIconName: "key.horizontal", placeHolder: "Password")
                        LoginTextField(value: $confirmPassword, textFieldIconName: "key.horizontal", placeHolder: "Confirm Password")
                    }
                }
                VStack{
                    AccessButton(title: "Register",
                                 onButtonTapAction: registerButtonAction)
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
            .navigationDestination(isPresented: $isSuccesfulyBackLoginView){
                LoginView()
            }
            .alert("Something is Wrong!", isPresented: $showPassordConfirmAlert){
                Button("Ok",role: .cancel){}
            }message: { Text("The entered passwords must be the same.") }
            
                .alert("Something is Wrong", isPresented: $showAlreayAccountAlert){
                    Button("Ok",role: .cancel){}
                }message: { Text("There is already a user with this name") }
        }
    }
    
    private func registerButtonAction() {
        
        if password == confirmPassword{
            showPassordConfirmAlert = false
            if studentViewModel.alreadyStudent(name: name, password: password) == false{
                studentViewModel.addStudent(name: name, password: password)
                isSuccesfulyBackLoginView = true
            }else{
                showAlreayAccountAlert = true
            }
        }
        else {
            showPassordConfirmAlert = true
        }
    }
}
struct RegisterView_Previews: PreviewProvider {
    static var previews: some View {
        RegisterView()
    }
}
