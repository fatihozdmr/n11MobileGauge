Login Specification
=====================
tags:N11MobileLogin

Basarili login ve gecersiz login islemleri

TC-Login-01: Basarili login olma
-------------------------------------------
tags: TC-Login-01_BasariliLoginOlma

* Login sayfasina gidilir
* Login islemi "testfatih18@gmail.com" emaili ve "ozdemir1234." sifresi ile yapilir
* Basarili login olundugu kontrol edilir
* Hesaptan cikis yapilir, anasayfaya yonlendirilir, cikis yapildigi kontrol edilir

TC-Login-02: Kayitli olmayan mail ile login
-------------------------------------------
tags: TC-Login-02_KayitliOlmayanMailIleLogin

* Login sayfasina gidilir
* Login islemi "kayitsizkullanici@xyz.com" emaili ve "test1234." sifresi ile yapilir
* Kayitli olmayan mail ile giris yaptiktan sonra uyari mesaji goruntulenir

TC-Login-03: Gecersiz mail hesabi ile login
-------------------------------------------
tags: TC-Login-03_GecersizMailHesabiIleLogin

* Login sayfasina gidilir
* Login islemi "gecersizMail" emaili ile yapilir
* Gecersiz mail ile giris yaptiktan sonra uyari mesaji goruntulenir
