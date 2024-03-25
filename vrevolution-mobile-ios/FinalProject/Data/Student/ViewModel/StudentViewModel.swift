//
//  LoginViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 26.12.2023.
//

import Foundation
import SwiftUI

class StudentViewModel: ObservableObject{
    
   
    
    ///Kayıt olan öğrenciler
    @Published   var studentList : [StudentModel] = []{
        
    didSet{
        if let encoder = try? JSONEncoder().encode(studentList){
            UserDefaults.standard.set(encoder, forKey: "STUDENT_LIST1")
        }
    }
    }
    init(){
        if let data = UserDefaults.standard.data(forKey: "STUDENT_LIST1"){
            if let savedItems = try? JSONDecoder().decode([StudentModel].self, from: data){
                studentList = savedItems
                print(savedItems)
                return
            }
            studentList = []
        }
    }
    
    
    ///REGISTER STUDENT
    func addStudent(userName: String, email: String, password: String){
        let newStudent = StudentModel(userName: userName, email: email, password: password)
        studentList.append(newStudent)
    }
    
    ///WHERE THE REGISTER PAGE, IS ALREADY STUDENT'S ACCOUNT
    func alreadyStudent(userName: String, password: String) -> Bool{
        for student in studentList{
            print(student)
            if student.userName == userName{
                return true
            }
        }
        return false
    }
    
    ///WHERE THE LOGIN PAGE, IS CORRECT INFORMATION STUDENT'S ACCOUNT
    func isEnter(userName: String, password: String) -> Bool {
        for student in studentList{
            if student.userName == userName && student.password == password{
                print("Giris islemi basarili!")
                return true
            }
        }
        return false
    }
}
