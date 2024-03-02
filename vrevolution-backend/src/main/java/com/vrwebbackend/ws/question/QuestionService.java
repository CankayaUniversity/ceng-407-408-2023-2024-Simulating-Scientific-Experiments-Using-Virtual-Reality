package com.vrwebbackend.ws.question;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService
{
    public ResponseEntity<Object> getTest1Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Güneş'in dönüş yönü nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saat yönünün tersine\", \"text\": \"Saat yönünün tersine\", \"isCorrect\": true }," +
                "{ \"option_id\": \" Saat yönünde\", \"text\": \" Saat yönünde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğudan batıya\", \"text\": \"Doğudan batıya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Batıdan doğuya\", \"text\": \"Batıdan doğuya\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Dünya'nın kendi ekseni etrafındaki dönüş hareketi nasıl gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saat yönünün tersine\", \"text\": \"Saat yönünün tersine\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Saat yönünde\", \"text\": \"Saat yönünde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğudan batıya\", \"text\": \"Doğudan batıya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Batıdan doğuya\", \"text\": \"Batıdan doğuya\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Dünya'nın Güneş etrafında dolanma süresi kaç gündür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \" 24 saat\", \"text\": \" 24 saat\", \"isCorrect\": false }," +
                "{ \"option_id\": \" 365 gün 6 saat\", \"text\": \" 365 gün 6 saat\", \"isCorrect\": true }," +
                "{ \"option_id\": \"30 gün\", \"text\": \"30 gün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"12 saat\", \"text\": \"12 saat\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \" Ay'ın kendi ekseni etrafındaki dönüş hareketi hangi yönde gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saat yönünün tersine\", \"text\": \"Saat yönünün tersine\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Saat yönünde\", \"text\": \"Saat yönünde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğudan batıya\", \"text\": \"Doğudan batıya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Batıdan doğuya\", \"text\": \"Batıdan doğuya\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Ay, Dünya etrafında dolanma hareketini hangi yönde yapar?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Saat yönünün tersine\", \"text\": \"Saat yönünün tersine\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Saat yönünde\", \"text\": \"Saat yönünde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğudan batıya\", \"text\": \"Doğudan batıya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Batıdan doğuya\", \"text\": \"Batıdan doğuya\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest2Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Ay'ın atmosferi hakkında aşağıdaki ifadelerden hangisi doğrudur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ay'da yoğun bir atmosfer bulunmaktadır.\", \"text\": \"Ay'da yoğun bir atmosfer bulunmaktadır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın atmosferi, hava olaylarına izin veren bir yapıya sahiptir.\", \"text\": \"Ay'ın atmosferi, hava olaylarına izin veren bir yapıya sahiptir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın atmosferi yok denecek kadar azdır.\", \"text\": \"Ay'ın atmosferi yok denecek kadar azdır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ay, atmosferi nedeniyle yağışlı bir gezegen gibidir.\", \"text\": \"Ay, atmosferi nedeniyle yağışlı bir gezegen gibidir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Ay'daki gece ve gündüz sıcaklık farkının nedeni nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ay'ın atmosferindeki gazlar\", \"text\": \"Ay'ın atmosferindeki gazlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın atmosferinin olmaması\", \"text\": \"Ay'ın atmosferinin olmaması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ay'ın yer çekimi etkisi\", \"text\": \"Ay'ın yer çekimi etkisi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın yüzeyindeki su varlığı\", \"text\": \"Ay'ın yüzeyindeki su varlığı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Ay'a giden astronotların bıraktığı ayak izleri hakkında aşağıdaki ifadelerden hangisi doğrudur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ayak izleri zamanla kaybolur ve silinir.\", \"text\": \"Ayak izleri zamanla kaybolur ve silinir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın atmosferi nedeniyle izler bozulmaz.\", \"text\": \"Ay'ın atmosferi nedeniyle izler bozulmaz.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ayak izleri, Ay'ın ince toz tabakasında kalıcıdır.\", \"text\": \"Ayak izleri, Ay'ın ince toz tabakasında kalıcıdır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ay'ın yüzeyi sıcaklığı nedeniyle izler kaybolur.\", \"text\": \"Ay'ın yüzeyi sıcaklığı nedeniyle izler kaybolur.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Ay'da yaşam olmamasının nedenleri arasında aşağıdaki ifadelerden hangisi yer almaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Atmosferin olmaması\", \"text\": \"Atmosferin olmaması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yer çekiminin az olması\", \"text\": \"Yer çekiminin az olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gece ve gündüz sıcaklık farkı\", \"text\": \"Gece ve gündüz sıcaklık farkı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın atmosferinin zengin gazlar içermesi\", \"text\": \"Ay'ın atmosferinin zengin gazlar içermesi\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Ayda yaşam olması için önerilen çözümler arasında aşağıdaki ifadelerden hangisi yer almaz?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Canlıların yaşayabileceği fanuslar yapılabilir.\", \"text\": \"Canlıların yaşayabileceği fanuslar yapılabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın yer altında yaşam alanları kurulabilir.\", \"text\": \"Ay'ın yer altında yaşam alanları kurulabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gündüz ve gece arasındaki zaman farkı dengelemelidir.\", \"text\": \"Gündüz ve gece arasındaki zaman farkı dengelemelidir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ay'ın yüzeyinde su kaynakları aranmalıdır.\", \"text\": \"Ay'ın yüzeyinde su kaynakları aranmalıdır.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}
