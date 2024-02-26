//
//  DetailsViewVideo.swift
//  FinalProject
//
//  Created by Yiğit Özok on 17.01.2024.
//

import SwiftUI

struct DetailsViewVideo: View {
    
    @Binding var showVideoDetailView: Bool
    @Binding var selectedVideo: VideoModel?
    @Binding var detens: PresentationDetent
    ///Color Sceheme
    @Environment(\.colorScheme) private var scheme
    var body: some View {
        if detens == .medium{
            VStack{
                GeometryReader(content: { geometry in
                    let size = geometry.size
                    
                    if let selectedVideo {
                        Image(selectedVideo.videoImageName)
                            .resizable()
                            .aspectRatio(contentMode: .fill)
                            .frame(width: size.width, height: size.height)
                            .overlay{
                                let color = scheme == .dark ? Color.black : Color.white
                                LinearGradient(colors: [
                                    .clear,
                                    .clear,
                                    .clear,
                                    color.opacity(0.1),
                                    color.opacity(0.5),
                                    color.opacity(0.9),
                                    color
                                    
                                ], startPoint: .top, endPoint: .bottom)
                            }
                            .clipped()
                        
                    }
                })
                .frame(maxHeight: .infinity)
                .overlay{
                    VStack{
                        HStack{
                            Button(action: {
                                /// Closing Profile
                                showVideoDetailView = false
                            }, label: {
                                CancelButtonIcon()
                            })
                            .padding([.top, .leading], 20)
                            Spacer()
                            
                        }
                        Spacer()
                        PlayButtonIcon()
                        Spacer()
                        Text(selectedVideo?.videoTitle ?? "")
                            .font(.system(size: 26,weight: .medium))
                            .padding(.bottom, 5)
                        
                        
                    }
                }
                
                HStack{
                    VStack(alignment: .leading, spacing: 15){
                        
                        Text("Descripton")
                            .font(.system(size: 20, weight: .medium))
                        Text(selectedVideo?.videoDescription ?? "")
                            .foregroundColor(.gray)
                    }
                    .padding(.horizontal, 15)
                    Spacer()
                }
                Spacer()
                
                 
            }
        }
        if detens == .large{
            VStack{
                GeometryReader(content: { geometry in
                    let size = geometry.size
                    
                    if let selectedVideo {
                        Image(selectedVideo.videoImageName)
                            .resizable()
                            .aspectRatio(contentMode: .fill)
                            .frame(width: size.width, height: size.height)
                            .overlay{
                                let color = scheme == .dark ? Color.black : Color.white
                                LinearGradient(colors: [
                                    .clear,
                                    .clear,
                                    .clear,
                                    color.opacity(0.1),
                                    color.opacity(0.5),
                                    color.opacity(0.9),
                                    color
                                    
                                ], startPoint: .top, endPoint: .bottom)
                            }
                            .clipped()
                        
                    }
                })
                .frame(maxHeight: 350)
                .overlay{
                    
                    VStack{
                        HStack{
                            Button(action: {
                                /// Closing Profile
                                showVideoDetailView = false
                            }, label: {
                                CancelButtonIcon()
                            })
                            .padding([.top, .leading], 20)
                            Spacer()
                            
                        }
                        Spacer()
                        PlayButtonIcon()
                        Spacer()
                        Text(selectedVideo?.videoTitle ?? "")
                            .font(.system(size: 26,weight: .medium))
                            .padding(.bottom, 5)
                        
                        
                    }
                }
                ScrollView{
                    HStack{
                        VStack(alignment: .leading, spacing: 20){
                            
                            Text("Descripton")
                                .font(.system(size: 20, weight: .medium))
                            
                            
                            Text(selectedVideo?.videoDescription ?? "")
                                .foregroundColor(.gray)
                            
                            
                            Text("Information")
                                .font(.system(size: 20, weight: .medium))
                            VStack(spacing: 10){
                                
                                HStack(spacing: 25){
                                    Label("12h 35m", systemImage: "clock")
                                    Label("Quiz Sayısı: 5", systemImage: "list.bullet.clipboard")
                                    Spacer()
                                }
                                
                                HStack{
                                    Image("vrgozluk")
                                        .resizable()
                                        .frame(width: 30, height: 30)
                                    Text("VR")
                                    Spacer()
                                }
                            }
                            .font(.system(size: 20))
                            
                            Text("Quiz")
                                .font(.system(size: 20, weight: .medium))
                            Text("Lütfen girmek istediğiniz quiz'in sınıfını seçin.")
                                .foregroundColor(.gray)
                            HStack(spacing: 100){
                                Button(action: {
                                    
                                }, label: {
                                    Text("5.Sınıf")
                            
                                })
                                
                                Button(action: {
                                    
                                }, label: {Text("6.Sınıf")})
                                   
                                Button(action: {
                                    
                                }, label: {Text("7.Sınıf")})
                                  
                            }
                            
                        }
                        Spacer()
                    }
                    .padding(.horizontal, 15)
                    Spacer()
                }

            }
          
        }
    }
}
