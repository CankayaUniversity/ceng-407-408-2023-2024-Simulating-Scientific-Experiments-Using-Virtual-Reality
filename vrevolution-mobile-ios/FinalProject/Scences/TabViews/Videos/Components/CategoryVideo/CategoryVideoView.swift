//
//  RecentLearningView.swift
//  FinalProject
//
//  Created by Yiğit Özok on 11.01.2024.
//

import SwiftUI

struct CategoryVideoView: View {
    @StateObject var videoListData =  VideoViewModel()
    @StateObject var videoCategory =  AllVideoViewModel()
    
    @State private var showVideoDetailView: Bool = false
    @State private var selectedVideo: VideoModel?
    @State private var detens: PresentationDetent = .medium
    
    var videoCategoryList = ["5.Sınıf","6.Sınıf","7.Sınıf"]
    var body: some View {
        VStack(spacing: 40){
            HStack{
                Text("Popular videos")
                    .font(.system(size: 20,weight: .semibold))
                Spacer()
            }
            
            ///CATEGORY VIEW WHICH SELECTED
            CategoryInfoView
            
            ///PREVIEW VIDEO VIEW
            PreviewVideoView
            
             
        }
        .padding(.leading,20)
    
    }
    private var CategoryInfoView : some View{
        ScrollView(.horizontal,showsIndicators: false){
            HStack(spacing: 20){
                ForEach(videoCategoryList,id: \.self){item in
                    
                    Button(action: {
                        withAnimation(.spring(response: 1,dampingFraction: 0.5, blendDuration: 4)){
                            videoCategory.selectedCategoryVideo = item
                        }
                    }, label: {
                        Text(item)
                            .fontWeight(.medium)
                            .foregroundColor(videoCategory.selectedCategoryVideo == item ? Color.white : Color.gray.opacity(0.75))
                    }
                    )
                    .frame(width: 136, height: 54)
                    .background(videoCategory.selectedCategoryVideo == item ? Color.categeoryColor : Color.nonselectedCategeoryColor)
                    .foregroundColor(Color.white)
                    .clipShape(RoundedRectangle(cornerRadius: 20))
                }
            }
        }
    }
    
    private var PreviewVideoView : some View{
        ScrollView(.horizontal,showsIndicators: false){
            HStack(spacing: 25){
                
                ForEach(videoListData.videoList){item in
                    
                    ZStack{
                        Image(item.videoImageName)
                            .resizable()
                            .aspectRatio(contentMode: .fill)
                            .frame(width: 275, height: 400)
                            .clipShape(RoundedRectangle(cornerRadius: 20))
                            .onTapGesture {
                                
                                ///Opening video detail view
                                selectedVideo = item
                                showVideoDetailView.toggle()
                                
                            }
                        
                        PlayButtonIcon()
                            .offset(x:0,y:-30)
                        
                        VideoShortInfo(videoDescription: item.videoTitle)
                        
                    }
                 
                }
                 
            }
        }
    
        .sheet(isPresented: $showVideoDetailView){
            DetailsViewVideo(
                showVideoDetailView: $showVideoDetailView,
                selectedVideo: $selectedVideo,
                detens: $detens
            )
            .presentationDetents([.medium, .large], selection: $detens)
            .interactiveDismissDisabled()
        }
     
    }
    
}



