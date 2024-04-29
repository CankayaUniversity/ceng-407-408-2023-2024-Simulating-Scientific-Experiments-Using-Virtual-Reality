package com.vrwebbackend.ws.achievements;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AchievementService
{
    public ResponseEntity<Object> getUnit1Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Güneş'in Yapısı ve Dönüşü\", " +
                "\"topic1Achievement1\": \"Güneş'in geometrik şekli belirtilmiştir\", " +
                "\"topic1Achievement2\": \"Güneş'in Dünya gibi katmanlardan oluştuğu ancak katmanların yapısının bahsedilmediği söylenmiştir\", " +
                "\"topic1Achievement3\": \"Güneş'in döndüğü ifade edilmiştir\", " +
                "\"topic2\": \"Ay'ın Yapısı ve Özellikleri\", " +
                "\"topic2Achievement1\": \"Ay'ın büyüklüğü belirtilmiştir\", " +
                "\"topic2Achievement2\": \"Ay'ın geometrik şekli bahsedilmiştir\", " +
                "\"topic2Achievement3\": \"Ay'ın yüzey yapısı hakkında bilgi verilmiştir\", " +
                "\"topic3\": \"Ay'ın Hareketleri ve Evreleri\", " +
                "\"topic3Achievement1\": \"Ay'ın dönüş ve dönme hareketleri açıklanmıştır\", " +
                "\"topic3Achievement2\": \"Ay'ın döndüğü belirtilmiştir.\", " +
                "\"topic3Achievement3\": \"Ay'ın evreleri ile Ay'ın Dünya etrafındaki yörüngesi arasındaki ilişki açıklanmıştır\", " +
                "\"topic4\": \"Güneş, Dünya ve Ay\", " +
                "\"topic4Achievement1\": \"Güneş, Dünya ve Ay'ın birbirlerine göre hareketlerini temsil eden bir model hazırlamıştır\", " +
                "\"topic4Achievement2\": \"Ay'ın Dünya etrafında döndüğü yön belirtilmiştir\", " +
                "\"topic4Achievement3\": \"Dünya'nın Güneş etrafında döndüğü yön belirtilmiştir\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit2Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Mikroskop ile Mikroskopik Canlıların Varlığını Gözlemleme\", " +
                "\"topic1Achievement1\": \"Mikroskopun parçaları belirtilmemiştir\", " +
                "\"topic1Achievement2\": \"Mikroskopik canlıları gözlemleyerek güvenlik ve hijyen konusunda gerekli önlemler alınmıştır.\", " +
                "\"topic2\": \"Canlıları Benzerlik ve Farklılıklarına Göre Sınıflandırma\", " +
                "\"topic2Achievement1\": \"Mikroskopik canlılar (bakteri, amip, öglena, paramecium) ve kapaklı mantarlar örnek olarak verilmiştir.\", " +
                "\"topic2Achievement2\": \"Zehirli mantarların yenmemesi gerektiği uyarısı yapılmıştır.\", " +
                "\"topic2Achievement3\": \"Canlılar; bitkiler, hayvanlar, mantarlar ve mikroskopik canlılar olarak sınıflandırılmıştır\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit3Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Kuvvet Ölçme\", " +
                "\"topic1Achievement1\": \"Dinamometre ile kuvvetin büyüklüğü ölçülmüştür\", " +
                "\"topic1Achievement2\": \"Kuvvet birimi olarak Newton (N) kullanılmıştır\", " +
                "\"topic1Achievement3\": \"Basit araçlar kullanılarak dinamometre modeli tasarlanmıştır\", " +
                "\"topic2\": \"Sürtünme Kuvveti\", " +
                "\"topic2Achievement1\": \"Günlük hayattan sürtünme kuvvetine örnekler verilmiştir\", " +
                "\"topic2Achievement2\": \"Farklı ortamlarda sürtünme kuvvetinin hareket üzerindeki etkisi deney yaparak keşfedilmiştir\", " +
                "\"topic2Achievement3\": \"Günlük hayatta sürtünme kuvvetini arttırmak veya azaltmak için yeni fikirler üretilmiştir\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit4Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Eritme, Donma, Kaynama, Yoğuşma, Buharlaşma, Süblimleşme, Kırağı\", " +
                "\"topic1Achievement1\": \"Maddelerin ısı etkisi altında durum değiştirebileceğiyle ilgili deneylerden elde edilen verilere dayanarak çıkarımlarda bulunulmuştur.\", " +
                "\"topic1Achievement2\": \"Sıvıların her sıcaklıkta buharlaşabileceği ancak belirli bir sıcaklıkta kaynadığı açıklanarak buharlaşma ve kaynama arasındaki temel fark açıklanmıştır.\", " +
                "\"topic2\": \"Eritme ve Donma Noktası, Kaynama Noktası\", " +
                "\"topic2Achievement1\": \"Deneyler sonucunda saf maddelerin erime, donma ve kaynama noktaları belirlenmiştir.\", " +
                "\"topic2Achievement2\": \"Eritme, donma ve kaynama noktalarının ayırt edici özellikler olduğu vurgulanmıştır.\", " +
                "\"topic3\": \"Isı, Sıcaklık, Isı Değişimi\", " +
                "\"topic3Achievement1\": \"Isı ile sıcaklık arasındaki temel farklar açıklanmıştır.\", " +
                "\"topic3Achievement2\": \"Farklı sıcaklıktaki sıvıların karıştırılması sonucu ısı değişimi deneyleri yapılarak sonuçları yorumlanmıştır.\", " +
                "\"topic4\": \"Genleşme, Büzülme\", " +
                "\"topic4Achievement1\": \"Maddelerin ısı etkisi altında genleşip büzülebileceği deneyler yapılarak deney sonuçları tartışılmıştır.\", " +
                "\"topic4Achievement2\": \"Günlük hayattan genleşme ve büzülme olaylarına örnekler verilmiştir\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit5Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Işık Yayılımı\", " +
                "\"topic1Achievement1\": \"Işık kaynağından gelen ışığın tüm yönlerde doğrusal bir yol izlediği gözlemlenerek çizimlerle gösterilmiştir.\", " +
                "\"topic2\": \"Düzgün Yansıma, Dağınık Yansıma, Gelen Işın, Yansıyan Işın, Yüzey Normali\", " +
                "\"topic2Achievement1\": \"Işığın düz ve pürüzlü yüzeylerdeki yansımaları gözlemlenmiş ve çizimlerle gösterilmiştir.\", " +
                "\"topic2Achievement2\": \"Işık yansımasında gelen ışın, yansıyan ışın ve yüzey normali arasındaki ilişki açıklanmıştır.\", " +
                "\"topic3\": \"Saydam Materyaller, Yarı Saydam Materyaller, Saydam Olmayan Materyaller\", " +
                "\"topic3Achievement1\": \"Maddeleri ışığı iletebilme yeteneklerine göre sınıflandırmıştır.\", " +
                "\"topic4\": \"Gölge, Gölgeyi Etkileyen Değişkenler\", " +
                "\"topic4Achievement1\": \"Gölgenin nasıl oluştuğu gözlemlenmiş ve basit ışın çizimleriyle gösterilmiştir.\", " +
                "\"topic4Achievement2\": \"Gölgeyi etkileyen değişkenlerin neler olduğu deneylerle keşfedilmiştir.\", " +
                "\"topic4Achievement3\": \"Gölge oyunları bahsedilmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit6Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Biyoçeşitlilik\", " +
                "\"topic1Achievement1\": \"Biyoçeşitliliğin doğal yaşam için önemi sorgulanmıştır.\", " +
                "\"topic1Achievement2\": \"Araştırma verilerine dayanarak biyoçeşitliliği tehdit eden faktörler tartışılmıştır\", " +
                "\"topic2\": \"İnsan ve Çevre İlişkisi\", " +
                "\"topic2Achievement1\": \"Çevre kirliliğinin insan sağlığı üzerindeki olumsuz etkileri ele alınmıştır.\", " +
                "\"topic2Achievement2\": \"Yakın çevresinde veya ülkemizde bir çevre sorununu çözme önerileri sunulmuştur.\", " +
                "\"topic2Achievement3\": \"İnsan-çevre etkileşiminin faydaları ve zararları örneklerle tartışılmıştır.\", " +
                "\"topic3\": \"Felaket Yaratan Doğal Olaylar\", " +
                "\"topic3Achievement1\": \"Doğal süreçler sonucu oluşan yıkıcı doğal olaylar açıklanmıştır.\", " +
                "\"topic3Achievement2\": \"Depremler, volkanik patlamalar, seller, heyelanlar ve kasırgalar detaylandırılmadan bahsedilmiştir.\", " +
                "\"topic3Achievement3\": \"Yıkıcı doğal olaylardan korunma yollarına değinilmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit7Grade5Achievement() {
        String jsonString = "{\"topic1\": \"Devre Elemanlarının Sembolleri, Devre Şemaları\", " +
                "\"topic1Achievement1\": \"Elektrik devresindeki elemanları sembollerle göstermiştir.\", " +
                "\"topic1Achievement2\": \"Devre sembollerinin ortak bilimsel dil açısından önemi ifade edilmiştir.\", " +
                "\"topic1Achievement3\": \"Çizdiği elektrik devresinin şemasını oluşturmuştur\", " +
                "\"topic2\": \"Pil Sayısı, Lamba Sayısı\", " +
                "\"topic2Achievement1\": \"Bağımlı, bağımsız ve kontrol edilen değişken kavram grupları örneklerle açıklanmıştır.\", " +
                "\"topic2Achievement2\": \"Pil sayısı ve lamba sayısı bağımsız değişkenler olarak dikkate alınmıştır.\", " +
                "\"topic2Achievement3\": \"Paralel bağlantıya izin verilmemiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Güneş Sistemi'ndeki Gezegenleri Birbirleriyle Karşılaştırır\", " +
                "\"topic1Achievement1\": \"Gezegenlerin temel özellikleri (karasal, gazlı, iç gezegen, dış gezegen) belirtilmiştir.\", " +
                "\"topic1Achievement2\": \"Gezegenlerin uyduları olduğu söylenmiştir.\", " +
                "\"topic1Achievement3\": \"Gezegenlerin büyüklükleri mekansal olarak ifade edilmiştir.\", " +
                "\"topic2\": \"Bir Güneş Tutulması Nasıl Meydana Gelir Tahmin Edilir.\", " +
                "\"topic2Achievement1\": \"Güneş tutulması sırasında Ay'ın evresine değinilmiştir.\", " +
                "\"topic2Achievement2\": \"Her ay güneş tutulması olmadığı belirtilmiştir.\", " +
                "\"topic3\": \"Bir Ay Tutulması Nasıl Meydana Gelir Tahmin Edilir.\", " +
                "\"topic3Achievement1\": \"Ay tutulması sırasında Ay'ın evresine değinilmiştir.\", " +
                "\"topic3Achievement2\": \"Her ay ay tutulması olmadığı belirtilmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit2Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Destek ve Hareket Sistemi\", " +
                "\"topic1Achievement1\": \"Destek ve hareket sisteminin yapılarını örneklerle açıklamıştır.\", " +
                "\"topic1Achievement2\": \"Kıkırdak, kemik ve kemik tipleri, eklemler ve eklem tipleri, kaslar ve kas tipleri\", " +
                "\"topic2\": \"Sindirim Sistemi\", " +
                "\"topic2Achievement1\": \"Sindirim sistemini oluşturan yapılar ve organların fonksiyonlarını modeller kullanarak açıklamıştır.\", " +
                "\"topic2Achievement2\": \"Besinlerin kana geçebilmesi için fiziksel (mekanik) ve kimyasal sindirime uğraması gerektiği sonucuna varmıştır.\", " +
                "\"topic2Achievement3\": \"Sindirim organlarının fonksiyonlarını açıklamıştır.\", " +
                "\"topic3\": \"Dolaşım Sistemi\", " +
                "\"topic3Achievement1\": \"Dolaşım sistemini oluşturan yapılar ve organların fonksiyonlarını modeller kullanarak açıklamıştır.\", " +
                "\"topic3Achievement2\": \"Büyük ve küçük kan dolaşımını bir diyagram üzerinde incelemiş ve fonksiyonlarını açıklamıştır.\", " +
                "\"topic4\": \"Solunum Sistemi\", " +
                "\"topic4Achievement1\": \"Solunum sistemini oluşturan yapılar ve organlar, akciğerler\", " +
                "\"topic4Achievement2\": \"Solunum sistemini oluşturan yapılar ve organların fonksiyonlarını modeller kullanarak açıklamıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit3Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Sonuç Kuvveti\", " +
                "\"topic1Achievement1\": \"Bir nesneye etki eden kuvvetin yönünü, yönünü ve büyüklüğünü çizim yaparak göstermiştir.\", " +
                "\"topic1Achievement2\": \"Bir nesneye birden fazla kuvvet etki ettiğinde bunları deney yaparak gözlemlemiştir.\", " +
                "\"topic1Achievement3\": \"Nesnelerin hareketini gözlemleyerek dengeli ve dengesiz kuvvetleri karşılaştırmıştır.\", " +
                "\"topic2\": \"Sabit Hızla Hareket\", " +
                "\"topic2Achievement1\": \"Hızı tanımlamış ve birimini ifade etmiştir.\", " +
                "\"topic2Achievement2\": \"Mesafe, zaman ve hız arasındaki ilişkiyi bir grafik üzerinde göstermiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit4Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Maddenin Tanecikli Yapısı\", " +
                "\"topic1Achievement1\": \"Maddelerin tanecikli, boşluklu ve hareketli bir yapıya sahip olduğunu belirtmiştir.\", " +
                "\"topic1Achievement2\": \"Hareketli yapı ile ilgili titreşim, çeviri ve dönme kavramları bahsedilmiştir.\", " +
                "\"topic1Achievement3\": \"Durum değişikliği ile maddenin tanecikleri arasındaki boşluğun ve taneciklerin hareketliliğinin değiştiğini deney yaparak karşılaştırmıştır.\", " +
                "\"topic2\": \"Yoğunluk, Yoğunluğun Birimi\", " +
                "\"topic2Achievement1\": \"Yoğunluğu tanımlamıştır.\", " +
                "\"topic2Achievement2\": \"Tasarladığı deneyler sonucu çeşitli maddelerin yoğunluklarını hesaplamıştır.\", " +
                "\"topic2Achievement3\": \"Birbirinde çözünmeyen sıvıların yoğunluklarını deney yaparak karşılaştırmıştır.\", " +
                "\"topic3\": \"Maddeler ve Isı\", " +
                "\"topic3Achievement2\": \"Binalarda kullanılan ısı yalıtım malzemelerinin seçim kriterlerini belirlemiştir.\", " +
                "\"topic3Achievement3\": \"Isı yalıtımının binalar açısından aile ve milli ekonomi ile kaynakların etkin kullanımı açısından önemini tartışmıştır.\", " +
                "\"topic4\": \"Yakıtlar\", " +
                "\"topic4Achievement1\": \"Yakıtları katı, sıvı ve gaz yakıtlar olarak sınıflandırmış ve yaygın olarak kullanılan yakıtlara örnekler vermiştir.\", " +
                "\"topic4Achievement2\": \"Isıtma amaçlı farklı türde yakıtlar kullanmanın insanlar ve çevre üzerindeki etkilerini tartışmıştır.\", " +
                "\"topic4Achievement3\": \"Soba ve doğalgaz zehirlenmesine karşı alınacak önlemleri araştırıp rapor etmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit5Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Sesin Yayılımı\", " +
                "\"topic1Achievement1\": \"Sesin katılarda, sıvılarda ve gazlarda nasıl yayıldığını tahmin edip test etmiştir.\", " +
                "\"topic2\": \"Farklı Ortamlarda Sesin Farklı Duyulması\", " +
                "\"topic2Achievement1\": \"Farklı nesnelerden çıkan seslerin farklılıkları, aynı sesin farklı ortamlarda farklı duyulması\", " +
                "\"topic2Achievement2\": \"Ses kaynağının değiştiğinde seslerin farklı duyulduğunu deney yaparak keşfetmiştir.\", " +
                "\"topic2Achievement3\": \"Sesin yayıldığı ortamın değiştiğinde sesin farklı duyulduğunu deney yaparak keşfetmiştir.\", " +
                "\"topic3\": \"Sesin Hızı\", " +
                "\"topic3Achievement1\": \"Farklı ortamlarda sesin hızını karşılaştırmıştır.\", " +
                "\"topic3Achievement2\": \"Sesin uzayda yayılmadığı nedeniyle açıklamıştır.\", " +
                "\"topic3Achievement3\": \"Sesin bir enerji türü olduğunu belirtmiştir.\", " +
                "\"topic4\": \"Sesin Maddenin Etkileşimi\", " +
                "\"topic4Achievement1\": \"Sesin maddenin etkileşimi sonucu meydana gelebilecek durumları anlamıştır.\", " +
                "\"topic4Achievement2\": \"Sesin yayılmasını önlemek için tahminlerde bulunmuş ve bu tahminlerini test etmiştir.\", " +
                "\"topic4Achievement3\": \"Ses yalıtımının önemini açıklamış ve ses yalıtımı için geliştirilen teknolojik ve mimari uygulamalara örnekler vermiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit6Grade6Achievement() {
        String jsonString = "{\"topic1\": \"Kontrol ve Düzenleyici Sistemler\", " +
                "\"topic1Achievement1\": \"Sinir sistemi ve merkezi ve periferik sinir sisteminin işlevlerini model üzerinde açıklamıştır.\", " +
                "\"topic1Achievement2\": \"Endokrin bezlerin vücut için önemini tanımıştır.\", " +
                "\"topic1Achievement3\": \"Çocukluktan ergenliğe geçişte meydana gelen fiziksel ve psikolojik değişiklikleri açıklamıştır.\", " +
                "\"topic2\": \"Duyu Organları\", " +
                "\"topic2Achievement1\": \"Duyu organlarının yapılarını, duyu organlarının sağlığı, duyu organları arasındaki ilişkiler, teknoloji\", " +
                "\"topic2Achievement2\": \"Duyu organlarının yapılarını model üzerinde göstererek açıklamıştır.\", " +
                "\"topic2Achievement3\": \"Duyu organlarının sağlığını korumak için alınması gereken önlemleri tartışmıştır.\", " +
                "\"topic3\": \"Sistemlerin Sağlığı\", " +
                "\"topic3Achievement1\": \"Sistemlerin sağlığı için yapılması gerekenleri araştırma verilerine dayanarak tartışmıştır.\", " +
                "\"topic3Achievement2\": \"Bilinçsiz ilaç kullanımının zararları vurgulanmıştır.\", " +
                "\"topic3Achievement3\": \"İlk yardım hakkında temel bilgiler verilmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit7Grade6Achievement() {
        String jsonString = "{\"topic1\": \"İletkenler ve Yalıtkanlar\", " +
                "\"topic1Achievement1\": \"İletken malzemeler, yalıtıcı malzemeler, iletken ve yalıtıcı malzemelerin kullanım alanları\", " +
                "\"topic1Achievement2\": \"Tasarladığı elektrik devresi kullanılarak maddeleri elektrik iletkenliğine göre sınıflandırmıştır.\", " +
                "\"topic1Achievement3\": \"Malzemelerin elektrik iletkenliği ve yalıtkanlık özelliklerinin günlük hayatta hangi amaçlarla kullanıldığını örneklerle açıklamıştır.\", " +
                "\"topic2\": \"Elektrik Direnci ve Bağımlı Olduğu Faktörler\", " +
                "\"topic2Achievement1\": \"Elektrik direnci, elektrik direncinin bağımlı olduğu faktörler (kesit alanı, uzunluk, iletken tipi)\", " +
                "\"topic2Achievement2\": \"Elektrik direncini tanımlamıştır.\", " +
                "\"topic2Achievement3\": \"Ampulün içindeki telin dirence sahip olduğunu fark etmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Uydu, Uzay Kirliliği, Gökyüzü Gözlem Araçları\", " +
                "\"topic1Achievement1\": \"Uzay teknolojilerini açıklamıştır.\", " +
                "\"topic1Achievement2\": \"Uzay kirliliğinin nedenlerini ifade etmiş ve bu kirliliğin olası sonuçlarını tahmin etmiştir.\", " +
                "\"topic1Achievement3\": \"Teknoloji ile uzay keşfinin ilişkisini açıklamıştır.\", " +
                "\"topic2\": \"Yıldız, Takımyıldız, Galaksi, Kara Delik\", " +
                "\"topic2Achievement1\": \"Yıldız oluşum sürecinin farkında olmuştur.\", " +
                "\"topic2Achievement2\": \"Yıldız kavramını açıklamıştır.\", " +
                "\"topic2Achievement3\": \"Galaksilerin yapısını açıklamıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit2Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Hücre\", " +
                "\"topic1Achievement1\": \"Hayvan ve bitki hücrelerini temel parçaları ve işlevleri açısından karşılaştırmıştır.\", " +
                "\"topic1Achievement2\": \"Hücre yapısı hakkındaki görüşleri geçmişten günümüze teknolojik gelişmelerle ilişkilendirerek tartışmıştır.\", " +
                "\"topic1Achievement3\": \"Hücre-doku-organ-sistem-organizma ilişkisini açıklamıştır.\", " +
                "\"topic2\": \"Mitoz\", " +
                "\"topic2Achievement1\": \"Mitozun canlılar için önemini açıklamıştır.\", " +
                "\"topic2Achievement2\": \"Mitozun birbirini takip eden farklı aşamalardan oluştuğunu açıklamıştır.\", " +
                "\"topic3\": \"Mayoz\", " +
                "\"topic3Achievement1\": \"Mayozun canlılar için önemini açıklamıştır.\", " +
                "\"topic3Achievement2\": \"Üreme ana hücrelerinde mayozun nasıl gerçekleştiğini model üzerinde göstermiştir.\", " +
                "\"topic3Achievement3\": \"Mayoz ve mitoz arasındaki farkları karşılaştırmıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit3Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Kütle ve Ağırlık İlişkisi\", " +
                "\"topic1Achievement1\": \"Kütle üzerine etki eden yerçekimi kuvvetini ağırlık olarak adlandırmıştır.\", " +
                "\"topic1Achievement2\": \"Kütle ve ağırlık kavramlarını karşılaştırmıştır.\", " +
                "\"topic1Achievement3\": \"Yerçekimini, gök cisimleri temelinde yerçekimi olarak açıklamıştır.\", " +
                "\"topic2\": \"Kuvvet, İş ve Enerji İlişkisi\", " +
                "\"topic2Achievement1\": \"Fiziksel olarak yapılan işin uygulanan kuvvet ve alınan mesafe ile ilişkili olduğunu açıklamıştır.\", " +
                "\"topic2Achievement2\": \"Enerjiyi iş kavramı ile ilişkilendirerek kinetik ve potansiyel enerji olarak sınıflandırmıştır.\", " +
                "\"topic2Achievement3\": \"Potansiyel enerjinin kütle ve yüksekliğe, kinetik enerjinin kütle ve hıza bağlı olduğunu belirtmiştir.\", " +
                "\"topic3\": \"Enerji Dönüşümleri\", " +
                "\"topic3Achievement1\": \"Kinetik ve potansiyel enerji türlerinin birbirine dönüşümüne dayanarak enerjinin korunduğu sonucuna varmıştır.\", " +
                "\"topic3Achievement2\": \"Sürtünme kuvvetinin kinetik enerji üzerindeki etkisini örneklerle açıklamıştır.\", " +
                "\"topic3Achievement3\": \"Farklı araçların tasarımında hava veya su direncinin etkisini ele almıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit4Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Maddenin Tanecikli Yapısı\", " +
                "\"topic1Achievement1\": \"Atomun yapısını ve yapısındaki temel parçacıkları anlatmıştır.\", " +
                "\"topic1Achievement2\": \"Atom kavramı hakkındaki fikirlerin geçmişten günümüze nasıl değiştiğini sorgulamıştır.\", " +
                "\"topic1Achievement3\": \"Aynı veya farklı atomların bir araya gelerek molekül oluşturduğunu belirtmiştir.\", " +
                "\"topic2\": \"Saf Maddeler\", " +
                "\"topic2Achievement1\": \"Element, elementlerin simgeleri, bileşik, bileşik formülleri\", " +
                "\"topic2Achievement2\": \"Saf maddeleri elementler ve bileşikler olarak sınıflandırmış ve örnekler vermiştir.\", " +
                "\"topic2Achievement3\": \"Periyodik sistemdeki ilk 18 element ve yaygın elementler (altın, gümüş, bakır, çinko, kurşun, cıva, platin, demir ve iyot) hakkında bilgiler vermiştir.\", " +
                "\"topic3\": \"Karışımlar\", " +
                "\"topic3Achievement1\": \"Karışımları homojen ve heterojen olarak sınıflandırmış ve örnekler vermiştir.\", " +
                "\"topic3Achievement2\": \"Günlük hayatta karşılaşılan çözücüler ve çözünürler kullanarak çözeltiler hazırlamıştır.\", " +
                "\"topic3Achievement3\": \"Çözünme hızını etkileyen faktörleri deney yaparak belirlemiştir.\", " +
                "\"topic4\": \"Evsel Atıklar ve Geri Dönüşüm\", " +
                "\"topic4Achievement1\": \"Evsel atıklarda geri dönüştürülebilir ve geri dönüştürülemeyen malzemeleri ayırt etmiştir.\", " +
                "\"topic4Achievement2\": \"Geri dönüşümü kaynakların etkin kullanımı açısından sorgulamıştır.\", " +
                "\"topic4Achievement3\": \"Çevresindeki atık kontrolüne dikkat etmiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit5Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Işık Emilimi\", " +
                "\"topic1Achievement1\": \"Işık maddenin etkileşimi sonucu emilebileceğini keşfetmiştir.\", " +
                "\"topic1Achievement2\": \"Beyaz ışığın tüm ışık renklerinin birleşiminden oluştuğu sonucuna varmıştır.\", " +
                "\"topic1Achievement3\": \"Günlük hayatta ve teknolojide yenilikçi güneş enerjisi uygulamalarına örnekler vermiştir.\", " +
                "\"topic2\": \"Aynalar\", " +
                "\"topic2Achievement1\": \"Aynaların türlerini gözlemlemiş ve kullanım alanlarına örnekler vermiştir.\", " +
                "\"topic2Achievement2\": \"Düz, oyuk ve kabarık aynalarda oluşan görüntüleri karşılaştırmıştır.\", " +
                "\"topic2Achievement3\": \"Oyuk aynada nesnenin görüntüsünün özelliklerinin (büyük/küçük, ters/düz) nesnenin aynadan uzaklığına bağlı olarak değişebileceğini belirtmiştir.\", " +
                "\"topic3\": \"Işık Kırılması ve Mercekler\", " +
                "\"topic3Achievement1\": \"Işığın ortam değiştirdiğinde yönünün nasıl değiştiğini gözlemleyerek kırılmanın nedenini ortam değişikliği ile ilişkilendirmiştir.\", " +
                "\"topic3Achievement2\": \"Ince ve kalın mercekler kullanarak ışığın kırılmasını deneysel olarak gözlemlemiştir.\", " +
                "\"topic3Achievement3\": \"Deney yaparak ince ve kalın merceklerin odak noktalarını belirlemiştir.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit6Grade7Achievement() {
        String jsonString = "{\"topic1\": \"İnsanlarda Üreme, Büyüme ve Gelişme\", " +
                "\"topic1Achievement1\": \"İnsan üremesini sağlayan yapıları ve organları bir diyagram üzerinde göstererek açıklamıştır.\", " +
                "\"topic1Achievement2\": \"Sperm, yumurta, zigot, embriyo, fetus ve bebek arasındaki ilişkiyi açıklamıştır.\", " +
                "\"topic1Achievement3\": \"Embriyonun sağlıklı gelişimi için alınması gereken önlemleri araştırma verilerine dayanarak tartışmıştır.\", " +
                "\"topic2\": \"Bitkilerde ve Hayvanlarda Üreme, Büyüme ve Gelişme\", " +
                "\"topic2Achievement1\": \"Bitkilerde ve hayvanlarda üreme türlerini karşılaştırmıştır.\", " +
                "\"topic2Achievement2\": \"Bitkilerde ve hayvanlarda büyüme ve gelişme süreçlerini örnekler vererek açıklamıştır.\", " +
                "\"topic2Achievement3\": \"Bitkilerde ve hayvanlarda büyüme ve gelişmeyi etkileyen temel faktörleri açıklamıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit7Grade7Achievement() {
        String jsonString = "{\"topic1\": \"Ampullerin Bağlanma Şekilleri\", " +
                "\"topic1Achievement1\": \"Seri ve paralel bağlamanın nasıl çalıştığını keşfetmiş ve seri ve paralel bağlı ampullerden oluşan bir devre şeması çizmiştir.\", " +
                "\"topic1Achievement2\": \"Elektrik enerji kaynaklarının elektrik devrelerine elektrik akımı sağladığını ve elektrik akımının bir enerji transferi türü olduğunu bilmektedir.\", " +
                "\"topic1Achievement3\": \"Ampullerin seri ve paralel bağlandığında parlaklık farkının elektrik direnci ile ilişkilendirilmesini açıklamıştır.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}
