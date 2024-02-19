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
            UserDefaults.standard.set(encoder, forKey: "STUDENT_LIST")
        }
    }
    }
    init(){
        if let data = UserDefaults.standard.data(forKey: "STUDENT_LIST"){
            if let savedItems = try? JSONDecoder().decode([StudentModel].self, from: data){
                studentList = savedItems
                print(savedItems)
                return
            }
            studentList = []
        }
    }
    
    
    ///REGISTER STUDENT
    func addStudent(name: String, password: String){
        let newStudent = StudentModel(name: name, password: password)
        studentList.append(newStudent)
    }
    
    ///WHERE THE REGISTER PAGE, IS ALREADY STUDENT'S ACCOUNT
    func alreadyStudent(name: String, password: String) -> Bool{
        for student in studentList{
            print(student)
            if student.name == name{
                return true
            }
        }
        return false
    }
    
    ///WHERE THE LOGIN PAGE, IS CORRECT INFORMATION STUDENT'S ACCOUNT
    func isEnter(name: String, password: String) -> Bool {
        for student in studentList{
            if student.name == name && student.password == password{
                print("Giris islemi basarili!")
                return true
            }
        }
        return false
    }
}
