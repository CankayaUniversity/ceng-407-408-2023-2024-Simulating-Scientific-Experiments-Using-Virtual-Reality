
import SwiftUI

struct Category: View {
    
    var name: String
    var image: String
    
    @EnvironmentObject var menuData: MenuViewmodel
    var animation: Namespace.ID
    
    var onCategoryTapAction: (() ->Void)?

    var body: some View {
        Button(action: {
            withAnimation(.spring()){
                menuData.selectedMenu = name
            }
            onCategoryTapAction?()
        }, label: {
            HStack{
                Image(systemName: image)
                    .font(.title2)
                    .foregroundColor(menuData.selectedMenu == name ? .black : .white)
                
                Text(name)
                    .foregroundColor(menuData.selectedMenu == name ? .black : .white)
            }
            .padding(.horizontal)
            .padding(.vertical,14)
            .frame(width: 200,alignment: .leading)
            
            //SMOOTH SLIDE ANIMATION
            .background(
                ZStack{
                    if menuData.selectedMenu == name{
                        Color.white
                            .cornerRadius(10)
                            .matchedGeometryEffect(id: "TAB", in: animation )
                    }else{
                        Color.clear
                    }
                }
            )
        })
    }
}

