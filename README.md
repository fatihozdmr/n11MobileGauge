# N11 Mobil Uygulama Testleri

Bu proje, N11 mobil uygulaması üzerinden belirli kriterlere uygun temel fonksiyonlardan ürün arama, sepete ürün ekleme, favorilere ürün ekleme ve login senaryolarını test eden Java otomasyon projesidir.

### İçindekiler

- [Projenin Amaçları](#projenin-amaçları)
- [Gereksinimler](#gereksinimler)
- [Nasıl Çalıştırılır](#nasıl-çalıştırılır)
- [Test Senaryoları](#test-senaryoları)
- [Test Koşum Raporunu Görüntüleme](#test-koşum-raporunu-görüntüleme)
- [Version](#version)

### Projenin Amaçları

* N11 mobil uygulaması üzerinden login olma işlemini otomatikleştirmek.
* Kullanıcı tarafından belirlenen kriterlere uygun ürünü bulmak ve sepete eklemek.
* Sepete eklenen ürünün doğruluğunu ve sepet içinde bulunup bulunmadığını kontrol etmek.
* Favorilere eklenen ürünün doğruluğunu ve favorilerim listesinde bulunup bulunmadığını kontrol etmek

### Gereksinimler
* Java JDK (versiyon 8 veya üzeri)
* IntelliJ IDEA
* Gauge
* Maven
* Appium Server
* Android simülatörü veya gerçek bir cihaz
* N11 .apk dosyası

### Nasıl Çalıştırılır
* Appium sunucusunu başlatın.
* Android studio üzerinden emulatörü çalıştırın.
* Projenin içinde bulunan .spec uzantılı dizinden senaryoyu çalıştırın.

### Test Senaryoları
Bu proje, aşağıdaki temel mobil test senaryolarını içermektedir:

* Giriş Yapma Senaryosu: Kullanıcı, uygulamaya giriş yapabilmelidir.
* Ürün Arama Senaryosu: Kullanıcı, belirli bir ürünü arayabilmelidir.
* Sepete Ürün Ekleme Senaryosu: Kullanıcı, bir ürünü sepete ekleyebilmelidir.
* Favorilere Ürün Ekleme Senaryosu: Kullanıcı, bir ürünü favorilere ekleyebilmelidir.

### Test Koşum Raporunu Görüntüleme
* Test koşumunu gerçekleştirdikten sonra 'reports' klasörü altında bulunan 'html-report' içerisindeki index.html uzantılı dosyadan test raporlarına ulaşabilirsiniz.
![report.png](..%2F..%2Freport.png)

### Version
* v1.0