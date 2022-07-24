# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06
# Ödev -Girilen Sayılardan Min ve Max Değerleri Bulma
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
## Programın Çalışması :
- Kullanıcıdan kaç tane sayı gireceği alınır.(n)
- En büyük ve en küçün sayıyı tutmak için başlangıçta 0 değerine sahip iki değişken oluşturulur.(numberB,numberS)
- Doğru Bir karşılaştırma Yapabilmek için girilen ilk değeri bir defaya mahsus olmak üzere iki değişkene atanması gerekir bunu kontrol etmek için bir true değerine sahip boolen değişkeni oluşturulur.(isFirst)
- Kullanıcın girdiği değer kadar çalışak bir for döngüsü oluşturulur.
- Döngünün içerinde bir isFirst=True şartına sahip bir if koşulu oluşturulur.isFirst true ise kullanıcının girdiği değer numberS ve numberB'ye atanır.
- İkinci bir if-else koşulu ile sayılar bir birleriyle karşılaştırılır ve en büyük değer numberB değişkenine ,en küçük değer ise numberS değişkenine atanır.
- numberB ve numberS ekrana yazdırılır.

Örnek :Kullanıcın 4 sayı girdiği varsayılsın.
- 1.Sayı 5 girilisin.
  program bu noktada isFirst true değeri olacağı için numberS=5,numberB=5 değerini alır ve isFirst false değerini alır.
 Kullanıcının girdiği sayı numberB ve numberS ile karşılaştırılır ancak değişkenler girilen değer ile eşit olduğu için atama yapılmaz.
 2.Sayı istenir.
- 2.Sayı 9 olsun
    Bu noktada 9 değeri 9>numberB(5) ile karşılaştırılır.9 5'ten büyük olduğu için numberB'nin değeri 9 olarak atanır.
    Program daha sonra 9 <numberS(5) ile karşılaştırır.9 5'ten büyük olduğu için atama yapılmaz.numberS=5 olarak kalır.
    3.Sayı İstenir.
- 3.Sayı 1 olsun.
  1 değeri 1>numberB(9) ile karşılaştırılır.1 9'dan büyük olmadığı  için numberB'nin değeri 9 olarak kalır.
  Program daha sonra 1 <numberS(5) ile karşılaştırır.1 5'ten küçük olduğu için numberS=1 olarak değiştirilir.
  4.Sayı istenir.
- 4.Sayı 9 olsun
  9 değeri 9>numberB(9) ile karşılaştırılır.9 değeri 9 ile eşit olduğundan herhangi bir atama yapılmaz.
  Program daha sonra 9 <numberS(1) ile karşılaştırır.9 1'den büyük olduğu için atama yapılmaz.numberS=1 olarak kalır.
- Ekrana Büyük ve küçük sayılar yazdırılır ve program biter.