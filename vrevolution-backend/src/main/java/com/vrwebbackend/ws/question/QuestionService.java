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