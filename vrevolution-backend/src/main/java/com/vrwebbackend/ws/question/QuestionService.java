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

    public ResponseEntity<Object> getTest3Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Ay'ın kendi ekseni etrafındaki dönüş hareketi ne kadar sürede tamamlanır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"27 gün\", \"text\": \"27 gün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"29 gün\", \"text\": \"29 gün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"27 gün 8 saat\", \"text\": \"27 gün 8 saat\", \"isCorrect\": true }," +
                "{ \"option_id\": \"30 gün\", \"text\": \"30 gün\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Ay'ın evrelerinin oluşması için geçen süre ne kadardır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"15 gün\", \"text\": \"15 gün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"29 gün 12 saat\", \"text\": \"29 gün 12 saat\", \"isCorrect\": true }," +
                "{ \"option_id\": \"1 ay\", \"text\": \"1 ay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"27 gün\", \"text\": \"27 gün\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Dolunay evresinde, Ay'ın parlak tarafı hangi yöne bakar?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş'e\", \"text\": \"Güneş'e\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'ya\", \"text\": \"Dünya'ya\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Uzaya\", \"text\": \"Uzaya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yok\", \"text\": \"Yok\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Hilal evresinde, Dünya'dan bakıldığında Ay hangi harfe benzer?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Düz C\", \"text\": \"Düz C\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ters C\", \"text\": \"Ters C\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Düz D\", \"text\": \"Düz D\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ters D\", \"text\": \"Ters D\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Hangi takvim Ay'ın Dünya etrafındaki hareketini esas alarak yapılmıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Gregoryen Takvim\", \"text\": \"Gregoryen Takvim\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Rumi Takvim\", \"text\": \"Rumi Takvim\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hicri Takvim\", \"text\": \"Hicri Takvim\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mayan Takvimi\", \"text\": \"Mayan Takvimi\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest4Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Mikroskobik canlılar hangi cihazla görülebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Teleskop\", \"text\": \"Teleskop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mikroskop\", \"text\": \"Mikroskop\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Dürbün\", \"text\": \"Dürbün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Büyüteç\", \"text\": \"Büyüteç\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Hangi ortamda mikroskobik canlılar bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Su\", \"text\": \"Su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay\", \"text\": \"Uzay\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Toprak\", \"text\": \"Toprak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Hangi mikroskobik canlı hastalıklara neden olabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bakteriler\", \"text\": \"Bakteriler\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mayalar\", \"text\": \"Mayalar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mantarlar\", \"text\": \"Mantarlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Algler\", \"text\": \"Algler\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Mantarlar hangi besinlerin küflenmesine neden olabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ekmek ve limon\", \"text\": \"Ekmek ve limon\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Peynir ve yoğurt\", \"text\": \"Peynir ve yoğurt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elma ve portakal\", \"text\": \"Elma ve portakal\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sebze ve meyve\", \"text\": \"Sebze ve meyve\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Çiçekli bitkiler hangi organla ürer?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Kök\", \"text\": \"Kök\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yaprak\", \"text\": \"Yaprak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çiçek\", \"text\": \"Çiçek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gövde\", \"text\": \"Gövde\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest5Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Hangi bitki çiçeksizdir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Çam ağacı\", \"text\": \"Çam ağacı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gülyağı\", \"text\": \"Gülyağı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ayçiçeği\", \"text\": \"Ayçiçeği\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gül\", \"text\": \"Gül\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Hangi hayvan omurgalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yılan\", \"text\": \"Yılan\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sünger\", \"text\": \"Sünger\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sülük\", \"text\": \"Sülük\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Denizyıldızı\", \"text\": \"Denizyıldızı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Hangi omurgalı hayvan suda yaşar?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Penguen\", \"text\": \"Penguen\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Tavuk\", \"text\": \"Tavuk\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yılan\", \"text\": \"Yılan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"At\", \"text\": \"At\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Hangi omurgasız hayvan karada yaşar?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Balık\", \"text\": \"Balık\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Karides\", \"text\": \"Karides\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ahtapot\", \"text\": \"Ahtapot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Salyangoz\", \"text\": \"Salyangoz\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Hangi omurgalı hayvan yumurta ile çoğalır?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Fare\", \"text\": \"Fare\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kartal\", \"text\": \"Kartal\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Timsah\", \"text\": \"Timsah\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Tilki\", \"text\": \"Tilki\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest6Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Mikroskobik canlılar hangi ortamlarda bulunabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Uzayda ve havada\", \"text\": \"Uzayda ve havada\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Suda ve toprakta\", \"text\": \"Suda ve toprakta\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Suda ve uzayda\", \"text\": \"Suda ve uzayda\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Toprakta ve havada\", \"text\": \"Toprakta ve havada\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Hangi mikroskobik canlı besinlerin bozulmasına neden olabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bakteriler\", \"text\": \"Bakteriler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mantarlar\", \"text\": \"Mantarlar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Algler\", \"text\": \"Algler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Protozoalar\", \"text\": \"Protozoalar\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Hangi çiçekli bitki yumurta ile çoğalır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gül\", \"text\": \"Gül\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buğday\", \"text\": \"Buğday\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Açelya\", \"text\": \"Açelya\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Orkide\", \"text\": \"Orkide\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Hangi omurgalı hayvanlar doğurarak çoğalır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Balıklar\", \"text\": \"Balıklar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kurbağalar\", \"text\": \"Kurbağalar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kuşlar\", \"text\": \"Kuşlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Memeliler\", \"text\": \"Memeliler\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Hangi omurgasız hayvanlar denizlerde yaşar?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Örümcekler\", \"text\": \"Örümcekler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akrepler\", \"text\": \"Akrepler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Denizyıldızları\", \"text\": \"Denizyıldızları\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Salyangozlar\", \"text\": \"Salyangozlar\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

}
