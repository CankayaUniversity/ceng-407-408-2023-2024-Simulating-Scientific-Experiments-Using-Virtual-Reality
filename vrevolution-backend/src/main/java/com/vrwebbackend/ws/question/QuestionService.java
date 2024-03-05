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

    public ResponseEntity<Object> getTest7Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Kuvvet nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Cisimleri ağırlıkla doldurma\", \"text\": \"Cisimleri ağırlıkla doldurma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Duran bir cismi hareket ettirme veya hareket eden bir cismi durdurma etkisi\", \"text\": \"Duran bir cismi hareket ettirme veya hareket eden bir cismi durdurma etkisi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Işığın yansıması\", \"text\": \"Işığın yansıması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sesin yayılması\", \"text\": \"Sesin yayılması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Hangisi kuvvetin cisimler üzerindeki etkilerinden biri değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Cismin dönmesini sağlayabilir.\", \"text\": \"Cismin dönmesini sağlayabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin rengini değiştirebilir.\", \"text\": \"Cismin rengini değiştirebilir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hareket eden cismi durdurabilir.\", \"text\": \"Hareket eden cismi durdurabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin şeklini değiştirebilir.\", \"text\": \"Cismin şeklini değiştirebilir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Kuvvetin birimi nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Volt\", \"text\": \"Volt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Newton\", \"text\": \"Newton\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kilogram\", \"text\": \"Kilogram\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Dinamometre hangi fiziksel büyüklüğü ölçer?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hacim\", \"text\": \"Hacim\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağırlık\", \"text\": \"Ağırlık\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sıcaklık\", \"text\": \"Sıcaklık\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Basınç\", \"text\": \"Basınç\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Hangisi esnek bir cisim değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\":\"Yay\", \"text\": \"Yay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sünger\", \"text\": \"Sünger\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kağıt\", \"text\": \"Kağıt\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Lastik\", \"text\": \"Lastik\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest8Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Bir cismi hareket ettiren etkiye ne denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İvmelenme\", \"text\": \"İvmelenme\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hızlanma\", \"text\": \"Hızlanma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kuvvet\", \"text\": \"Kuvvet\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sürtünme\", \"text\": \"Sürtünme\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Dinamometrelerde hangi özellik kuvvet ölçümünde etkilidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yayın rengi\", \"text\": \"Yayın rengi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yayın kalınlığı\", \"text\": \"Yayın kalınlığı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yayın uzunluğu\", \"text\": \"Yayın uzunluğu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yayın esnekliği\", \"text\": \"Yayın esnekliği\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Esnek bir cisim hangi durumda şeklini değiştirebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kuvvet uygulanırken\", \"text\": \"Kuvvet uygulanırken\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kuvvet uygulanmadığı zaman\", \"text\": \"Kuvvet uygulanmadığı zaman\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sabit bir hızda hareket ederken\", \"text\": \"Sabit bir hızda hareket ederken\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dururken\", \"text\": \"Dururken\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Dinamometreler hangi fiziksel ilkeye dayanarak çalışır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Elektromanyetizma\", \"text\": \"Elektromanyetizma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Optik prensipler\", \"text\": \"Optik prensipler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kuvvetin etkisi\", \"text\": \"Kuvvetin etkisi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Esneklik prensibi\", \"text\": \"Esneklik prensibi\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Kuvvetin birimi olan Newton, aşağıdaki fizikçilerden hangisinin adını taşır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Albert Einstein\", \"text\": \"Albert Einstein\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Isaac Newton\", \"text\": \"Isaac Newton\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Galileo Galilei\", \"text\": \"Galileo Galilei\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Nikola Tesla\", \"text\": \"Nikola Tesla\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest9Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Hangisi doğru bir ifadedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kuvvet, sadece cisimleri durdurabilir, hareket ettiremez.\", \"text\": \"Kuvvet, sadece cisimleri durdurabilir, hareket ettiremez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinamometrelerin içinde bulunan yay, ne kadar kalınsa o kadar esnektir.\", \"text\": \"Dinamometrelerin içinde bulunan yay, ne kadar kalınsa o kadar esnektir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Esnek cisimler, kuvvet uygulandığında kesinlikle şekillerini değiştirirler.\", \"text\": \"Esnek cisimler, kuvvet uygulandığında kesinlikle şekillerini değiştirirler.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinamometre, ağırlık ölçmek için kullanılırken, kuvvetin büyüklüğünü ölçmek için kullanılmaz.\", \"text\": \"Dinamometre, ağırlık ölçmek için kullanılırken, kuvvetin büyüklüğünü ölçmek için kullanılmaz.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Bir cismi durduran kuvvetin miktarını ölçmek için hangisi kullanılır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Termometre\", \"text\": \"Termometre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Barometre\", \"text\": \"Barometre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinamometre\", \"text\": \"Dinamometre\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hidrometre\", \"text\": \"Hidrometre\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Esnek cisimlerin özelliği aşağıdakilerden hangisiyle açıklanabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sürtünme kuvveti\", \"text\": \"Sürtünme kuvveti\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Esneklik prensibi\", \"text\": \"Esneklik prensibi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kütle çekimi\", \"text\": \"Kütle çekimi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Basınç\", \"text\": \"Basınç\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Hangi durumda bir cismin hızını değiştiren kuvvet uygulanmış olabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Cismin yönü değişirken\", \"text\": \"Cismin yönü değişirken\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Cisim dururken\", \"text\": \"Cisim dururken\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin ağırlığı artarken\", \"text\": \"Cismin ağırlığı artarken\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin şekli değişirken\", \"text\": \"Cismin şekli değişirken\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Bir dinamometrede yayın kalınlığı arttıkça ne olur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ölçülen kuvvet artar\", \"text\": \"Ölçülen kuvvet artar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ölçülen kuvvet azalır\", \"text\": \"Ölçülen kuvvet azalır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ölçülen kuvvet değişmez\", \"text\": \"Ölçülen kuvvet değişmez\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinamometre bozulur\", \"text\": \"Dinamometre bozulur\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest1Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Güneş tutulması hangi olay sonucunda gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ay'ın Dünya'nın gölgesine girmesi\", \"text\": \"Ay'ın Dünya'nın gölgesine girmesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ay'ın Dünya ile aynı hizada olması\", \"text\": \"Ay'ın Dünya ile aynı hizada olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'nın Güneş'e en yakın olduğu an\", \"text\": \"Dünya'nın Güneş'e en yakın olduğu an\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın Dünya'ya en yakın olduğu an\", \"text\": \"Ay'ın Dünya'ya en yakın olduğu an\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Güneş tutulmasında hangi gökyüzü olayı gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gündüz vakti gök karanlıklaşır\", \"text\": \"Gündüz vakti gök karanlıklaşır\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gece vakti gök daha aydınlık olur\", \"text\": \"Gece vakti gök daha aydınlık olur\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yıldızlar belirgin şekilde görünür\", \"text\": \"Yıldızlar belirgin şekilde görünür\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hava daha sıcak olur\", \"text\": \"Hava daha sıcak olur\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Ay tutulması hangi evrede gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yeni ay\", \"text\": \"Yeni ay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dolunay\", \"text\": \"Dolunay\", \"isCorrect\": true }," +
                "{ \"option_id\": \"İlk dördün\", \"text\": \"İlk dördün\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Son dördün\", \"text\": \"Son dördün\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Güneş tutulmasını izlemek için ne tür gözlük kullanılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş gözlüğü\", \"text\": \"Güneş gözlüğü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Normal gözlük\", \"text\": \"Normal gözlük\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş tutulma gözlüğü\", \"text\": \"Güneş tutulma gözlüğü\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gece görüş gözlüğü\", \"text\": \"Gece görüş gözlüğü\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Güneş tutulması kaç yılda bir aynı yerde tekrar gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"365 yıl\", \"text\": \"365 yıl\", \"isCorrect\": false }," +
                "{ \"option_id\": \"200 yıl\", \"text\": \"200 yıl\", \"isCorrect\": false }," +
                "{ \"option_id\": \"150 yıl\", \"text\": \"150 yıl\", \"isCorrect\": false }," +
                "{ \"option_id\": \"375 yıl\", \"text\": \"375 yıl\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest2Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Güneş tutulması için ideal süre ne kadardır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"5 dakika\", \"text\": \"5 dakika\", \"isCorrect\": false }," +
                "{ \"option_id\": \"10 dakika\", \"text\": \"10 dakika\", \"isCorrect\": false }," +
                "{ \"option_id\": \"7.5 dakika\", \"text\": \"7.5 dakika\", \"isCorrect\": true }," +
                "{ \"option_id\": \"15 dakika\", \"text\": \"15 dakika\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Güneş tutulmasının gerçekleşmesi için Ay'ın yörüngesinin ne kadar eğik olması gerekir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"10°\", \"text\": \"10°\", \"isCorrect\": false }," +
                "{ \"option_id\": \"15°\", \"text\": \"15°\", \"isCorrect\": false }," +
                "{ \"option_id\": \"5°\", \"text\": \"5°\", \"isCorrect\": true }," +
                "{ \"option_id\": \"20°\", \"text\": \"20°\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Güneş tutulması hangi gölge türü ile gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Tam gölge\", \"text\": \"Tam gölge\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yarı gölge\", \"text\": \"Yarı gölge\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Geçici gölge\", \"text\": \"Geçici gölge\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sabit gölge\", \"text\": \"Sabit gölge\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Güneş tutulması hangi türde gözlemlenir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gündüz\", \"text\": \"Gündüz\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gece\", \"text\": \"Gece\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Şafak vakti\", \"text\": \"Şafak vakti\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akşamüstü\", \"text\": \"Akşamüstü\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Güneş tutulmasının 'Küçük Tutulma' olarak adlandırılan bir türü vardır. Bu türde, Güneş'in yüzeyinin kenarında bir halka şeklinde görünüm meydana gelir. Bu tutulma türüne ne ad verilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hibrid güneş tutulması\", \"text\": \"Hibrid güneş tutulması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Parçalı güneş tutulması\", \"text\": \"Parçalı güneş tutulması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yüzük tutulması\", \"text\": \"Yüzük tutulması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Tam güneş tutulması\", \"text\": \"Tam güneş tutulması\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest3Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Ay tutulması sırasında, Ay'ın neden kırmızıya dönüştüğünü açıklayan fenomen hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kızılötesi ışık yansıması\", \"text\": \"Kızılötesi ışık yansıması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş ışınlarının atmosferde kırılması\", \"text\": \"Güneş ışınlarının atmosferde kırılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay'ın yüzeyindeki demir oksit varlığı\", \"text\": \"Ay'ın yüzeyindeki demir oksit varlığı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'nın atmosferindeki kırmızıya yakın renkli ışığın kırılması\", \"text\": \"Dünya'nın atmosferindeki kırmızıya yakın renkli ışığın kırılması\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Güneş ve Ay tutulmaları arasındaki en önemli benzerlik nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Her ikisi de Dünya'nın gölgesi sonucu oluşur\", \"text\": \"Her ikisi de Dünya'nın gölgesi sonucu oluşur\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Her ikisi de her ay düzenli olarak meydana gelir\", \"text\": \"Her ikisi de her ay düzenli olarak meydana gelir\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Her ikisi de astronomik olaylardır ve gezegenler arasındaki konumlarına bağlıdır\", \"text\": \"Her ikisi de astronomik olaylardır ve gezegenler arasındaki konumlarına bağlıdır\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Her ikisi de insanların sağlık üzerindeki etkileri konusunda uyarılarda bulunur\", \"text\": \"Her ikisi de insanların sağlık üzerindeki etkileri konusunda uyarılarda bulunur\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Güneş tutulmasının farklı türleri arasındaki ana fark nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş tutulmasının türleri, sadece Güneş'in görünümünde değişiklikler gösterir, etkileri aynıdır\", \"text\": \"Güneş tutulmasının türleri, sadece Güneş'in görünümünde değişiklikler gösterir, etkileri aynıdır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Farklı türlerde, Güneş'in yüzeyinin farklı oranlarda gölgelendiği ve bu durumun gökyüzünde oluşturduğu görüntülerde farklılıklar bulunur\", \"text\": \"Farklı türlerde, Güneş'in yüzeyinin farklı oranlarda gölgelendiği ve bu durumun gökyüzünde oluşturduğu görüntülerde farklılıklar bulunur\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Farklı türler, Dünya'nın Güneş'e olan mesafesine bağlı olarak ortaya çıkar ve bu nedenle görüntülerde değişiklikler olur\", \"text\": \"Farklı türler, Dünya'nın Güneş'e olan mesafesine bağlı olarak ortaya çıkar ve bu nedenle görüntülerde değişiklikler olur\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Farklı türler, Güneş sistemi içindeki diğer gezegenlerin konumlarına göre belirlenir ve bu durumun etkileri değişiktir\", \"text\": \"Farklı türler, Güneş sistemi içindeki diğer gezegenlerin konumlarına göre belirlenir ve bu durumun etkileri değişiktir\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Güneş ve Ay tutulmalarının dünya üzerindeki gözlemlenen etkilerini inceleyen bilim dalına ne ad verilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Etnoloji\", \"text\": \"Etnoloji\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Astrofizik\", \"text\": \"Astrofizik\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kriptoloji\", \"text\": \"Kriptoloji\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Meteoroloji\", \"text\": \"Meteoroloji\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Güneş tutulmasının farklı türlerini ayırt etmek için kullanılan terim hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saros Döngüsü\", \"text\": \"Saros Döngüsü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kepler Yasaları\", \"text\": \"Kepler Yasaları\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fotosferik Halka\", \"text\": \"Fotosferik Halka\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ekuatör Hattı\", \"text\": \"Ekuatör Hattı\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest1Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi uzay araştırmalarının nedenleri arasında yer almaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dünya dışında yaşam olup olmadığının araştırılması\", \"text\": \"Dünya dışında yaşam olup olmadığının araştırılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tıp, fizik, kimya gibi alanlara katkı sağlaması.\", \"text\": \"Tıp, fizik, kimya gibi alanlara katkı sağlaması.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya yer üstü ve yer altı kaynaklarının bulunması\", \"text\": \"Dünya yer üstü ve yer altı kaynaklarının bulunması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'nın enerji ihtiyacının karşılanması\", \"text\": \"Dünya'nın enerji ihtiyacının karşılanması\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Gökyüzünün incelenmesinde teleskobu kullanan ilk bilim insanı kimdir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Galileo Galilei\", \"text\": \"Galileo Galilei\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Edison\", \"text\": \"Edison\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ali Kuşçu\", \"text\": \"Ali Kuşçu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Neil Armstrong\", \"text\": \"Neil Armstrong\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Uzayı araştırmak için gönderilen uzaktan kumandayla çalışan insansız uzay aracına ne denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Uzay sondası\", \"text\": \"Uzay sondası\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Uzay roketi\", \"text\": \"Uzay roketi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay mekiği\", \"text\": \"Uzay mekiği\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay istasyonu\", \"text\": \"Uzay istasyonu\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi bir teleskop çeşidi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Optik teleskop\", \"text\": \"Optik teleskop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş teleskop\", \"text\": \"Güneş teleskop\", \"isCorrect\": true }," +
                "{ \"option_id\": \"X-ışını teleskop\", \"text\": \"X-ışını teleskop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Radyo teleskop\", \"text\": \"Radyo teleskop\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Astronomi alanında çalışmalar ve araştırmalar yapan bilim insanlarına ne denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Astronot\", \"text\": \"Astronot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kozmonot\", \"text\": \"Kozmonot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Astronom\", \"text\": \"Astronom\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Astrolog\", \"text\": \"Astrolog\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest2Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Yapay uydular hangi amaçla kullanılır? (I. Haberleşme,II. Meteoroloji, III. Askeri alan)\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yalnız I\", \"text\": \"Yalnız I\", \"isCorrect\": false }," +
                "{ \"option_id\": \"I ve II\", \"text\": \"I ve II\", \"isCorrect\": false }," +
                "{ \"option_id\": \"II ve III\", \"text\": \"II ve III\", \"isCorrect\": false }," +
                "{ \"option_id\": \"I, II ve III\", \"text\": \"I, II ve III\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Uzaya giden ilk insan kimdir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yuri Gagarin\", \"text\": \"Yuri Gagarin\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Neil Armstrong\", \"text\": \"Neil Armstrong\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Edwin Aldrin\", \"text\": \"Edwin Aldrin\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Aleksey Leonov\", \"text\": \"Aleksey Leonov\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi uzay araştırmaları sırasında geliştirilen araçlardan birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Teflon\", \"text\": \"Teflon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tükenmez kalem\", \"text\": \"Tükenmez kalem\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Alüminyum tencere\", \"text\": \"Alüminyum tencere\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Alüminyum folyo\", \"text\": \"Alüminyum folyo\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi uzay kirliliğine neden olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Meteorlar\", \"text\": \"Meteorlar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Görevi biten yapay uydular\", \"text\": \"Görevi biten yapay uydular\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay aracı parçaları\", \"text\": \"Uzay aracı parçaları\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzayda kalan yakıt tankları\", \"text\": \"Uzayda kalan yakıt tankları\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Uzay yolculuğuna çıkan astronotlar özel kıyafetler kullanırlar. Aşağıdakilerden hangisi uzay kıyafetlerinin özelliklerinden birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş'ten gelen zararlı ışınlardan korumak\", \"text\": \"Güneş'ten gelen zararlı ışınlardan korumak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sıvı basıncını dengelemek\", \"text\": \"Sıvı basıncını dengelemek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hava basıncını dengelemek\", \"text\": \"Hava basıncını dengelemek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Vücut sıcaklığını sabit tutmak\", \"text\": \"Vücut sıcaklığını sabit tutmak\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest3Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Uzay araştırmaları ile ilgili olarak verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Uzay araştırmalarında teleskobun icadı ile birlikte çalışmalar hızlanmıştır.\", \"text\": \"Uzay araştırmalarında teleskobun icadı ile birlikte çalışmalar hızlanmıştır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay araştırmaları her geçen gün artarak devam etmektedir.\", \"text\": \"Uzay araştırmaları her geçen gün artarak devam etmektedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay araştırmalarında ülkeler birbirine destek olmazlar.\", \"text\": \"Uzay araştırmalarında ülkeler birbirine destek olmazlar.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Uzay araştırmaları sayesinde mutfakta kullanılan birçok malzeme geliştirilmiştir.\", \"text\": \"Uzay araştırmaları sayesinde mutfakta kullanılan birçok malzeme geliştirilmiştir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Uzay araştırmalarında kullanılan aşağıdaki araçlardan hangisi uzaya fırlatıldıktan sonra tekrar Dünya'ya gelerek kullanılabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Uzay sondası\", \"text\": \"Uzay sondası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yapay uydu\", \"text\": \"Yapay uydu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay teleskobu\", \"text\": \"Uzay teleskobu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzay mekiği\", \"text\": \"Uzay mekiği\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Ülkemizin uzaya gönderdiği aşağıdaki uydulardan hangisi kullanılmamaktadır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Türksat 3A\", \"text\": \"Türksat 3A\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Türksat 4A\", \"text\": \"Türksat 4A\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Türksat 1C\", \"text\": \"Türksat 1C\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Göktürk-2\", \"text\": \"Göktürk-2\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Rasathaneler kurulması için ışık kirliliğinin ve yerleşimin az olduğu yerler tercih edilmektedir.Aşağıdaki yerleşim yerlerinden hangisi rasathane kurmak için uygundur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İstanbul Çamlıca tepesi\", \"text\": \"İstanbul Çamlıca tepesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Antalya Toros dağının zirvesi\", \"text\": \"Antalya Toros dağının zirvesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bursa Uludağ\", \"text\": \"Bursa Uludağ\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ankara Elmadağ\", \"text\": \"Ankara Elmadağ\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Soru 15: Uzay teleskobunun uzayda bulunma sebebi nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Işık kirliğinden etkilenmemesi\", \"text\": \"Işık kirliğinden etkilenmemesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yer çekimsiz ortamda bulunması\", \"text\": \"Yer çekimsiz ortamda bulunması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kontrol edilmesinin kolay olması\", \"text\": \"Kontrol edilmesinin kolay olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Astronotların kolaylıkla ulaşabilmesi\", \"text\": \"Astronotların kolaylıkla ulaşabilmesi\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}
