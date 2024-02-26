//
//  AllVideosViewModel.swift
//  FinalProject
//
//  Created by Yiğit Özok on 16.01.2024.
//

import Foundation
import SwiftUI

class AllVideoViewModel: ObservableObject{
    
    @Published var selectedCategoryVideo = "Uzay"
}
struct VideoCategoryModel: Hashable, Identifiable{
    var id = UUID()
    var name: String
    var isCategoryListSelected: Bool
}
