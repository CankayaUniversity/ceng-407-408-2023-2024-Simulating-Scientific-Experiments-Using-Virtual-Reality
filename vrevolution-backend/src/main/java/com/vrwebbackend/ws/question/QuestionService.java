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

    public ResponseEntity<Object> getTest10Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Tencere içerisinde suyun  buharlaşma hızını artırmak için aşağıdakilerden hangisi yapılmamalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Suyun miktarı artırılmalı\", \"text\": \"Suyun miktarı artırılmalı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Suyun sıcaklığı artırılmalı\", \"text\": \"Suyun sıcaklığı artırılmalı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Su daha geniş tencereye alınmalı\", \"text\": \"Su daha geniş tencereye alınmalı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Suyun üzerinde üflenmeli\", \"text\": \"Suyun üzerinde üflenmeli\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi suyun sıvı halidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kar\", \"text\": \"Kar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çiy\", \"text\": \"Çiy\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Dolu\", \"text\": \"Dolu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kırağı\", \"text\": \"Kırağı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Bulutlarda oluşan yağmur suyun hangi halidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Katı\", \"text\": \"Katı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buhar\", \"text\": \"Buhar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gaz\", \"text\": \"Gaz\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sıvı\", \"text\": \"Sıvı\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Islak çamaşırlar soğuk kış günlerinde de kurur. Çamaşırların kurumasına neden olan sebep nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kışın nemin fazla olması\", \"text\": \"Kışın nemin fazla olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buharlaşmanın düşük sıcaklıkta fazla olması\", \"text\": \"Buharlaşmanın düşük sıcaklıkta fazla olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buharlaşmanın her sıcaklıkta olması\", \"text\": \"Buharlaşmanın her sıcaklıkta olması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Çamaşırların fazla nemli olmaması\", \"text\": \"Çamaşırların fazla nemli olmaması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Buzluktan çıkarılan buz, ağzı açık bir kapta ısıtılmaya başlanıyor. Kapta madde kalmayıncaya kadar ısıtma işlemi devam ediyor. Bu işlemler sırasında hangi hal değişimleri gözlenir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Erime ve donma\", \"text\": \"Erime ve donma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Erime ve buharlaşma\", \"text\": \"Erime ve buharlaşma\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sadece erime\", \"text\": \"Sadece erime\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Erime ve süblimleşme\", \"text\": \"Erime ve süblimleşme\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest11Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bütün katılar aynı sıcaklıkta erir.\", \"text\": \"Bütün katılar aynı sıcaklıkta erir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Donma noktası ve erime noktası aynı sıcaklıktır.\", \"text\": \"Donma noktası ve erime noktası aynı sıcaklıktır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Erime sırasında madde dışarıdan ısı alır\", \"text\": \"Erime sırasında madde dışarıdan ısı alır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buharlaşma her sıcaklıkta meydana gelir.\", \"text\": \"Buharlaşma her sıcaklıkta meydana gelir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilen hal değişim olaylarından hangileri birbirinin tersidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Donma - Kaynama\", \"text\": \"Donma - Kaynama\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buharlaşma - Erime\", \"text\": \"Buharlaşma - Erime\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Donma - Süblimleşme\", \"text\": \"Donma - Süblimleşme\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Erime - Donma\", \"text\": \"Erime - Donma\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Saf K maddesinin erime noktası 10 °C , kaynama noktası 90 °C dir. K maddesi için aşağıdakilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"K maddesi 5 °C de katı haldedir.\", \"text\": \"K maddesi 5 °C de katı haldedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"K maddesi 80 °C de sıvı haldedir.\", \"text\": \"K maddesi 80 °C de sıvı haldedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"K maddesi 10 °C de donar.\", \"text\": \"K maddesi 10 °C de donar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"K maddesi 92 °C de sıvı haldedir.\", \"text\": \"K maddesi 92 °C de sıvı haldedir.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Saf maddeler hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Erime sırasında sıcaklığı değişmez.\", \"text\": \"Erime sırasında sıcaklığı değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kaynama sırasında sıcaklığı değişmez.\", \"text\": \"Kaynama sırasında sıcaklığı değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Madde miktarının fazla olması kaynama noktasını artırır.\", \"text\": \"Madde miktarının fazla olması kaynama noktasını artırır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Erime ve donma noktaları aynıdır.\", \"text\": \"Erime ve donma noktaları aynıdır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"10 gram su ile 100 gram su aynı sıcaklıkta donar.\", \"text\": \"10 gram su ile 100 gram su aynı sıcaklıkta donar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"20 gram alkol ile 40 gram alkol aynı sıcaklıkta kaynar.\", \"text\": \"20 gram alkol ile 40 gram alkol aynı sıcaklıkta kaynar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"5 gram demir ile 10 gram demir aynı sıcaklıkta erir.\", \"text\": \"5 gram demir ile 10 gram demir aynı sıcaklıkta erir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"10 gram su ile 10 gram alkol aynı sıcaklıkta kaynar.\", \"text\": \"10 gram su ile 10 gram alkol aynı sıcaklıkta kaynar.\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest12Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Gravzant halkası deneyinin yapılma amacı nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Maddelerin ısı etkisiyle genleşme ve büzülmesini göstermek\", \"text\": \"Maddelerin ısı etkisiyle genleşme ve büzülmesini göstermek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Maddelerin kaynama noktalarını bulmak\", \"text\": \"Maddelerin kaynama noktalarını bulmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Maddelerin donma noktalarını bulmak\", \"text\": \"Maddelerin donma noktalarını bulmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Maddelerin hal değişimini göstermek\", \"text\": \"Maddelerin hal değişimini göstermek.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki maddelerden hangisi genleşme özelliğine sahip değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Su\", \"text\": \"Su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Demir\", \"text\": \"Demir\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Işık\", \"text\": \"Işık\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi ısı alarak genleşmeye örnek değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Isınan balonun hacminin artması\", \"text\": \"Isınan balonun hacminin artması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buzun donunca hacminin artması\", \"text\": \"Buzun donunca hacminin artması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yazın elektrik tellerinin uzaması\", \"text\": \"Yazın elektrik tellerinin uzaması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kaynayan suyun taşması\", \"text\": \"Kaynayan suyun taşması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi genleşmeye örnektir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Isınan mutfak tüpünün patlaması\", \"text\": \"Isınan mutfak tüpünün patlaması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Soğukta araç tekerinin basıncının azalması\", \"text\": \"Soğukta araç tekerinin basıncının azalması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Termometrenin içindeki sıvı seviyesinin düşmesi\", \"text\": \"Termometrenin içindeki sıvı seviyesinin düşmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kışın telefon tellerinin daha gergin olması.\", \"text\": \"Kışın telefon tellerinin daha gergin olması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Genleşme nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Isı alan maddenin hacminin azalması\", \"text\": \"Isı alan maddenin hacminin azalması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Isı veren maddenin hacminin azalması\", \"text\": \"Isı veren maddenin hacminin azalması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Isı alan maddenin hacminin artması\", \"text\": \"Isı alan maddenin hacminin artması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Maddenin şeklinin değişmesi\", \"text\": \"Maddenin şeklinin değişmesi\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest13Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Işığın yayılması ile ilgili olarak aşağıdakilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Işık doğrusal yayılır.\", \"text\": \"Işık doğrusal yayılır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işık bir enerjidir.\", \"text\": \"Işık bir enerjidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işık bütün ortamlarda yayılabilir.\", \"text\": \"Işık bütün ortamlarda yayılabilir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Işık uzayda yayılabilir.\", \"text\": \"Işık uzayda yayılabilir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi ışık kaynağı değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş\", \"text\": \"Güneş\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay\", \"text\": \"Ay\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mum\", \"text\": \"Mum\", \"isCorrect\": false }," +
                "{ \"option_id\": \"El feneri\", \"text\": \"El feneri\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Işık kaynağından yayılan ışınlar ..................... olarak her yöne yayılır. Yukarıda boş bırakılan cümle aşağıdakilerden hangisi ile doldurulabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Eğrisel\", \"text\": \"Eğrisel\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dalgasal\", \"text\": \"Dalgasal\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bütünsel\", \"text\": \"Bütünsel\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğrusal\", \"text\": \"Doğrusal\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Işık hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Işık olmadan cisimler görülebilir.\", \"text\": \"Işık olmadan cisimler görülebilir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Işık yayan cisimler karanlıkta görülebilir.\", \"text\": \"Işık yayan cisimler karanlıkta görülebilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş'ten Dünya'mıza gelen ışık, ışığın boşlukta yayıldığını gösterir.\", \"text\": \"Güneş'ten Dünya'mıza gelen ışık, ışığın boşlukta yayıldığını gösterir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işık kaynakları doğal ve yapay olarak ikiye ayrılabilir.\", \"text\": \"Işık kaynakları doğal ve yapay olarak ikiye ayrılabilir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki olayların hangisi ışığın doğrusal yayıldığını kanıtlamaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş tutulması\", \"text\": \"Güneş tutulması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ay tutulması\", \"text\": \"Ay tutulması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gölge oluşumu\", \"text\": \"Gölge oluşumu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işığın opak maddelerden geçmemesi\", \"text\": \"Işığın opak maddelerden geçmemesi\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest14Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gelme açısı ile yansıma açısı birbirine eşittir.\", \"text\": \"Gelme açısı ile yansıma açısı birbirine eşittir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gelen ışın ile yüzeyin normali arasındaki açıya gelme açısı denir.\", \"text\": \"Gelen ışın ile yüzeyin normali arasındaki açıya gelme açısı denir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yüzeye dik olarak çizilen çizgiye normal denir.\", \"text\": \"Yüzeye dik olarak çizilen çizgiye normal denir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yansıma sadece düzgün yüzeylerde gerçekleşir.\", \"text\": \"Yansıma sadece düzgün yüzeylerde gerçekleşir.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Gelme açısı 30º olan ışının yansıma açısı kaç derecedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"20º\", \"text\": \"20º\", \"isCorrect\": false }," +
                "{ \"option_id\": \"30º\", \"text\": \"30º\", \"isCorrect\": false }," +
                "{ \"option_id\": \"60º\", \"text\": \"60º\", \"isCorrect\": true }," +
                "{ \"option_id\": \"90º\", \"text\": \"90º\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Yüzeyin normali ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"'N' ile gösterilir.\", \"text\": \"'N' ile gösterilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kesikli çizgi şeklinde çizilir.\", \"text\": \"Kesikli çizgi şeklinde çizilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yüzeye dik olarak çizilir.\", \"text\": \"Yüzeye dik olarak çizilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dağınık yansımada yüzeyin normali yoktur.\", \"text\": \"Dağınık yansımada yüzeyin normali yoktur.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi yansıma kanunlarından biri değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dağınık yansıma yansıma kanununa uymaz.\", \"text\": \"Dağınık yansıma yansıma kanununa uymaz.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gelen ışın, yansıyan ışın ve yüzeyin normali aynı düzlemdedir.\", \"text\": \"Gelen ışın, yansıyan ışın ve yüzeyin normali aynı düzlemdedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yüzeye dik gelen ışın, geldiği yoldan geri yansır..\", \"text\": \"Yüzeye dik gelen ışın, geldiği yoldan geri yansır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gelme açısı ile yansıma açısı eşittir.\", \"text\": \"Gelme açısı ile yansıma açısı eşittir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisinde düzgün yansıma yoktur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Durgun su yüzeyi\", \"text\": \"Durgun su yüzeyi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Düz ayna yüzeyi\", \"text\": \"Düz ayna yüzeyi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buruşuk alüminyum folyo\", \"text\": \"Buruşuk alüminyum folyo\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Düzgün alüminyum folyo\", \"text\": \"Düzgün alüminyum folyo\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest15Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Işık madde ile karşılaştığında aşağıdakilerden hangisi gerçekleşmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Soğurulma\", \"text\": \"Soğurulma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yansıma\", \"text\": \"Yansıma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kırılma\", \"text\": \"Kırılma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yok olma\", \"text\": \"Yok olma\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki maddelerden hangisi saydam maddedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Cam\", \"text\": \"Cam\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yağlı kağıt\", \"text\": \"Yağlı kağıt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Silgi\", \"text\": \"Silgi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kağıt\", \"text\": \"Kağıt\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Işığın bir kısmını geçiren ve bir kısmını geçirmeyen maddelere ne denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saydam madde\", \"text\": \"Saydam madde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yarı saydam madde\", \"text\": \"Yarı saydam madde\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Opak madde\", \"text\": \"Opak madde\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Parlak madde\", \"text\": \"Parlak madde\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi yarı saydam maddedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ayna\", \"text\": \"Ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalem\", \"text\": \"Kalem\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Buzlu cam\", \"text\": \"Buzlu cam\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Alüminyum folyo\", \"text\": \"Alüminyum foly\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Işığın madde ile karşılaşması ile ilgili olarak aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yarı saydam maddeler ışığın bir kısmını geçirir.\", \"text\": \"Yarı saydam maddeler ışığın bir kısmını geçirir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Saydam maddelerin kalınlığı arttıkça saydamlık özelliği azalır.\", \"text\": \"Saydam maddelerin kalınlığı arttıkça saydamlık özelliği azalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Opak maddeler inceltildiğinde yarı saydam özellik kazanabilir.\", \"text\": \"Opak maddeler inceltildiğinde yarı saydam özellik kazanabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yarı saydam maddelerin gölgesi oluşmaz.\", \"text\": \"Yarı saydam maddelerin gölgesi oluşmaz.\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest16Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Biyoçeşitlilik hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Biyoçeşitlilik bir ülkenin milli sermayesidir.\", \"text\": \"Biyoçeşitlilik bir ülkenin milli sermayesidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ülkemiz biyoçeşitlilik bakımından zengindir.\", \"text\": \"Ülkemiz biyoçeşitlilik bakımından zengindir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Biyoçeşitlilik, o bölgedeki doğal yaşamın devamı açısından önemlidir.\", \"text\": \"Biyoçeşitlilik, o bölgedeki doğal yaşamın devamı açısından önemlidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bir bitki türünün sayısının fazla olması biyoçeşitliliğin fazla olmasını sağlar.\", \"text\": \"Bir bitki türünün sayısının fazla olması biyoçeşitliliğin fazla olmasını sağlar.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki canlılardan hangisi nesli tükenme tehlikesiyle karşı karşıyadır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Moa\", \"text\": \"Moa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinozor\", \"text\": \"Dinozor\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akdeniz foku\", \"text\": \"Akdeniz foku\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Güvercin\", \"text\": \"Güvercin\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki davranışlardan hangisi biyoçeşitliliği tehdit eder?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hayvanların yumurtlama döneminde avlanması\", \"text\": \"Hayvanların yumurtlama döneminde avlanması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ağaçlandırma çalışmasının yapılması\", \"text\": \"Ağaçlandırma çalışmasının yapılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Nesli tükenmekte olan hayvanların koruma altına alınması\", \"text\": \"Nesli tükenmekte olan hayvanların koruma altına alınması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sulak alanların koruma altına alınması\", \"text\": \"Sulak alanların koruma altına alınması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Bir bölgede yaşayan canlı türlerinin sayı ve çeşitçe zenginliğine ...................... denir. Yukarıdaki cümlede boş bırakılan yere aşağıdakilerden hangisi yazılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yaşam alanı\", \"text\": \"Yaşam alanı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bitki türü\", \"text\": \"Bitki türü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğal yaşam\", \"text\": \"Doğal yaşam\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Biyoçeşitlilik\", \"text\": \"Biyoçeşitlilik\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki canlılardan hangisinin nesli tükenmiştir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Aslan\", \"text\": \"Aslan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kelaynak kuşu\", \"text\": \"Kelaynak kuşu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mamut\", \"text\": \"Mamut\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ceylan\", \"text\": \"Ceylan\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest17Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"İnsan ve çevre ilişkisi konusunda araştırma yapan öğrencinin hazırladığı panoya aşağıdakilerden hangisini asması uygun olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Küresel ısınma sonucu iklimlerin değişmesi\", \"text\": \"Küresel ısınma sonucu iklimlerin değişmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Toprak kirliliğinin artması\", \"text\": \"Toprak kirliliğinin artması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Asit yağmurlarının meydana gelmesi\", \"text\": \"Asit yağmurlarının meydana gelmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bilimsel çalışmalar sonucu teknolojik gelişmeler\", \"text\": \"Bilimsel çalışmalar sonucu teknolojik gelişmeler\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi hava kirliliğine neden olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Egzoz dumanları\", \"text\": \"Egzoz dumanları\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fabrika bacalarından çıkan gazlar\", \"text\": \"Fabrika bacalarından çıkan gazlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Soba bacalarından çıkan gazlar\", \"text\": \"Soba bacalarından çıkan gazlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fotosentez sonucu oluşan gazlar\", \"text\": \"Fotosentez sonucu oluşan gazlar\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi toprak kirliliğine neden olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Atık piller\", \"text\": \"Atık piller\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağaç yaprakları\", \"text\": \"Ağaç yaprakları\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Plastik ürünler\", \"text\": \"Plastik ürünler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Suni gübreler\", \"text\": \"Suni gübreler\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi hava kirliliğini artırır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kalitesiz kömür kullanımı\", \"text\": \"Kalitesiz kömür kullanımı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Fabrika bacalarına filtre takılması\", \"text\": \"Fabrika bacalarına filtre takılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kömür yerine doğal gaz kullanılması\", \"text\": \"Kömür yerine doğal gaz kullanılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağaçlandırma çalışmalarının yapılması\", \"text\": \"Ağaçlandırma çalışmalarının yapılması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisinin yapılması çevre kirliliğini azaltmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Toplu taşıma araçlarının kullanılması\", \"text\": \"Toplu taşıma araçlarının kullanılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Geri dönüşüme önem verilmesi\", \"text\": \"Geri dönüşüme önem verilmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fosil yakıtların kullanımının artırılması\", \"text\": \"Fosil yakıtların kullanımının artırılması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Temiz enerji kaynaklarının kullanımının artırılması\", \"text\": \"Temiz enerji kaynaklarının kullanımının artırılması\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest18Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Yıkıcı doğa olayları ile ilgili olarak aşağıdakilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İnsanlar tarafından sebep olur.\", \"text\": \"İnsanlar tarafından sebep olur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Can ve mal kaybına neden olur.\", \"text\": \"Can ve mal kaybına neden olur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Aniden gerçekleşir.\", \"text\": \"Aniden gerçekleşir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yıkıcı doğa olayları insanlar tarafından önlenemez.\", \"text\": \"Yıkıcı doğa olayları insanlar tarafından önlenemez.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilenlerden hangisi yıkıcı doğa olayı değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Deprem\", \"text\": \"Deprem\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kasırga\", \"text\": \"Kasırga\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Meltem\", \"text\": \"Meltem\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sel\", \"text\": \"Sel\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Volkanik patlamalarla ilgili olarak aşağıda verilenlerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yeryüzüne çıkan magmaya lav denir.\", \"text\": \"Yeryüzüne çıkan magmaya lav denir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Aniden gerçekleşir.\", \"text\": \"Aniden gerçekleşir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'nın iç kısmının sıcak olduğunu gösterir.\", \"text\": \"Dünya'nın iç kısmının sıcak olduğunu gösterir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yanardağların hepsi aktiftir.\", \"text\": \"Yanardağların hepsi aktiftir.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi volkan patlamalarının verdiği zararlardan biri değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Volkanlardan çıkan lavlar insanlara zarar verir.\", \"text\": \"Volkanlardan çıkan lavlar insanlara zarar verir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Volkan patlaması sırasında depremler oluşur.\", \"text\": \"Volkan patlaması sırasında depremler oluşur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Volkan patlamaları zehirli gazlar da oluşturur.\", \"text\": \"Volkan patlamaları zehirli gazlar da oluşturur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Volkanlar toprağın verimini artırır.\", \"text\": \"Volkanlar toprağın verimini artırır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Volkanik patlamalar ile ilgili olarak aşağıdakilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yer kabuğunun altındaki magmanın yeryüzüne çıkması ile oluşur.\", \"text\": \"Yer kabuğunun altındaki magmanın yeryüzüne çıkması ile oluşur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ülkemizde aktif volkan bulunmamaktadır.\", \"text\": \"Ülkemizde aktif volkan bulunmamaktadır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Volkan patlaması sırasında sığınaklara saklanılmalıdır.\", \"text\": \"Volkan patlaması sırasında sığınaklara saklanılmalıdır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Volkan patlaması can ve mal kaybına neden olur.\", \"text\": \"Volkan patlaması can ve mal kaybına neden olur.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest19Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi devre elemanlarının sembollerle gösteriminin sağladığı faydalardan birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dünyanın her yerinde devre elemanları aynı sembolle gösterilir.\", \"text\": \"Dünyanın her yerinde devre elemanları aynı sembolle gösterilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devre elemanlarının resimlerini çizmek zaman alıcıdır.\", \"text\": \"Devre elemanlarının resimlerini çizmek zaman alıcıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Oluşturulan devre şemaları kolaylıkla anlaşılabilir.\", \"text\": \"Oluşturulan devre şemaları kolaylıkla anlaşılabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devre elemanları sembollerini çizmek zordur.\", \"text\": \"Devre elemanları sembollerini çizmek zordur.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Bir elektrik devresinin çalışıp çalışmayacağını aşağıdakilerden hangisine bakarak anlayabiliriz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Devre elemanlarının sembollerine bakarak\", \"text\": \"Devre elemanlarının sembollerine bakarak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devre şemasına bakarak\", \"text\": \"Devre şemasına bakarak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Devre elemanlarının resimlerine bakarak\", \"text\": \"Devre elemanlarının resimlerine bakarak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devrede anahtarın bulunmasına bakarak\", \"text\": \"Devrede anahtarın bulunmasına bakarak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Basit elektrik devresinde kullanılan aşağıdakilerden hangisinin sembolü yoktur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Batarya\", \"text\": \"Batarya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Pil yatağı\", \"text\": \"Pil yatağı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bütün elektrikli araçların devre şeması vardır.\", \"text\": \"Bütün elektrikli araçların devre şeması vardır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devre şemaları elektrikli aracın çalışıp çalışmayacağını gösterir.\", \"text\": \"Devre şemaları elektrikli aracın çalışıp çalışmayacağını gösterir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Devre şemalarında bütün devre elemanları gösterilir.\", \"text\": \"Devre şemalarında bütün devre elemanları gösterilir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Elektrik devre elemanları bütün ülkelerde aynı şekilde gösterilir.\", \"text\": \"Elektrik devre elemanları bütün ülkelerde aynı şekilde gösterilir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki elektrikli cihazların hangisinde anahtar bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Televizyon\", \"text\": \"Televizyon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"El feneri\", \"text\": \"El feneri\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bilgisayar\", \"text\": \"Bilgisayar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Şarj aleti\", \"text\": \"Şarj aleti\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest20Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki ifadelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Anahtarın yerinin değiştirilmesi ampulün parlaklığını etkilemez.\", \"text\": \"Anahtarın yerinin değiştirilmesi ampulün parlaklığını etkilemez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampulün + ve - kutbu pilin + ve - kutbuna doğru bağlanmalıdır.\", \"text\": \"Ampulün + ve - kutbu pilin + ve - kutbuna doğru bağlanmalıdır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bir elektrik devresinin sembolik gösterimi bağlantı hatalarını engelleyecektir.\", \"text\": \"Bir elektrik devresinin sembolik gösterimi bağlantı hatalarını engelleyecektir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Pil içerisindeki kimyasal enerji biterse pil elektrik üretemez.\", \"text\": \"Pil içerisindeki kimyasal enerji biterse pil elektrik üretemez.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi bir devrenin çalışmasına engel olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Anahtarın kapalı olması\", \"text\": \"Anahtarın kapalı olması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampulün patlaması\", \"text\": \"Ampulün patlaması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bağlantı kablosunun tam temas etmemesi\", \"text\": \"Bağlantı kablosunun tam temas etmemesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Pilin bitmesi\", \"text\": \"Pilin bitmesi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki devre elemanlarından hangisi ampulün ışık vermesi için enerji üretir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anahtar\", \"text\": \"Anahtar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İletken kablo\", \"text\": \"İletken kablo\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Elektrik devresinin açılıp kapanmasını sağlayan devre elemanı aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anahtar\", \"text\": \"Anahtar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bağlantı kablosu\", \"text\": \"Bağlantı kablosu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Duy\", \"text\": \"Duy\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Elektrikli araçların çalışması için elektrik enerjisine ihtiyaç vardır. Aşağıdaki elektrikli araçlardan hangisi pil ile çalışır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Duvar saati\", \"text\": \"Duvar saati\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Buzdolabı\", \"text\": \"Buzdolabı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çamaşır makinesi\", \"text\": \"Çamaşır makinesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ütü\", \"text\": \"Ütü\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest21Grade5()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Basit elektrik devresinde aşağıdaki elemanlardan hangisi bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kablo\", \"text\": \"Kablo\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sigorta\", \"text\": \"Sigorta\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki devre elemanlarından hangisinin görevi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil elektrik enerjisi üretir.\", \"text\": \"Pil elektrik enerjisi üretir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bağlantı kablosu elektrik enerjinin geçişini engeller.\", \"text\": \"Bağlantı kablosu elektrik enerjinin geçişini engeller.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul elektrik enerjisini ışık enerjisine çevirir.\", \"text\": \"Ampul elektrik enerjisini ışık enerjisine çevirir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anahtar elektrik enerjisinin geçişini kontrol eder.\", \"text\": \"Anahtar elektrik enerjisinin geçişini kontrol eder.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda basit elektrik devrelerindeki pil ve ampul sayıları verilmiştir. Hangisinde ampul daha parlak ışık verir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"2 pil, 2 ampul\", \"text\": \"2 pil, 2 ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"1 pil, 1 ampul\", \"text\": \"1 pil, 1 ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"2 pil, 1 ampul\", \"text\": \"2 pil, 1 ampul\", \"isCorrect\": true }," +
                "{ \"option_id\": \"3 pil, 3 ampul\", \"text\": \"3 pil, 3 ampul\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Basit elektrik devresinde pil sayısına bağlı olarak ampul parlaklığı nasıl değişeceği araştırılmak istenmektedir. Buna göre aşağıdaki değişkenlerden hangisi yanlış verilmiştir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ampul parlaklığı sabit tutulan değişken\", \"text\": \"Ampul parlaklığı sabit tutulan değişken\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampul sayısı sabit tutulan değişken\", \"text\": \"Ampul sayısı sabit tutulan değişken\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Pil sayısı bağımsız değişken\", \"text\": \"Pil sayısı bağımsız değişken\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kablo sabit tutulan değişken\", \"text\": \"Kablo sabit tutulan değişken\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisi basit elektrik devresinde sembolle gösterilmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anahtar\", \"text\": \"Anahtar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Duy\", \"text\": \"Duy\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }" +
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

    public ResponseEntity<Object> getTest4Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Erol masada duran bardağındaki suyu alarak içiyor. Erol'un suyu içerken parmak kaslarında nasıl bir değişim görülür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sürekli kasılma\", \"text\": \"Sürekli kasılma\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sürekli gevşeme\", \"text\": \"Sürekli gevşeme\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Önce gevşeme sonra kasılma\", \"text\": \"Önce gevşeme sonra kasılma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Önce kasılma sonra gevşeme\", \"text\": \"Önce kasılma sonra gevşeme\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi vücudumuzdaki çizgili kaslara örnekler verilebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bacaklarımızdaki kaslarda\", \"text\": \"Bacaklarımızdaki kaslarda\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Damarlarımızdaki kaslar\", \"text\": \"Damarlarımızdaki kaslar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Midemizdeki kaslar\", \"text\": \"Midemizdeki kaslar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bağırsağımızdaki kaslar\", \"text\": \"Bağırsağımızdaki kaslar\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"İskeletin görevine örnek vermek isteyen öğrenci aşağıdakilerden hangisini söylerse, yanlış bilgi vermiş olur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Vücuda şekil verir.\", \"text\": \"Vücuda şekil verir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hareket etmemizi sağlar.\", \"text\": \"Hareket etmemizi sağlar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kan hücresi üretir.\", \"text\": \"Kan hücresi üretir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kanın temizlenmesini sağlar\", \"text\": \"Kanın temizlenmesini sağlar\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"İskelet kasının çalışma hızı fazladır fakat çabuk yorulur. Aşağıda verilenlerden hangisinin yapısında iskelet kası bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pazı kası\", \"text\": \"Pazı kası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bacak kası\", \"text\": \"Bacak kası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bağırsak kası\", \"text\": \"Bağırsak kası\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Parmak kası\", \"text\": \"Parmak kası\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıda verilen kaslardan hangisi istemli çalışır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kalp kası\", \"text\": \"Kalp kası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mide kası\", \"text\": \"Mide kası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bağırsak kası\", \"text\": \"Bağırsak kası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çene kası\", \"text\": \"Çene kası\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest5Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıda verilenlerden hangisi sindirim sistemine yardımcı bir organdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Karaciğer\", \"text\": \"Karaciğer\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mide\", \"text\": \"Mide\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anüs\", \"text\": \"Anüs\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yutak\", \"text\": \"Yutak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilen organlardan hangisinde kimyasal sindirim gerçekleşmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ağız\", \"text\": \"Ağız\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mide\", \"text\": \"Anüs\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İnce bağırsak\", \"text\": \"İnce bağırsak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalın bağırsak\", \"text\": \"Kalın bağırsak\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Sindirim hangi organda tamamlanır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ağız\", \"text\": \"Ağız\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İnce bağırsak\", \"text\": \"İnce bağırsak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kalın bağırsak\", \"text\": \"Kalın bağırsak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anüs\", \"text\": \"Anüs\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda verilen organların hangileri karbonhidratların kimyasal sindirimini gerçekleştirir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ağız - mide\", \"text\": \"Ağız - mide\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağız - mide - ince bağırsak\", \"text\": \"Ağız - mide - ince bağırsak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağız - ince bağırsak\", \"text\": \"Ağız - ince bağırsak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ağız - kalın bağırsak\", \"text\": \"Ağız - kalın bağırsak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Sindirim sisteminin amacı aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Karnımızı doyurmak\", \"text\": \"Karnımızı doyurmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Besinlerin tadını almak\", \"text\": \"Besinlerin tadını almak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Besinleri hücrelere geçebilecek kadar küçültmek\", \"text\": \"Besinleri hücrelere geçebilecek kadar küçültmek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Besinleri bulamaç haline getirmek\", \"text\": \"Besinleri bulamaç haline getirmek\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest6Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi dolaşım sistemini oluşturan yapılardan biri değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kan\", \"text\": \"Kan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalp\", \"text\": \"Kalp\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kas\", \"text\": \"Kas\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Damarlar\", \"text\": \"Damarlar\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Kanın yapısında aşağıdaki kan hücrelerinden hangisi en fazla bulunur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Alyuvar\", \"text\": \"Alyuvar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Akyuvar\", \"text\": \"Akyuvar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kan pulcukları\", \"text\": \"Kan plazması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalın bağırsak\", \"text\": \"Kalın bağırsak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Kalbin yapısı ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kalp dört odacıklıdır.\", \"text\": \"Kalp dört odacıklıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalbin sol tarafında temiz kan vardır.\", \"text\": \"Kalbin sol tarafında temiz kan vardır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalp kanın pompalanmasını sağlar.\", \"text\": \"Kalp kanın pompalanmasını sağlar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalbin dakikadaki atış sayısına tansiyon denir.\", \"text\": \"Kalbin dakikadaki atış sayısına tansiyon denir.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki damarların hangisinde kirli kan bulunur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Aort atardamarı\", \"text\": \"Aort atardamarı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akciğer toplardamarı\", \"text\": \"Akciğer toplardamarı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akciğer atardamarı\", \"text\": \"Akciğer atardamarı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Böbrek atardamarı\", \"text\": \"Böbrek atardamarı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Vücut hücrelerine besin ve oksijen taşınmasını sağlayan, çok küçük damar aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Atardamar\", \"text\": \"Atardamar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Toplardamar\", \"text\": \"Toplardamar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Akciğer toplardamarı\", \"text\": \"Akciğer toplardamarı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kılcal damar\", \"text\": \"Kılcal damar\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest7Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Net kuvvet ile ilgili olarak aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İki yada daha fazla kuvvetin etkisini tek başına yapan kuvvete net kuvvet denir.\", \"text\": \"İki yada daha fazla kuvvetin etkisini tek başına yapan kuvvete net kuvvet denir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Net kuvvet R sembolü ile gösteriler.\", \"text\": \"Net kuvvet R sembolü ile gösteriler.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Net kuvvet bulunurken her zaman kuvvetlerin toplamı ile bulunur.\", \"text\": \"Net kuvvet bulunurken her zaman kuvvetlerin toplamı ile bulunur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Net kuvvetin diğer adı bileşke kuvvettir.\", \"text\": \"Net kuvvetin diğer adı bileşke kuvvettir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Dengelenmiş ve dengelenmemiş kuvvetler hakkında verilen bilgilerden hangisi doğrudur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dengelenmemiş kuvvetlerin etkisindeki cisimler her zaman yavaşlayarak hareket eder.\", \"text\": \"Dengelenmemiş kuvvetlerin etkisindeki cisimler her zaman yavaşlayarak hareket eder.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dengelenmiş kuvvetler etkisindeki cisimler sadece dururlar.\", \"text\": \"Dengelenmiş kuvvetler etkisindeki cisimler sadece dururlar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yer çekimi kuvveti ile yere düşen bütün cisimler dengelenmiş kuvvet etkisindedir.\", \"text\": \"Yer çekimi kuvveti ile yere düşen bütün cisimler dengelenmiş kuvvet etkisindedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dengelenmiş kuvvetlerde net kuvvet her zaman sıfırdır.\", \"text\": \"Dengelenmiş kuvvetlerde net kuvvet her zaman sıfırdır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Yokuş aşağı inen bisiklet için aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dengelenmiş kuvvetlerin etkisindedir.\", \"text\": \"Dengelenmiş kuvvetlerin etkisindedir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Dengelenmemiş kuvvetlerin etkisindedir.\", \"text\": \"Dengelenmemiş kuvvetlerin etkisindedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bileşke kuvvet sıfırdan farklıdır.\", \"text\": \"Bileşke kuvvet sıfırdan farklıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin sürati giderek artar.\", \"text\": \"Cismin sürati giderek artar.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Dengeleyici kuvvet ile ilgili verilen bilgilerden hangisi doğrudur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Net kuvvetle aynı yöndedir.\", \"text\": \"Net kuvvetle aynı yöndedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Etki ettiğinde net kuvvet sıfır olur.\", \"text\": \"Etki ettiğinde net kuvvet sıfır olur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Net kuvvetten büyüktür.\", \"text\": \"Net kuvvetten büyüktür.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Net kuvvetle doğrultuları farklıdır.\", \"text\": \"Net kuvvetle doğrultuları farklıdır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Limanda bağlı bir gemi için aşağıda verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gemiye yer çekimi kuvveti etki etmez.\", \"text\": \"Gemiye yer çekimi kuvveti etki etmez.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gemi dengelenmiş kuvvetlerin etkisindedir.\", \"text\": \"Gemi dengelenmiş kuvvetlerin etkisindedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Geminin ağırlığı bir kuvvet meydana getirir.\", \"text\": \"Geminin ağırlığı bir kuvvet meydana getirir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gemi üzerinde net kuvvet sıfırdır.\", \"text\": \"Gemi üzerinde net kuvvet sıfırdır.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest8Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi sürat birimi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"km/sa\", \"text\": \"km/sa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"m/sn\", \"text\": \"m/sn\", \"isCorrect\": false }," +
                "{ \"option_id\": \"km/sn\", \"text\": \"km/sn\", \"isCorrect\": false }," +
                "{ \"option_id\": \"km.sn\", \"text\": \"km.sn\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Ankara İstanbul arası 448 km'lik yolu 4 saatte giden otomobilin sürati kaç km/h'dir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"110 km/sa\", \"text\": \"110 km/sa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"112 km/sa\", \"text\": \"112 km/sa\", \"isCorrect\": true }," +
                "{ \"option_id\": \"114 km/sa\", \"text\": \"114 km/sa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"120 km/sa\", \"text\": \"120 km/sa\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda verilen hangisi süratin tanımıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Herhangi bir zamanda alınan yoldur.\", \"text\": \"Herhangi bir zamanda alınan yoldur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yolda geçen zamandır.\", \"text\": \"Yolda geçen zamandır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Birim zamanda alınan yoldur.\", \"text\": \"Birim zamanda alınan yoldur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Alınan yolun ölçüsüdür.\", \"text\": \"Alınan yolun ölçüsüdür.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda sürat ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Aynı yolu daha kısa sürede alan daha yavaştır.\", \"text\": \"Aynı yolu daha kısa sürede alan daha yavaştır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Aynı sürede daha fazla yol alan daha hızlıdır.\", \"text\": \"Aynı sürede daha fazla yol alan daha hızlıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"En kısa sürede en fazla yol giden en hızlıdır.\", \"text\": \"En kısa sürede en fazla yol giden en hızlıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"En kısa yol en kısa zamanda alınır.\", \"text\": \"En kısa yol en kısa zamanda alınır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisi sabit süratli hareketi tanımlar?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sürati sürekli değişen cisimlerin hareketidir.\", \"text\": \"Sürati sürekli değişen cisimlerin hareketidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sürati zamanla değişmeyen hareketdir.\", \"text\": \"Sürati zamanla değişmeyen hareketdir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sürati zamanla beraber sürekli artan harekettir.\", \"text\": \"Sürati zamanla beraber sürekli artan harekettir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Süratin zamanla beraber azalan harekettir.\", \"text\": \"Süratin zamanla beraber azalan harekettir.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest9Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Bir cismin süratini bulmak için aşağıdaki işlemlerden hangisi yapılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Alınan yol ve zaman çarpılmalıdır.\", \"text\": \"Alınan yol ve zaman çarpılmalıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Zaman ve alınan yol bölünmelidir.\", \"text\": \"Zaman ve alınan yol bölünmelidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Alınan yol zamana bölünmelidir.\", \"text\": \"Alınan yol zamana bölünmelidir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hızlanan bisiklet\", \"text\": \"Hızlanan bisiklet\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki örneklerden hangisinde cisim dengelenmiş kuvvetlerin etkisi altındadır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Masada duran kalem\", \"text\": \"Masada duran kalem\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yavaşlayan otomobil\", \"text\": \"Yavaşlayan otomobil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Daldan düşen elma\", \"text\": \"Daldan düşen elma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"120 km/sa\", \"text\": \"120 km/sa\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Sabit süratle giden bisiklete sonradan hareket yönünde 10 Newton'luk kuvvet uygulandığında aşağıdakilerden hangisi gerçekleşir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hızlanır\", \"text\": \"Hızlanır\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yavaşlar\", \"text\": \"Yavaşlar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sabit süratle gider\", \"text\": \"Sabit süratle gider\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Durur\", \"text\": \"Durur\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki örneklerden hangisinde cisim dengelenmiş kuvvetlerin etkisi altındadır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Masada duran kalem\", \"text\": \"Masada duran kalem\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yavaşlayan otomobil\", \"text\": \"Yavaşlayan otomobil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Daldan düşen elma\", \"text\": \"Daldan düşen elma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hızlanan bisiklet\", \"text\": \"Hızlanan bisiklet\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisi kuvvetin özelliklerinden birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yönü\", \"text\": \"Yönü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğrultusu\", \"text\": \"Doğrultusu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Uzunluğu\", \"text\": \"Uzunluğu\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Büyüklüğü\", \"text\": \"Büyüklüğü\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest10Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi sıkıştırılamaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pamuk\", \"text\": \"Pamuk\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Su\", \"text\": \"Su\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sünger\", \"text\": \"Sünger\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bütün maddeler taneciklerden oluşmuştur.\", \"text\": \"Bütün maddeler taneciklerden oluşmuştur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Maddeler bütünsel yapıya sahiptir.\", \"text\": \"Maddeler bütünsel yapıya sahiptir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gaz maddeler sıkıştırılabilir.\", \"text\": \"Gaz maddeler sıkıştırılabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütlesi ve hacmi olan her şey maddedir.\", \"text\": \"Kütlesi ve hacmi olan her şey maddedir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi madde değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Su\", \"text\": \"Su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektrik\", \"text\": \"Elektrik\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Alkol\", \"text\": \"Alkol\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bütün maddeler gözle görülemeyecek kadar küçük taneciklerden oluşmuştur.\", \"text\": \"Bütün maddeler gözle görülemeyecek kadar küçük taneciklerden oluşmuştur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sıvı maddeler titreşim hareketi yapar.\", \"text\": \"Sıvı maddeler titreşim hareketi yapar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gaz maddeler bulundukları kabın her yerini doldurur.\", \"text\": \"Gaz maddeler bulundukları kabın her yerini doldurur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Katı maddeler akışkandır.\", \"text\": \"Katı maddeler akışkandır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki olaylardan hangisi maddenin tanecikli yapıda olduğunu ispatlamaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Suyun sıkıştırılamaması\", \"text\": \"Suyun sıkıştırılamaması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mürekkebin suda dağılması\", \"text\": \"Mürekkebin suda dağılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kokunun havada dağılması\", \"text\": \"Kokunun havada dağılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tuzun suda çözünmesi\", \"text\": \"Tuzun suda çözünmesi\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest11Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Hacimleri birbirine eşit A maddesinin kütlesi 8 g, B maddesinin kütlesi 12 g ve C maddesinin kütlesi 20 g'dır. Bu maddelerin yoğunluklarını büyükten küçüğe sıralayınız?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"A > B > C\", \"text\": \"A > B > C\", \"isCorrect\": false }," +
                "{ \"option_id\": \"B > A > C\", \"text\": \"B > A > C\", \"isCorrect\": false }," +
                "{ \"option_id\": \"C > B > A\", \"text\": \"C > B > A\", \"isCorrect\": true }," +
                "{ \"option_id\": \"C > A > B\", \"text\": \"C > A > B\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Yoğunluk ile ilgili olarak verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kütle ve hacim doğru orantılıdır.\", \"text\": \"Kütle ve hacim doğru orantılıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütle ve yoğunluk ile değişmez.\", \"text\": \"Kütle ve yoğunluk ile değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hacim ve yoğunluk ile değişmez.\", \"text\": \"Hacim ve yoğunluk ile değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yoğunluk ve kütle ters orantılıdır.\", \"text\": \"Yoğunluk ve kütle ters orantılıdır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Hacimleri eşit, yoğunlukları da A > B > C olan maddeler için kütleleri arasındaki ilişki aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"A > B > C\", \"text\": \"A > B > C\", \"isCorrect\": true }," +
                "{ \"option_id\": \"B > A > C\", \"text\": \"B > A > C\", \"isCorrect\": false }," +
                "{ \"option_id\": \"C > B > A\", \"text\": \"C > B > A\", \"isCorrect\": false }," +
                "{ \"option_id\": \"C > A > B\", \"text\": \"C > A > B\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Kütlesi 10 gram olan plastik topun yoğunluğunu azaltabilmek için aşağıdakilerden hangisi yapılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kütlesi değiştirilmeden hacmi azaltılmalıdır.\", \"text\": \"Kütlesi değiştirilmeden hacmi azaltılmalıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütlesi ve hacmi aynı oranda artırılmalıdır.\", \"text\": \"Kütlesi ve hacmi aynı oranda artırılmalıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütlesi değiştirilmeden hacmi artırılmalıdır.\", \"text\": \"Kütlesi değiştirilmeden hacmi artırılmalıdır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hacmi değiştirilmeden kütlesi artırılmalıdır.\", \"text\": \"Hacmi değiştirilmeden kütlesi artırılmalıdır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıda verilen cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yoğunluğu suyun yoğunluğundan fazla olan cisimler su içerisinde batar.\", \"text\": \"Yoğunluğu suyun yoğunluğundan fazla olan cisimler su içerisinde batar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yoğunluğu suyun yoğunluğundan az olan cisimler su içerisinde yüzer.\", \"text\": \"Yoğunluğu suyun yoğunluğundan az olan cisimler su içerisinde yüzer.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yoğunluğu suyun yoğunluğu ile eşit olan cisimler su içerisinde askıda kalır.\", \"text\": \"Yoğunluğu suyun yoğunluğu ile eşit olan cisimler su içerisinde askıda kalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yoğunluğu suyun yoğunluğu ile eşit olan cisimler su içerisinde batar.\", \"text\": \"Yoğunluğu suyun yoğunluğu ile eşit olan cisimler su içerisinde batar.\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest12Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi fosil yakıt değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğalgaz\", \"text\": \"Doğalgaz\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Odun\", \"text\": \"Odun\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Taş kömürü\", \"text\": \"Taş kömürü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Petrol\", \"text\": \"Petrol\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi yenilenebilir enerji kaynağıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kömür\", \"text\": \"Kömür\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğalgaz\", \"text\": \"Doğalgaz\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Nükleer yakıt\", \"text\": \"Nükleer yakıt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Rüzgar\", \"text\": \"Rüzgar\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi katı yakıt değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Linyit\", \"text\": \"Linyit\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Odun kömürü\", \"text\": \"Odun kömürü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Motorin\", \"text\": \"Motorin\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Taş kömürü\", \"text\": \"Taş kömürü\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi daha az çevre kirliliğine neden olur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğalgaz\", \"text\": \"Doğalgaz\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Motorin\", \"text\": \"Motorin\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fuel oil\", \"text\": \"Fuel oil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Linyit\", \"text\": \"Linyit\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Kullandığımız bütün enerjilerin kaynağı nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kömür\", \"text\": \"Kömür\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Petrol\", \"text\": \"Petrol\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş\", \"text\": \"Güneş\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Jeotermal\", \"text\": \"Jeotermal\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest13Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıda verilenlerden hangisi sesin gazlarda yayılmasına örnektir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Demir yolu raylarında treninin sesinin duyulması.\", \"text\": \"Demir yolu raylarında treninin sesinin duyulması.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Televizyonda film izlerken sesi duymamız\", \"text\": \"Televizyonda film izlerken sesi duymamız\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Su içerisinde birbirine vurulan taşların ses oluşturması\", \"text\": \"Su içerisinde birbirine vurulan taşların ses oluşturması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Plastik bardaklardan telefon yapılması\", \"text\": \"Plastik bardaklardan telefon yapılması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilenlerden hangisi sesin katılarda yayıldığını gösterir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş'te meydana gelen patlamaların Dünya'ya gelmemesi\", \"text\": \"Güneş'te meydana gelen patlamaların Dünya'ya gelmemesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Üst kattaki komşumuzun sesinin alt katta duyulması\", \"text\": \"Üst kattaki komşumuzun sesinin alt katta duyulması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gemilerde sonar cihazının kullanılması\", \"text\": \"Gemilerde sonar cihazının kullanılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yıldırım düştükten sonra sesin gelmesi\", \"text\": \"Yıldırım düştükten sonra sesin gelmesi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Elif sesin gazlarda yayılmasına örnekler verecektir, aşağıdaki verdiği örneklerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sınıfta oluşan seslerin koridorda duyulması\", \"text\": \"Sınıfta oluşan seslerin koridorda duyulması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Vadide bağırdığımızda yankı oluşması\", \"text\": \"Vadide bağırdığımızda yankı oluşması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Balinaların birbiri ile haberleşmesi\", \"text\": \"Balinaların birbiri ile haberleşmesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kafesteki papağanın sesimizi taklit etmesi\", \"text\": \"Kafesteki papağanın sesimizi taklit etmesi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Sokakta seyyar satıcının çıkardığı ses odamızda duyulmaktadır, bu olay sırasında ses hangi ortamlardan geçerek bize ulaşır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gaz - Katı - Gaz\", \"text\": \"Gaz - Katı - Gaz\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Katı - Gaz\", \"text\": \"Katı - Gaz\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Katı - Gaz - Katı\", \"text\": \"Katı - Gaz - Katı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gaz - Gaz - Katı\", \"text\": \"Gaz - Gaz - Katı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Ses maddesel ortamda yayılmaktadır, aşağıdaki ortamlardan hangisi sesin yayılmasını engeller?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ses kaynağını kalın duvar içerisine yerleştirmek.\", \"text\": \"Ses kaynağını kalın duvar içerisine yerleştirmek.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kaynağını sessiz bir ortama yerleştirmek.\", \"text\": \"Ses kaynağını sessiz bir ortama yerleştirmek.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kaynağını soğutmak\", \"text\": \"Ses kaynağını soğutmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kaynağının etrafındaki maddesel ortamı kaldırmak\", \"text\": \"Ses kaynağının etrafındaki maddesel ortamı kaldırmak\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest14Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Kalemle camdan yapılmış su bardağı ile çay bardağına vuruluyor. Çıkan seslerin birbirinden farklı olduğu görülüyor. Aşağıdakilerden hangisi çıkan seslerin birbirinden farklı olmasının sebebidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kalemin tahtadan yapılmış olması\", \"text\": \"Kalemin tahtadan yapılmış olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bardakların şekillerinin farklı olması\", \"text\": \"Bardakların şekillerinin farklı olması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bardakların camdan yapılmış olması\", \"text\": \"Bardakların camdan yapılmış olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kalemlerin vurulma hızlarının farklı olması\", \"text\": \"Kalemlerin vurulma hızlarının farklı olması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Su içerisinde gitarını çalan müzisyen, gitardan gelen seslerin farklı olduğunu duymuştur. Su içerisinde sesin havadakinden farklı çıkmasının sebebi aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Suyun içerisinde sesin daha hızlı yayılması\", \"text\": \"Suyun içerisinde sesin daha hızlı yayılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sesin havada daha yavaş yayılması\", \"text\": \"Sesin havada daha yavaş yayılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sesin yayıldığı ortamların birbirinden farklı olması\", \"text\": \"Sesin yayıldığı ortamların birbirinden farklı olması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Suyun taneciklerinin birbirine yakın olması\", \"text\": \"Suyun taneciklerinin birbirine yakın olması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki verilenlerden hangisinde ses, hava ortamından farklı bir şekilde duyulur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Demir yolu rayına kulağımızı dayadığımızda duyulan ses\", \"text\": \"Demir yolu rayına kulağımızı dayadığımızda duyulan ses\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Trampete kalın sopa ile vurulduğunda oluşan ses\", \"text\": \"Trampete kalın sopa ile vurulduğunda oluşan ses\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Plastik ve cam bardağa vurulunca çıkan sesler\", \"text\": \"Plastik ve cam bardağa vurulunca çıkan sesler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kaynağına yakın olduğumuzda duyulan sesler\", \"text\": \"Ses kaynağına yakın olduğumuzda duyulan sesler\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Cam bardak ve plastik bardak aynı yere düştüğünde farklı sesler çıkarır, bardakların farklı sesler çıkarmasının sebebi nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yerin sert olması\", \"text\": \"Yerin sert olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bardakların düşme hızlarının farklı olması\", \"text\": \"Bardakların düşme hızlarının farklı olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cam bardağın kırılması\", \"text\": \"Cam bardağın kırılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bardakların yapıldıkları maddelerin birbirinden farklı olması\", \"text\": \"Bardakların yapıldıkları maddelerin birbirinden farklı olması\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Suda yüzen Cansu, başı su içerisindeyken taşları birbirine vuruyor. Taşlardan çıkan seslerin normalden farklı olduğunu duyuyor. Cansu'nun yaptığı bu deneyden hangi sonuç çıkarılabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Taşlar her yerde aynı sesi çıkarır.\", \"text\": \"Taşlar her yerde aynı sesi çıkarır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kaynağından uzaklaştıkça sesin şiddeti azalır.\", \"text\": \"Ses kaynağından uzaklaştıkça sesin şiddeti azalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Farklı maddelerin çıkardıkları sesler de farklıdır\", \"text\": \"Farklı maddelerin çıkardıkları sesler de farklıdır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ortamların farklı olması çıkan sesleri değiştirir\", \"text\": \"Ortamların farklı olması çıkan sesleri değiştirir\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest15Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki ortamların hangisinde sesin sürati daha fazladır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Su\", \"text\": \"Su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Alkol\", \"text\": \"Alkol\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tahta\", \"text\": \"Tahta\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki olaylardan hangisi sesin enerji olduğunu göstermek için kullanılabilecek bir örnek değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Alçaktan uçan uçakların evlerin pencere camını kırması\", \"text\": \"Alçaktan uçan uçakların evlerin pencere camını kırması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Evlerde çift camlı pencere kullanılması\", \"text\": \"Evlerde çift camlı pencere kullanılması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Opera sanatçıların çıkardıkları sesle bardağı kırması\", \"text\": \"Opera sanatçıların çıkardıkları sesle bardağı kırması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hoparlör önüne yerleştirilen mumun sesle hareket etmesi\", \"text\": \"Hoparlör önüne yerleştirilen mumun sesle hareket etmesi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Sesle ilgili olarak aşağıda verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ses maddesel ortamda yayılır.\", \"text\": \"Ses maddesel ortamda yayılır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sesin hızı ışık hızından azdır.\", \"text\": \"Sesin hızı ışık hızından azdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses enerjisi elektrik enerjisine dönüşebilir.\", \"text\": \"Ses enerjisi elektrik enerjisine dönüşebilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ortamın sıcaklığının artması sesin hızını azaltır.\", \"text\": \"Ortamın sıcaklığının artması sesin hızını azaltır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki araçların hangisinde ses enerjisinin dönüşümü yoktur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Teleskop\", \"text\": \"Teleskop\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mikrofon\", \"text\": \"Mikrofon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kayıt cihazı\", \"text\": \"Ses kayıt cihazı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Telefon\", \"text\": \"Telefon\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Ses dalgalarının enerjisinden yararlanılarak çeşitli araçlar geliştirilmiştir. Bu araçlara aşağıdakilerden hangisi örnek verilebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Radar\", \"text\": \"Radar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sonar\", \"text\": \"Sonar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Taş kırma cihazı\", \"text\": \"Taş kırma cihazı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses kayıt cihazı\", \"text\": \"Ses kayıt cihazı\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest16Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıda verilen reflekslerden hangisi sonradan kazanılan reflekstir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yüksek seste irkilme\", \"text\": \"Yüksek seste irkilme\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Limon görünce ağzın sulanması\", \"text\": \"Limon görünce ağzın sulanması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Loş ortamda göz bebeğinin küçülmesi\", \"text\": \"Loş ortamda göz bebeğinin küçülmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elimize iğne batınca elimizi çekmemiz\", \"text\": \"Elimize iğne batınca elimizi çekmemiz\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Beyin kafatası içerisinde yer alan en önemli organlarımızdan birisidir. Aşağıda verilen bilgilerden hangisi beyinin görevlerinden birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kan basıncını ayarlamak\", \"text\": \"Kan basıncını ayarlamak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Vücut sıcaklığını ayarlamak\", \"text\": \"Vücut sıcaklığını ayarlamak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Acıkma ve susama durumlarını düzenlemek\", \"text\": \"Acıkma ve susama durumlarını düzenlemek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İç organların çalışmasını kontrol etmek\", \"text\": \"İç organların çalışmasını kontrol etmek\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Merkezi sinir sistemiyle ilgili olarak verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Beyin vücudumuzun hafıza ve denge merkezidir.\", \"text\": \"Beyin vücudumuzun hafıza ve denge merkezidir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Omurilik soğanı solunum, dolaşım, sindirim sistemlerinin çalışmasını sağlar.\", \"text\": \"Omurilik soğanı solunum, dolaşım, sindirim sistemlerinin çalışmasını sağlar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Beyincik kol ve bacak kaslarının uyumlu çalışmasını sağlar.\", \"text\": \"Beyincik kol ve bacak kaslarının uyumlu çalışmasını sağlar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Omurilik beyin ile diğer organların iletişimini sağlar.\", \"text\": \"Omurilik beyin ile diğer organların iletişimini sağlar.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda verilen olaylardan hangisi beyin tarafından gerçekleştirilmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hayal kurmak\", \"text\": \"Hayal kurmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fazla ışıkta göz bebeğinin küçülmesini sağlamak\", \"text\": \"Fazla ışıkta göz bebeğinin küçülmesini sağlamak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Vücut sıcaklığının ayarlanmasını sağlamak\", \"text\": \"Vücut sıcaklığının ayarlanmasını sağlamak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Öğrenilen bilgilerin hafızada saklanmasını sağlamak\", \"text\": \"Öğrenilen bilgilerin hafızada saklanmasını sağlamak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Sinir sistemi hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sinir sistemi merkezi ve çevresel olarak ikiye ayrılır.\", \"text\": \"Sinir sistemi merkezi ve çevresel olarak ikiye ayrılır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Merkezi sinir sisteminin en gelişmiş organı beyindir.\", \"text\": \"Merkezi sinir sisteminin en gelişmiş organı beyindir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Beyin duyu merkezimizdir.\", \"text\": \"Beyin duyu merkezimizdir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Omurilik soğanı çalışmayan insan yaşayabilir.\", \"text\": \"Omurilik soğanı çalışmayan insan yaşayabilir.\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest17Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Duyu organları hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Duyu organları beş tanedir.\", \"text\": \"Duyu organları beş tanedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Deri vücut sıcaklığının ayarlanmasında görev alır.\", \"text\": \"Deri vücut sıcaklığının ayarlanmasında görev alır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Burun, dil ile beraber tat almada görevlidir.\", \"text\": \"Burun, dil ile beraber tat almada görevlidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dilin ucu sadece tatlı tadı algılar.\", \"text\": \"Dilin ucu sadece tatlı tadı algılar.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Elif, kitabında yazanları okumakta zorluk çekmekte, Ali de tahtada yazılanları göremediğini söylemektedir. Elif ve Ali'nin göz kusurları sırası ile aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Miyop, hipermetrop\", \"text\": \"Miyop, hipermetrop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hipermetrop, miyop\", \"text\": \"Hipermetrop, miyop\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Astigmat, hipermetrop\", \"text\": \"Astigmat, hipermetrop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Katarakt, miyop\", \"text\": \"Katarakt, miyop\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda verilen göz kusurlarından hangisinin tedavisi yoktur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Miyop\", \"text\": \"Miyop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Renk körlüğü\", \"text\": \"Renk körlüğü\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hipermetrop\", \"text\": \"Hipermetrop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Katarakt\", \"text\": \"Katarakt\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Kulak sağlığını korumak için aşağıda verilenlerden hangisinin yapılması gerekir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kirli sularda yüzülmelidir.\", \"text\": \"Kirli sularda yüzülmelidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kulağımızı kulak çöpleri ile temizlenmelidir.\", \"text\": \"Kulağımızı kulak çöpleri ile temizlenmelidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yüksek sesle müzik dinlenmelidir.\", \"text\": \"Yüksek sesle müzik dinlenmelidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kulağımız soğuktan korunmalıdır.\", \"text\": \"Kulağımız soğuktan korunmalıdır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Duyu organlarının sağlığına dikkat eden kişi aşağıdakilerden hangisini yapmamalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Çok sıcak ve çok soğuk besinler tüketmemek\", \"text\": \"Çok sıcak ve çok soğuk besinler tüketmemek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneşte uzun süre kalmamak\", \"text\": \"Güneşte uzun süre kalmamak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Burnumuz kanadığında sırt üstü yatmak\", \"text\": \"Burnumuz kanadığında sırt üstü yatmak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Burun kıllarını koparmamak\", \"text\": \"Burun kıllarını koparmamak\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest18Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Sigara, alkol gibi bağımlılıklarla mücadele eden kuruluş aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kızılay\", \"text\": \"Kızılay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yeşilay\", \"text\": \"Yeşilay\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sağlık Bakanlığı\", \"text\": \"Sağlık Bakanlığı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Milli Eğitim Bakanlığı\", \"text\": \"Milli Eğitim Bakanlığı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Denetleyici ve düzenleyici sistemlerin sağlığı için aşağıdakilerden hangisini yapmamız doğru olmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Düzenli uyumak\", \"text\": \"Düzenli uyumak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yağlı gıdaları az tüketmek\", \"text\": \"Yağlı gıdaları az tüketmek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Aşırı kafein tüketiminden uzak durmak\", \"text\": \"Aşırı kafein tüketiminden uzak durmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Egzersizden uzak durmak\", \"text\": \"Egzersizden uzak durmak\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda verilen davranışlardan hangisinin yapılması destek ve hareket sistemini olumsuz etkiler?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kemik gelişimi için süt ve süt ürünleri tüketmek\", \"text\": \"Kemik gelişimi için süt ve süt ürünleri tüketmek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kola tüketimini artırmak\", \"text\": \"Kola tüketimini artırmak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yaşımıza uygun sporlar yapmak\", \"text\": \"Yaşımıza uygun sporlar yapmak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağır cisimler kaldırmamak\", \"text\": \"Ağır cisimler kaldırmamak\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda verilenlerden hangisi solunum sistemi hastalığıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Felç\", \"text\": \"Felç\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sarılık\", \"text\": \"Sarılık\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Zattüre\", \"text\": \"Zattüre\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Üremi\", \"text\": \"Üremi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıda verilen bezlerden hangisinin salgıladığı hormonun fazla salgılanması sonucu devlik hastalığı ortaya çıkar?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hipofiz\", \"text\": \"Hipofiz\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Tiroit\", \"text\": \"Tiroit\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Pankreas\", \"text\": \"Pankreas\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Testis\", \"text\": \"Testis\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest19Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki maddelerden hangisi yalıtkan maddedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bakır\", \"text\": \"Bakır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Alüminyum folyo\", \"text\": \"Alüminyum folyo\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tuzlu su\", \"text\": \"Tuzlu su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Silgi\", \"text\": \"Silgi\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki maddelerden hangisi iletken maddedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Şekerli su\", \"text\": \"Şekerli su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kolonya\", \"text\": \"Kolonya\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kurşun kalem ucu\", \"text\": \"Kurşun kalem ucu\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hava\", \"text\": \"Hava\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki araçların hangisinde elektrik iletkeni ve yalıtkanı bir arada bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ütü\", \"text\": \"Ütü\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Eldiven\", \"text\": \"Eldiven\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Elektrik sobası\", \"text\": \"Elektrik sobası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Televizyon\", \"text\": \"Televizyon\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Elektrik direklerinde kablolardaki elektriğin yalıtılması için aşağıdaki maddelerden hangisi kullanılmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Krom\", \"text\": \"Krom\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Cam\", \"text\": \"Cam\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Porselen\", \"text\": \"Porselen\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Plastik\", \"text\": \"Plastik\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Elektrik direklerinde ucuz ve hafif olması nedeni ile kullanılan metal aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Alümüniyum\", \"text\": \"Alümüniyum\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bakır\", \"text\": \"Bakır\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gümüş\", \"text\": \"Gümüş\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Krom\", \"text\": \"Krom\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest20Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"İletken maddelerin elektriği iletmeleri aynı değildir. Aşağıdaki maddelerden hangisinin elektrik iletkenliği daha fazladır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bakır\", \"text\": \"Bakır\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kalem ucu\", \"text\": \"Kalem ucu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Plastik\", \"text\": \"Plastik\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Saf su\", \"text\": \"Saf su\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Elektrik iletimi ile ilgili olarak aşağıdaki verilen cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Gazlar da iletken hale geçebilir.\", \"text\": \"Gazlar da iletken hale geçebilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yalıtkan maddeler her zaman yalıtkanlık özelliği göstermez.\", \"text\": \"Yalıtkan maddeler her zaman yalıtkanlık özelliği göstermez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İletken maddeler elektrik iletiminde gereklidir, yalıtkan maddelere ise gerek yoktur.\", \"text\": \"İletken maddeler elektrik iletiminde gereklidir, yalıtkan maddelere ise gerek yoktur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yıldırım ve şimşek gazların da iletken olabileceğini gösterir.\", \"text\": \"Yıldırım ve şimşek gazların da iletken olabileceğini gösterir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Elektik çarpan bir kişiye aşağıdakilerden hangisi yapılmamalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sigortaları kapatmak.\", \"text\": \"Sigortaları kapatmak.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektriğin çarptığı kişiyi elinden tutarak çekmek\", \"text\": \"Elektriğin çarptığı kişiyi elinden tutarak çekmek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Giysi gibi yalıtkan yerlerinden tutarak çekmek\", \"text\": \"Giysi gibi yalıtkan yerlerinden tutarak çekmek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yetkili kişilere haber vermek\", \"text\": \"Yetkili kişilere haber vermek\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki elektrik devresinde ampulün yanması için kabloların ucuna aşağıdakilerden hangisi yerleştirilebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Metal anahtar\", \"text\": \"Metal anahtar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kağıt\", \"text\": \"Kağıt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cam\", \"text\": \"Porselen\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Plastik\", \"text\": \"Plastik\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki davranışlardan hangisi elektrik kazalarına sebep olabilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bir prize birden fazla fiş takmak.\", \"text\": \"Bir prize birden fazla fiş takmak.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kullanılan elektrikli araçların TSE belgeli olması\", \"text\": \"Kullanılan elektrikli araçların TSE belgeli olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yıpranmış fiş ve kablo kullanmamak.\", \"text\": \"Yıpranmış fiş ve kablo kullanmamak.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektrikli araçları banyoda kullanmamak.\", \"text\": \"Elektrikli araçları banyoda kullanmamak.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest21Grade6()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Bir maddenin elektrik enerjisinin iletimine karşı gösterdiği zorluğa ............... denir? Yukarıdaki cümle aşağıdaki kelimelerden hangisi ile doldurulmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Akım\", \"text\": \"Akım\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Direnç\", \"text\": \"Direnç\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Zorluk\", \"text\": \"Zorluk\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ohm\", \"text\": \"Ohm\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Direnç aşağıdaki araçlardan hangisi ile ölçülür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ohmmetre\", \"text\": \"Ohmmetre\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampermetre\", \"text\": \"Ampermetre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Metre\", \"text\": \"Metre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Voltmetre\", \"text\": \"Voltmetre\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Akkor filamanlı ampulün içerisinde bulunan telin direncinin fazla olması istenmektedir. Aşağıdakilerden hangisinin yapılması filamanın direncini artırmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Telin uzun yapılması\", \"text\": \"Telin uzun yapılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Telin ince yapılması\", \"text\": \"Telin ince yapılması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Telin kalın yapılması\", \"text\": \"Telin kalın yapılması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Telin tungstenden yapılması\", \"text\": \"Telin tungstenden yapılması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Ayarlanabilen dirençlere reosta denir. Aşağıdaki yerlerden hangisinde reosta kullanılmamıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Reostalı lamba\", \"text\": \"Reostalı lamba\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ses açma düğmesi\", \"text\": \"Ses açma düğmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fırın\", \"text\": \"Fırın\", \"isCorrect\": false }," +
                "{ \"option_id\": \"El feneri\", \"text\": \"El feneri\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki cümlelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bütün elektrikli araçların direnci vardır.\", \"text\": \"Bütün elektrikli araçların direnci vardır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Basit elektrik devresinde elektrik direnci arttıkça ampul parlaklığı azalır.\", \"text\": \"Basit elektrik devresinde elektrik direnci arttıkça ampul parlaklığı azalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Telin kesiti azaltılınca direnç artar.\", \"text\": \"Telin kesiti azaltılınca direnç artar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Direnç, iletkenin boyu ile ters orantılıdır.\", \"text\": \"Direnç, iletkenin boyu ile ters orantılıdır.\", \"isCorrect\": true }" +
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
                "\"text\": \"Uzay teleskobunun uzayda bulunma sebebi nedir?\"," +
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

    public ResponseEntity<Object> getTest4Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Hücrenin temel kısımlarının içten dışa doğru sıralaması hangi seçenekte doğru verilmiştir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hücre zarı - sitoplazma - çekirdek\", \"text\": \"Hücre zarı - sitoplazma - çekirdek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hücre zarı - çekirdek - sitoplazma\", \"text\": \"Hücre zarı - çekirdek - sitoplazma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çekirdek - sitoplazma - hücre zarı\", \"text\": \"Çekirdek - sitoplazma - hücre zarı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sitoplazma - çekirdek - hücre zarı\", \"text\": \"Sitoplazma - çekirdek - hücre zarı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Hangi seçenekte verilen organellerden hangisi hem insanda, hem de menekşe bitkisinin hücrelerinde görülür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kloroplast\", \"text\": \"Kloroplast\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sentrozom\", \"text\": \"Sentrozom\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ribozom\", \"text\": \"Ribozom\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Lizozom\", \"text\": \"Lizozom\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi hücrenin temel kısımlarından biri değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hücre zarı\", \"text\": \"Hücre zarı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hücre duvarı\", \"text\": \"Hüvre duvarı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Çekirdek\", \"text\": \"Çekirdek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sitoplazma\", \"text\": \"Sitoplazma\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Canlıların canlılık özelliği gösteren en küçük yapı birimine ne denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sitoplazma\", \"text\": \"Sitoplazma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doku\", \"text\": \"Doku\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Organizma\", \"text\": \"Organizma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hücre\", \"text\": \"Hücre\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Hücreye şekil veren ve seçici geçirgen olan hücrenin hangi kısmıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Endoplazmik retikulum\", \"text\": \"Endoplazmik retikulum\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hücre duvarı\", \"text\": \"Hücre duvarı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hücre zarı\", \"text\": \"Hücre zarı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Çekirdek\", \"text\": \"Çekirdek\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest5Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki hücrelerden hangileri mitoz bölünme geçiremez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Deri hücresi\", \"text\": \"Deri hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sinir hücresi\", \"text\": \"Sinir hücresi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Karaciğer hücresi\", \"text\": \"Karaciğer hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Amip hücresi\", \"text\": \"Amip hücresi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilen özelliklerden hangisi mitoz bölünmeye ait değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kromozom sayısı değişmez.\", \"text\": \"Kromozom sayısı değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Oluşan hücreler ana hücre ile benzer özellikler gösterir.\", \"text\": \"Oluşan hücreler ana hücre ile benzer özellikler gösterir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mitoz bölünme geçiren hücre bir daha bölünemez.\", \"text\": \"Mitoz bölünme geçiren hücre bir daha bölünemez.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mitoz bölünme tek hücreli canlılarda üremeyi sağlar.\", \"text\": \"Mitoz bölünme tek hücreli canlılarda üremeyi sağlar.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Bir hücre ardı ardına 4 mitoz bölünme geçirirse kaç hücre oluşur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"2\", \"text\": \"2\", \"isCorrect\": false }," +
                "{ \"option_id\": \"4\", \"text\": \"4\", \"isCorrect\": false }," +
                "{ \"option_id\": \"8\", \"text\": \"8\", \"isCorrect\": false }," +
                "{ \"option_id\": \"16\", \"text\": \"16\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"İnsan vücut hücrelerinin kromozom sayısı 46'dır. Vücut hücrelerinden biri, iki defa mitoz bölünme geçirdiğinde her bir hücrenin kromozom sayısı kaç olur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"2\", \"text\": \"2\", \"isCorrect\": false }," +
                "{ \"option_id\": \"4\", \"text\": \"4\", \"isCorrect\": false }," +
                "{ \"option_id\": \"23\", \"text\": \"23\", \"isCorrect\": false }," +
                "{ \"option_id\": \"46\", \"text\": \"46\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki olaylardan hangisi mitoz bölünmeyle gerçekleşmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Fasulye tohumlarının çimlenmesi\", \"text\": \"Fasulye tohumlarının çimlenmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Civcivin tavuk olması\", \"text\": \"Civcivin tavuk olması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Amip canlısının büyümesi\", \"text\": \"Amip canlısının büyümesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"İnsanın büyümesi\", \"text\": \"İnsanın büyümesi\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest6Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki hücrelerden hangisi mayoz bölünme ile oluşur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Deri hücresi\", \"text\": \"Deri hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kas hücresi\", \"text\": \"Kas hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Epitel hücresi\", \"text\": \"Epitel hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yumurta hücresi\", \"text\": \"Yumurta hücresi\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki hücrelerden hangisi mayoz bölünme geçirebilir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yumurta hücresi\", \"text\": \"Yumurta hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sperm ana hücresi\", \"text\": \"Sperm ana hücresi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yaprak hücresi\", \"text\": \"Yaprak hücresi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Polen hücresi\", \"text\": \"Polen hücresi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi mayoz bölünme sonucu oluşur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Zigot\", \"text\": \"Zigot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Embriyo\", \"text\": \"Embriyo\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sperm\", \"text\": \"Sperm\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sperm ana hücresi\", \"text\": \"Sperm ana hücresi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"2n = 500 kromozomlu bir hücrenin mayoz bölünme sonucu aşağıdakilerden hangisi meydana gelir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"n = 250 kromozomlu 4 hücre\", \"text\": \"n = 250 kromozomlu 4 hücre\", \"isCorrect\": true }," +
                "{ \"option_id\": \"2n = 250 kromozomlu 4 hücre\", \"text\": \"2n = 250 kromozomlu 4 hücre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"n = 500 kromozomlu 4 hücre\", \"text\": \"n = 500 kromozomlu 4 hücre\", \"isCorrect\": false }," +
                "{ \"option_id\": \"n = 250 kromozomlu 2 hücre\", \"text\": \"n = 250 kromozomlu 2 hücre\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Mayoz bölünme ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Mayoz bölünme sonucu üreme hücreleri oluşur.\", \"text\": \"Mayoz bölünme sonucu üreme hücreleri oluşur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mayoz bölünme tek hücreli canlılarda üremeyi sağlar\", \"text\": \"Mayoz bölünme tek hücreli canlılarda üremeyi sağlar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mayoz bölünme canlının belirli yaşam dönemlerinde görülür.\", \"text\": \"Mayoz bölünme canlının belirli yaşam dönemlerinde görülür.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mayoz bölünme eşeyli üremenin temelini oluşturur.\", \"text\": \"Mayoz bölünme eşeyli üremenin temelini oluşturur.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest7Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Dünya'da kütlesi 2 kg olan bir cismin ağırlığı nedir? (Yer çekim kuvveti 10 N alınacaktır.)\"," +
                "\"options\": [" +
                "{ \"option_id\": \"2N\", \"text\": \"2N\", \"isCorrect\": false }," +
                "{ \"option_id\": \"10N\", \"text\": \"10N\", \"isCorrect\": false }," +
                "{ \"option_id\": \"20N\", \"text\": \"20N\", \"isCorrect\": true }," +
                "{ \"option_id\": \"200N\", \"text\": \"200N\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Kütle ve ağırlık hakkında verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kütle değişmeyen madde miktarıdır.\", \"text\": \"Kütle değişmeyen madde miktarıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütle uzayda değişmez.\", \"text\": \"Kütle uzayda değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ağırlık gezegenin büyüklüğüne göre değişir.\", \"text\": \"Ağırlık gezegenin büyüklüğüne göre değişir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cisimlerin kütlesi arttıkça ağırlığı azalır.\", \"text\": \"Cisimlerin kütlesi arttıkça ağırlığı azalır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Kutuplardan ekvatora götürülen bir cismin kütlesi ve ağırlığı nasıl değişir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kütle Değişmez, ağırlık artar\", \"text\": \"Kütle değişmez, ağırlık artar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütle değişmez, ağırlık azalır\", \"text\": \"Kütle değişmez, ağırlık azalır\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kütle artar, ağırlık değişmez\", \"text\": \"Kütle artar, ağırlık değişmez\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kütle azalır, ağırlık değişmez\", \"text\": \"Kütle azalır, ağırlık değişmez\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisi kütle birimi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kilogram\", \"text\": \"Kilogram\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gram\", \"text\": \"Gram\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Newton\", \"text\": \"Newton\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ton\", \"text\": \"Ton\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Dünya'da bulunan bir cismin ağırlığını aşağıdakilerden hangisi etkilemez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kütlesi\", \"text\": \"Kütlesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dünya'nın kütle çekim kuvveti\", \"text\": \"Dünya'nın kütle çekim kuvveti\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin deniz seviyesinde yüksekliği\", \"text\": \"Cismin deniz seviyesinde yüksekliği\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cismin hacmi\", \"text\": \"Cismin hacmi\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest8Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki olaylardan hangisinde fiziksel anlamda iş yapılmamıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Merdivenden çıkan insan\", \"text\": \"Merdivenden çıkan insan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Halter kaldıran sporcu\", \"text\": \"Halter kaldıran sporcu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çatıdan düşen kiremit\", \"text\": \"Çatıdan düşen kiremit\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elinde çanta durakta bekleyen öğrenci\", \"text\": \"Elinde çanta durakta bekleyen öğrenci\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"İş ile ilgili olarak aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kuvvet her zaman iş yapılmasına neden olur.\", \"text\": \"Kuvvet her zaman iş yapılmasına neden olur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"İş yapılabilmesi için cismin kuvvet yönünde hareket etmesi gerekir.\", \"text\": \"İş yapılabilmesi için cismin kuvvet yönünde hareket etmesi gerekir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Cisme uygulanan kuvvet arttıkça yapılan işte artar.\", \"text\": \"Cisme uygulanan kuvvet arttıkça yapılan işte artar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yapılan iş alınan yolla doğru orantılıdır.\", \"text\": \"Yapılan iş alınan yolla doğru orantılıdır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki durumların hangisinde iş yapılmıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Duvara 100 Newton uygulayan çocuk\", \"text\": \"Duvara 100 Newton uygulayan çocuk\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Düz yolda elindeki çantayı sallamadan giden kişi\", \"text\": \"Düz yolda elindeki çantayı sallamadan giden kişi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Düz yolda bisiklet süren kişi\", \"text\": \"Düz yolda bisiklet süren kişi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kitap okuyan kişi\", \"text\": \"Kitap okuyan kişi\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki durumların hangisinde iş yapılmamıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Dağa tırmanan dağcı\", \"text\": \"Dağa tırmanan dağcı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Halteri yukarıda tutan sporcu\", \"text\": \"Halteri yukarıda tutan sporcu\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yerdeki kitapları kitaplığa yerleştiren anne\", \"text\": \"Yerdeki kitapları kitaplığa yerleştiren anne\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Arabayı iterek çalıştıran kişiler\", \"text\": \"Arabayı iterek çalıştıran kişiler\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisinde yer çekimine karşı iş yapılmıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Düz yolda sabit süratle giden bisikletli\", \"text\": \"Düz yolda sabit süratle giden bisikletli\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sıkıştırılan yay\", \"text\": \"Sıkıştırılan yay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sırtındaki çanta ile merdiven çıkan öğrenci\", \"text\": \"Sırtındaki çanta ile merdiven çıkan öğrenci\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Daldan düşen elma\", \"text\": \"Daldan düşen elma\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest9Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Soru 1: Kaydıraktan kayan bir çocuk için aşağıdaki enerji dönüşümlerinden hangisi vardır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Potansiyel enerji - Kinetik enerji\", \"text\": \"Potansiyel enerji - Kinetik enerji\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kinetik enerji - Potansiyel enerji\", \"text\": \"Kinetik enerji - Potansiyel enerji\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kinetik enerji - Esneklik potansiyel enerji\", \"text\": \"Kinetik enerji - Esneklik potansiyel enerji\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hareket enerjisi - Potansiyel enerji\", \"text\": \"Hareket enerjisi - Potansiyel enerji\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki enerji dönüşümlerinden hangisi diğerlerinden farklıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yaydaki okun fırlaması\", \"text\": \"Yaydaki okun fırlaması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fare kapanının fare yakalaması\", \"text\": \"Fare kapanının fare yakalaması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kurmalı saatin zilinin çalması\", \"text\": \"Kurmalı saatin zilinin çalması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Duvarın yıkılması\", \"text\": \"Duvarın yıkılması\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisinin sahip olduğu enerji diğerlerinden farklıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Barajda duran su\", \"text\": \"Barajda duran su\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Masada duran bardak\", \"text\": \"Masada duran bardak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Havadaki uçak\", \"text\": \"Havadaki uçak\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Dalda duran elma\", \"text\": \"Dalda duran elma\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisinin sahip olduğu enerji diğerlerinden farklıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sıkıştırılmış yay\", \"text\": \"Sıkıştırılmış yay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Şelaleden akan su\", \"text\": \"Şelaleden akan su\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gerilmiş yay\", \"text\": \"Gerilmiş yay\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kuvvet uygulanmış dinamometre\", \"text\": \"Kuvvet uygulanmış dinamometre\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki cisimlerden hangisinde sadece çekim potansiyel enerjiye sahiptir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Hızla giden otomobil\", \"text\": \"Hızla giden otomobil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Havada uçan kuş\", \"text\": \"Havada uçan kuş\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dağlarındaki kar\", \"text\": \"Dağlarındaki kar\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Gerilmiş sapan lastiği\", \"text\": \"Gerilmiş sapan lastiği\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest10Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Maddeyi oluşturan en küçük yapı birimine .................... denir. Yukarıdaki boşluğa aşağıdakilerden hangisi yazılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Molekül\", \"text\": \"Molekül\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atom\", \"text\": \"Atom\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Çekirdek\", \"text\": \"Çekirdek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Proton\", \"text\": \"Proton\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki parçacıklardan hangisi atomun hacmini oluşturur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Elektron\", \"text\": \"Elektron\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Proton\", \"text\": \"Proton\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çekirdek\", \"text\": \"Çekirdek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Nötron\", \"text\": \"Nötron\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Atomla ilgili olarak aşağıda verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Proton ve nötron atomun çekirdeğinde bulunur.\", \"text\": \"Proton ve nötron atomun çekirdeğinde bulunur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektronlar çekirdek çevresinde çok hızlı hareket eder.\", \"text\": \"Elektronlar çekirdek çevresinde çok hızlı hareket eder.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atomun kimliğini belirleyen parçacık elektrondur.\", \"text\": \"Atomun kimliğini belirleyen parçacık elektrondur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Nötronlar yüksüz parçacıklardır.\", \"text\": \"Nötronlar yüksüz parçacıklardır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Atom hakkında ilk bilimsel görüşü ortaya atan bilim insanı aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Democritus\", \"text\": \"Democritus\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dalton\", \"text\": \"Dalton\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Bohr\", \"text\": \"Bohr\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Thomson\", \"text\": \"Thomson\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Proton sayısı ve elektron sayısına eşit atomlara aşağıdakilerden hangisi denir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İyon\", \"text\": \"İyon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Katyon\", \"text\": \"Katyon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Anyon\", \"text\": \"Anyon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Nötr atom\", \"text\": \"Nötr atom\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest11Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi saf maddelerin özelliklerinden birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"İçerisinde başka tür tanecik bulunmaz.\", \"text\": \"İçerisinde başka tür tanecik bulunmaz.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Homojendir.\", \"text\": \"Homojendir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tek cins atom içerir.\", \"text\": \"Tek cins atom içerir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yoğunlukları sabittir.\", \"text\": \"Yoğunlukları sabittir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıda verilen element sembollerinden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Bakır - Cu\", \"text\": \"Bakır - Cu\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Altın - Au\", \"text\": \"Altın - Au\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Demir - Fe\", \"text\": \"Demir - Fe\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fosfor - S\", \"text\": \"Fosfor - S\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda verilen elementlerin sembolleri alfabetik olarak sıralandıklarında son sırada hangisi bulunur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Azot\", \"text\": \"Azot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Neon\", \"text\": \"Neon\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sodyum\", \"text\": \"Sodyum\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Karbon\", \"text\": \"Karbon\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"İnsan vücudunda en fazla bulunan element hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Azot\", \"text\": \"Azot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Oksijen\", \"text\": \"Oksijen\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Karbon\", \"text\": \"Karbon\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kükürt\", \"text\": \"Kükürt\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Elementlerin isimlendirilmesinde ilk harf kullanılmış ise ikinci harf küçük olarak yazılır. Aşağıdaki elementlerden hangisi iki harflidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Azot\", \"text\": \"Azot\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bor\", \"text\": \"Bor\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kükürt\", \"text\": \"Kükürt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Klor\", \"text\": \"Klor\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest12Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki evsel atıklardan hangisi geri dönüştürülemez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Plastik şişeler\", \"text\": \"Plastik şişeler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kullanılmış kitaplar\", \"text\": \"Kullanılmış kitaplar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yemek artıkları\", \"text\": \"Yemek artıkları\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Cam şişeler\", \"text\": \"Cam şişeler\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Okulda geri dönüşüm projesi başlatan öğrenciler, aşağıdakilerden hangisini geri dönüşüm kutusuna atmamalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kağıt\", \"text\": \"Kağıt\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Metal\", \"text\": \"Metal\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yağlı kağıt\", \"text\": \"Yağlı kağıt\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Atıkların geri dönüşümü sırasında aşağıdakilerden hangisi yapılmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Atıklar çöp kutusuna doldurulur.\", \"text\": \"Atıklar çöp kutusuna doldurulur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Atıklar atık aracı ile toplanır.\", \"text\": \"Atıklar atık aracı ile toplanır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıklar geri dönüşüm tesisine götürülür.\", \"text\": \"Atıklar geri dönüşüm tesisine götürülür.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıklar özelliklerine göre sınıflandırılır.\", \"text\": \"Atıklar özelliklerine göre sınıflandırılır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Atıkların geri dönüşüm aşamalarında hangisi yapılmalıdır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Atıklar toprağa gömülmelidir.\", \"text\": \"Atıklar toprağa gömülmelidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıklar toplanarak yakılmalıdır.\", \"text\": \"Atıklar toplanarak yakılmalıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıklar ormanlık alana atılmalıdır.\", \"text\": \"Atıklar ormanlık alana atılmalıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıklardan geri dönüştürülebilecek olanlar toplanır.\", \"text\": \"Atıklardan geri dönüştürülebilecek olanlar toplanır.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Çevreyi koruma bilincinde olan bir kişi aşağıdakilerden hangisini yapmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Toplu taşıma aracıyla seyahat etmez.\", \"text\": \"Toplu taşıma aracıyla seyahat etmez.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Çevreye atık maddeleri atmaz.\", \"text\": \"Çevreye atık maddeleri atmaz.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Aldığı ürünlerin enerji tüketiminin az olmasına dikkat eder.\", \"text\": \"Aldığı ürünlerin enerji tüketiminin az olmasına dikkat eder.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Atıkların geri dönüşümüne katkı sağlar.\", \"text\": \"Atıkların geri dönüşümüne katkı sağlar.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest13Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki olayların hangisinde ışığın soğurulması gerçekleşmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Saydam maddelerin ışığı geçirmesi\", \"text\": \"Saydam maddelerin ışığı geçirmesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Güneş enerjisinden sıcak su elde etmek\", \"text\": \"Güneş enerjisinden sıcak su elde etmek\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş fırınında yemek pişirme\", \"text\": \"Güneş fırınında yemek pişirme\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bitkilerin fotosentez yapması\", \"text\": \"Bitkilerin fotosentez yapması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Işıkla ilgili olarak verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Işık bir enerjidir.\", \"text\": \"Işık bir enerjidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işık saydam ortamda yayılabilir.\", \"text\": \"Işık saydam ortamda yayılabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işığın cisimler tarafından tutulmasına ışığın soğurulması denir.\", \"text\": \"Işığın cisimler tarafından tutulmasına ışığın soğurulması denir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Siyah cisimler ışığın birazını soğurur.\", \"text\": \"Siyah cisimler ışığın birazını soğurur.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıda renkleri verilen kalemlerden hangisi ışığı daha az soğurur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Siyah kalem\", \"text\": \"Siyah kalem\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Beyaz kalem\", \"text\": \"Beyaz kalem\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Kahverengi kalem\", \"text\": \"Kahverengi kalem\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mavi kalem\", \"text\": \"Mavi kalem\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda verilen enerji dönüşümlerinden hangisinde ışık enerjisi hareket enerjisine dönüşür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Güneş pili\", \"text\": \"Güneş pili\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Güneş fırını\", \"text\": \"Güneş fırını\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Radyometre\", \"text\": \"Radyometre\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Newton çarkı\", \"text\": \"Newton çarkı\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki araçların hangisinde beyaz ışık renklerine ayrılmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yağmur damlası\", \"text\": \"Yağmur damlası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Üçgen prizma\", \"text\": \"Üçgen prizma\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Newton çarkı\", \"text\": \"Newton çarkı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"CD üzerine düşen ışık\", \"text\": \"CD üzerine düşen ışık\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest14Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi ayna çeşidi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Düzlem ayna\", \"text\": \"Düzlem ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çukur ayna\", \"text\": \"Çukur ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tümsek ayna\", \"text\": \"Tümsek ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Makyaj aynası\", \"text\": \"Makyaj aynası\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki aynalardan hangisi virajlarda kullanılır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Düzlem ayna\", \"text\": \"Düzlem ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çukur ayna\", \"text\": \"Çukur ayna\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tümsek ayna\", \"text\": \"Tümsek ayna\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Düzlem ayna\", \"text\": \"Makyaj aynası\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdaki araçların hangisinde çukur ayna kullanılır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Araç dikiz aynası\", \"text\": \"Araç dikiz aynası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"El feneri\", \"text\": \"El feneri\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Periskop\", \"text\": \"Periskop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Mağaza güvenlik aynası\", \"text\": \"Mağaza güvenlik aynası\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıda verilen özelliklerden hangisi tümsek aynanın görüntü özelliği değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Görüntü gerçektir\", \"text\": \"Görüntü gerçektir\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Görüntü simetrik değildir.\", \"text\": \"Görüntü simetrik değildir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Görüntü küçüktür\", \"text\": \"Görüntü küçüktür\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Görüntü düzdür\", \"text\": \"Görüntü düzdür\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Çukur ayna ile ilgili verilen bilgilerden hangisi kesinlikle yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Görüntü düz ve büyük olabilir.\", \"text\": \"Görüntü düz ve büyük olabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Görüntü düz ve küçük olabilir.\", \"text\": \"Görüntü düz ve küçük olabilir.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Görüntü ters ve küçük olabilir.\", \"text\": \"Görüntü ters ve küçük olabilir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Görüntü ters ve büyük olabilir.\", \"text\": \"Görüntü ters ve büyük olabilir.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest15Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Merceklerle ilgili olarak aşağıda verilenlerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Göz kusurlarının tedavisinde kullanılır.\", \"text\": \"Göz kusurlarının tedavisinde kullanılır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Merceklerin odak noktası vardır.\", \"text\": \"Merceklerin odak noktası vardır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Merceklerde paralel gelen ışık ışınları odak noktasında toplanır.\", \"text\": \"Merceklerde paralel gelen ışık ışınları odak noktasında toplanır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Merceklerin iki odak noktası vardır.\", \"text\": \"Merceklerin iki odak noktası vardır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisinde mercek kullanılmamıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Periskop\", \"text\": \"Periskop\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Mikroskop\", \"text\": \"Mikroskop\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Projeksiyon cihazı\", \"text\": \"Projeksiyon cihazı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Teleskop\", \"text\": \"Teleskop\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Işığın kırılması hakkında verilen aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Işık az kırıcı ortamdan çok kırıcı ortama geçtiğinde hızı azalır.\", \"text\": \"Işık az kırıcı ortamdan çok kırıcı ortama geçtiğinde hızı azalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işık ışınları çok yoğun ortamdan az yoğun ortama dik geçtiğinde kırılmaya uğramaz.\", \"text\": \"Işık ışınları çok yoğun ortamdan az yoğun ortama dik geçtiğinde kırılmaya uğramaz.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Havadan suyun içerisine bakan kişi suyu sığ (derin değilmiş) gibi görür.\", \"text\": \"Havadan suyun içerisine bakan kişi suyu sığ (derin değilmiş) gibi görür.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çok yoğun ortamdan az yoğun ortama geçen ışık ışınlarının kırılma açısı geleme açısından küçüktür.\", \"text\": \"Çok yoğun ortamdan az yoğun ortama geçen ışık ışınlarının kırılma açısı geleme açısından küçüktür.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Ormanlık alana bırakılan içi su dolu pet şişeler orman yangınlarına neden olabilir. Bu olayda pet şişe hangi özelliğinden dolayı yangına neden olmuştur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kalın kenarlı mercek görevi görmesi\", \"text\": \"Kalın kenarlı mercek görevi görmesi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İnce kenarlı mercek görevi görmesi\", \"text\": \"İnce kenarlı mercek görevi görmesi\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Işığı yansıtması\", \"text\": \"Işığı yansıtması\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Işığın renklerine ayrılması\", \"text\": \"Işığın renklerine ayrılması\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıda verilen olaylardan hangisinde tam yansıma gerçekleşmez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Serap olayı\", \"text\": \"Serap olayı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fiber optik kablolar\", \"text\": \"Fiber optik kablolar\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Gökkuşağının oluşması\", \"text\": \"Gökkuşağının oluşması\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Endoskopi cihazı\", \"text\": \"Endoskopi cihazı\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest16Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"İnsanlarda üreme ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Üreyemeyen canlı yaşamına devam edemez.\", \"text\": \"Üreyemeyen canlı yaşamına devam edemez.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Üreme canlıların kendine benzer bireyler meydana getirmesidir.\", \"text\": \"Üreme canlıların kendine benzer bireyler meydana getirmesidir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"İnsanlarda üreme eşeyli üremedir.\", \"text\": \"İnsanlarda üreme eşeyli üremedir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ergenlik dönemi ile beraber üreme faaliyeti gerçekleşebilir.\", \"text\": \"Ergenlik dönemi ile beraber üreme faaliyeti gerçekleşebilir.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Döllenmiş yumurtaya zigot denir. Zigotta kromozom sayısı nedir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"23\", \"text\": \"23\", \"isCorrect\": false }," +
                "{ \"option_id\": \"26\", \"text\": \"26\", \"isCorrect\": false }," +
                "{ \"option_id\": \"44\", \"text\": \"44\", \"isCorrect\": false }," +
                "{ \"option_id\": \"46\", \"text\": \"46\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Dişi üreme sisteminde döllenmiş yumurtanın tutunarak gelişimini tamamladığı yer aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yumurta kanalı\", \"text\": \"Yumurta kanalı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yumurtalık\", \"text\": \"Yumurtalık\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Döl yatağı\", \"text\": \"Döl yatağı\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Döl yolu\", \"text\": \"Döl yolu\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Erkek üreme sisteminde mayoz bölünme aşağıdaki yapıların hangisinde olur?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sperm kanalı\", \"text\": \"Sperm kanalı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Salgı bezleri\", \"text\": \"Salgı bezleri\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Penis\", \"text\": \"Penis\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Testis\", \"text\": \"Testis\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Erkek üreme sisteminde sperm ve idrarın dışarı atıldığı kısım aşağıdakilerden hangisidir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Sperm kanalı\", \"text\": \"Sperm kanalı\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Salgı bezleri\", \"text\": \"Salgı bezleri\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Penis\", \"text\": \"Penis\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Testis\", \"text\": \"Testis\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest17Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Bitki ve hayvanlarda üreme için aşağıdakilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Üreyemeyen canlı yaşayamaz.\", \"text\": \"Üreyemeyen canlı yaşayamaz.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Üreme, canlının kendine benzer canlılar oluşturmasıdır.\", \"text\": \"Üreme, canlının kendine benzer canlılar oluşturmasıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Üreme eşeyli ve eşeysiz gerçekleşir.\", \"text\": \"Üreme eşeyli ve eşeysiz gerçekleşir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Eşeysiz üreyen canlılar birbirine tamamen benzer.\", \"text\": \"Eşeysiz üreyen canlılar birbirine tamamen benzer.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki canlılardan hangisi başkalaşım geçirir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Solucan\", \"text\": \"Solucan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Sinek\", \"text\": \"Sinek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yılan\", \"text\": \"Yılan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kertenkele\", \"text\": \"Kertenkele\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi memeli canlı değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yunus\", \"text\": \"Yunus\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yarasa\", \"text\": \"Yarasa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fare\", \"text\": \"Fare\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hindi\", \"text\": \"Hindi\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdakilerden hangisinin yavru bakımı vardır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Serçe\", \"text\": \"Serçe\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yılan\", \"text\": \"Yılan\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Hamsi\", \"text\": \"Hamsi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Salyangoz\", \"text\": \"Salyangoz\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdaki özelliklerden hangisi memeli canlıların özelliklerinden birisi değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yavrularını sütle besler\", \"text\": \"Yavrularını sütle besler\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Doğurarak çoğalır.\", \"text\": \"Doğurarak çoğalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Derileri kılla kaplıdır.\", \"text\": \"Derileri kılla kaplıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Başkalaşım geçirirler.\", \"text\": \"Başkalaşım geçirirler.\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest18Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdakilerden hangisi tomurcuklanarak üremez?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Deniz anası\", \"text\": \"Deniz anası\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Çiçek\", \"text\": \"Çiçek\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Hidra\", \"text\": \"Hidra\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bira mayası\", \"text\": \"Bira mayası\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdakilerden hangisi yumurta ile çoğalır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kedi\", \"text\": \"Kedi\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Penguen\", \"text\": \"Penguen\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Deve\", \"text\": \"Deve\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Fok\", \"text\": \"Fok\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Aşağıdakilerden hangisi dış döllenme, dış gelişim görülür?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Kartal\", \"text\": \"Kartal\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yarasa\", \"text\": \"Yarasa\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Alabalık\", \"text\": \"Alabalık\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Balina\", \"text\": \"Balina\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki özelliklerden hangisi kuşlara ait değildir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Yavrularına bakar.\", \"text\": \"Yavrularına bakar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yavrularını sütle besler\", \"text\": \"Yavrularını sütle besler\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Vücutları tüyle kaplıdır.\", \"text\": \"Vücutları tüyle kaplıdır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yumurtaları üzerinde kuluçkaya yatar\", \"text\": \"Yumurtaları üzerinde kuluçkaya yatar\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Aşağıdakilerden hangisi çiçeğin yapısında bulunmaz?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Erkek organ\", \"text\": \"Erkek organ\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dişi organ\", \"text\": \"Dişi organ\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Taç yaprak\", \"text\": \"Taç yaprak\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Tohum\", \"text\": \"Tohum\", \"isCorrect\": true }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest19Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Ampullerin bağlama şekliyle ilgili olarak aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Seri bağlı ampullerin sayısı arttıkça ampuller daha parlak yanar.\", \"text\": \"Seri bağlı ampullerin sayısı arttıkça ampuller daha parlak yanar.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Paralel bağlı  ampullerin sayısı arttıkça ampullerin parlaklıkları değişmez.\", \"text\": \"Paralel bağlı  ampullerin sayısı arttıkça ampullerin parlaklıkları değişmez.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Seri bağlı ampullerin sayısı arttıkça devreden geçen akım azalır.\", \"text\": \"Seri bağlı ampullerin sayısı arttıkça devreden geçen akım azalır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Paralel bağlı ampullerden birisi patlarsa diğerleri yanmaya devam eder.\", \"text\": \"Paralel bağlı ampullerden birisi patlarsa diğerleri yanmaya devam eder.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Bir elektrik devresinde aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Elektrik devresinde akımı kontrol eden anahtardır.\", \"text\": \"Elektrik devresinde akımı kontrol eden anahtardır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektrik devresinde, elektrik akımının yönü pilin - kutbundan + kutbuna doğrudur.\", \"text\": \"Elektrik devresinde, elektrik akımının yönü pilin - kutbundan + kutbuna doğrudur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul, elektrik devresinde elektrik enerjisini ışık enerjisine çevirir.\", \"text\": \"Ampul, elektrik devresinde elektrik enerjisini ışık enerjisine çevirir.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Birden fazla pil bir araya gelerek bataryayı oluşturur.\", \"text\": \"Birden fazla pil bir araya gelerek bataryayı oluşturur.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Basit elektrik devresi su tesisatına benzetilebilir. Buna göre aşağıdaki eşleştirmelerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Su pompası → Pil\", \"text\": \"Su pompası → Pil\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Kıvrımlı boru  → Direnç\", \"text\": \"Kıvrımlı boru  → Direnç\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Boru → Duy\", \"text\": \"Boru → Duy\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Vana → Anahtar\", \"text\": \"Vana → Anahtar\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Aşağıdaki araçlardan hangisi kimyasal enerjiyi elektrik enerjisine çevirir?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Pil\", \"text\": \"Pil\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul\", \"text\": \"Ampul\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Jeneratör\", \"text\": \"Jeneratör\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Dinamo\", \"text\": \"Dinamo\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Direnç ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Direnç direnç ölçer ile ölçülür.\", \"text\": \"Direnç direnç ölçer ile ölçülür.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Direnç birimi Ohm'dur.\", \"text\": \"Direnç birimi Ohm'dur.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Direnç elektrik akımına gösterilen zorluktur.\", \"text\": \"Direnç elektrik akımına gösterilen zorluktur.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Bir elektrik devresinde akım arttıkça direnç azalır.\", \"text\": \"Bir elektrik devresinde akım arttıkça direnç azalır.\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest20Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Aşağıdaki bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Elektrik devresinde seri bağlı pil sayısı artarsa akım artar.\", \"text\": \"Elektrik devresinde seri bağlı pil sayısı artarsa akım artar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektrik devresinde seri bağlı ampul artarsa direnç artar.\", \"text\": \"Elektrik devresinde seri bağlı ampul artarsa direnç artar.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Elektrik devresinde paralel bağlı ampul sayısı artarsa direnç artar.\", \"text\": \"Elektrik devresinde paralel bağlı ampul sayısı artarsa direnç artar.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampul uçlarına uygulanan gerilim artarsa ampul daha parlak yanar.\", \"text\": \"Ampul uçlarına uygulanan gerilim artarsa ampul daha parlak yanar.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Aşağıdaki yerlerden hangisinde seri bağlı ampuller kullanılmıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Evimizdeki ampuller\", \"text\": \"Evimizdeki ampuller\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yılbaşı ağacındaki ampuller\", \"text\": \"Yılbaşı ağacındaki ampuller\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Sokak lambalarındaki ampuller\", \"text\": \"Sokak lambalarındaki ampuller\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Otomobillerdeki ampuller\", \"text\": \"Otomobillerdeki ampuller\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Ampermetre ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Ampermetrenin direnci çok fazladır.\", \"text\": \"Ampermetrenin direnci çok fazladır.\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Ampermetre devreye seri bağlanır.\", \"text\": \"Ampermetre devreye seri bağlanır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampermetre devreden geçen akım miktarını ölçer\", \"text\": \"Ampermetre devreden geçen akım miktarını ölçer\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Ampermetrenin de + ve - uçları vardır.\", \"text\": \"Ampermetrenin de + ve - uçları vardır.\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Voltmetre ile ilgili verilen bilgilerden hangisi yanlıştır?\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Voltmetre devreye paralel bağlanır.\", \"text\": \"Voltmetre devreye paralel bağlanır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Voltmetre devredeki potansiyel farkını ölçer.\", \"text\": \"Voltmetre devredeki potansiyel farkını ölçer.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Voltmetre'nin direnci çok fazladır.\", \"text\": \"Voltmetre'nin direnci çok fazladır.\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Voltmetre üzerinden çok fazla akım geçer.\", \"text\": \"Voltmetre üzerinden çok fazla akım geçer.\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Paralel bağlı özdeş ampuller üzerinden eşit akım geçer.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getTest21Grade7()
    {
        String jsonString = "[" +
                "{" +
                "\"index\": 1," +
                "\"text\": \"Ampermetre devreye paralel bağlanır.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 2," +
                "\"text\": \"Seri bağlı ampuller şerit LED'de kullanılır.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 3," +
                "\"text\": \"Bir iletkenin direnci gerilime bağlı olarak değişir.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": false }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": true }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 4," +
                "\"text\": \"Direnç elektrik akımına gösterilen zorluktur.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": false }" +
                "]" +
                "}," +
                "{" +
                "\"index\": 5," +
                "\"text\": \"Paralel bağlı özdeş ampuller üzerinden eşit akım geçer.\"," +
                "\"options\": [" +
                "{ \"option_id\": \"Doğru\", \"text\": \"Doğru\", \"isCorrect\": true }," +
                "{ \"option_id\": \"Yanlış\", \"text\": \"Yanlış\", \"isCorrect\": false }" +
                "]" +
                "}" +
                "]";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}