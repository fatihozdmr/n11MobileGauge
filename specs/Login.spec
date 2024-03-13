Login Specification
=====================
tags:N11MobileLogin

Basarili login ve gecersiz login islemleri

TC-Login-01: Basarili login olma
-------------------------------------------
* Login sayfasina gidilir
* Login islemi "kayitlikullanici@gmail.com" emaili ve "********" sifresi ile yapilir
* Basarili login olundugu kontrol edilir
* Hesaptan cikis yapilir, anasayfaya yonlendirilir, cikis yapildigi kontrol edilir

TC-Login-02: Kayitli olmayan mail ile login
-------------------------------------------
* Login sayfasina gidilir
* Login islemi "kayitsizkullanici@xyz.com" emaili ve "test1234." sifresi ile yapilir
* Kayitli olmayan mail ile giris yaptiktan sonra uyari mesaji goruntulenir

TC-Login-03: Gecersiz mail hesabi ile login
-------------------------------------------
* Login sayfasina gidilir
* Login islemi "gecersizMail" emaili ve "test1234." sifresi ile yapilir
* Gecersiz mail ile giris yaptiktan sonra uyari mesaji goruntulenir