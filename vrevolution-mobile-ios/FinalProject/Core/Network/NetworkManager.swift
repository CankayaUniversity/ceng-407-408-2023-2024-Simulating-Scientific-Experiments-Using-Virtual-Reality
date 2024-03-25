//
//  NetworkManager.swift
//  FinalProject
//
//  Created by Yiğit Özok on 1.03.2024.
//

import Foundation
import SwiftUI



class NetworkManager : ObservableObject{
    /// Bu kod, bir ağ isteği göndermek için kullanılan bir işlevi tanımlar. İşlev, genel olarak bir web API'sine istek yapar.
    /// API'den gelen veriyi belirli bir tipe(genertic type) çözer ve sonucu bir kapanış(closure) aracılığıyla geri döndürür.
    /// - Parameters:
    ///   - type: Geri dönüş değerinin türünü belirtir. Bu işlev çağrılması sırasında istenen veri türüdür.
    ///   - url: İstek yapılacak URL'yi belirtir.
    ///   - method: HTTP isteğinin methodunu belirtir.(GET, POST, vb.)
    ///   - completion: İşlemin tamamlanmasından sonra çağrılacak kapanıştır. Kapanış, sonucu 'Result' türünde ve belirli bir 'ErrorTypes' enumu ile döndürür.

    var headers: [String: String] = [:]
    
    init(){
        headers["Content-Type"] = "application/json"
    }
    
    @Published var users: [StudentModel] = []

    func request<T: Codable>(
        type: T.Type,
        url: String,
        endPoint: NetworkPath.Endpoints,
        bodyParameters: Data?,
        method: NetworkPath.HTTPMethods,
        completion: @escaping((Result<T, ErrorTypes>)->())){
        
            let session = URLSession.shared ///Veri indirme ve yükleme gibi ağ işlemleri için kullanılır.
        
        ///Belirtilen URL'nin geçerli olup olmadığı kontrol edilir. Eğer URL geçerli ise 'if let' bloğu içine girilir.
            if let url = URL(string: url + endPoint.rawValue){
                var request = URLRequest(url: url)///URLRequest isteği oluşturulur ve belirtilen URL'ye göndermek üzere hazırlanır.
                request.httpMethod = method.rawValue///'method' parameetresinden alınan  HTTP yöntemi(GET,POST, vs.) ile ayarlanır.
                request.cachePolicy = URLRequest.CachePolicy.reloadIgnoringLocalAndRemoteCacheData
                request.timeoutInterval = 60
                request.allHTTPHeaderFields = headers
                request.httpBody = bodyParameters
                
            ///Bu satırda, 'session' adlı bir URLSession' nesnesinin 'dataTask(with: )' metodunu kullanarak bir 'URLSessionDataTask' oluşturuluyor.
            ///Bu method, belirtilen 'URLRequest' nesnesiyle bir ağ isteği yapmak için kullanılır. Bu istek, belirtilen URL' ye gönderilir ve yanıt beklenir.
            let dataTask = session.dataTask(with: request){data, response, error in
                
                if let _ = error{
                    completion(.failure(.generalError))
                    
                }else if let data = data{
                    print(data.data ?? "")
                    self.handleResponse(data: data){response in
                        completion(response)
                    }
                }else {
                    completion(.failure(.invalidUrl))
                    print("error url")
                }
            }
            
            ///'dataTask' değerini atadıktan sora isteğin gerçekleşmesi için 'dataTask.resume()' çağrılması gerekir. Bu çağrı, 'URLSessionDataTask' nesnesinin
            ///işlemi başatılmasını sağlar veisteği sunucuya gönderir. Sonu. beklenirken, belirtiken URL'den yanıt alınacaktır. Bu yanıtı ele almak için cloure kuallnılır,
            ///ve closure içinde gerekli işlemler yapılır.
            dataTask.resume()
        }
    }
        
    fileprivate func handleResponse<T: Codable>(data: Data, completion: @escaping ((Result<T, ErrorTypes>) -> ())) where T : Decodable {
        do {
            let result = try JSONDecoder().decode(T.self, from: data)
            print(result)
            completion(.success(result))
            
        } catch let decodingError as DecodingError {
            print("Decoding error occurred: \(decodingError.localizedDescription)")
            completion(.failure(.invalidData))
            
        } catch {
            print("An unexpected error occurred: \(error.localizedDescription)")
            completion(.failure(.generalError))
        }
    }
    
}

extension Encodable {
    public var data: Data? {
        get {
            return try? JSONEncoder().encode(self)
        }
    }
}
