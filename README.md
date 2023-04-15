# Rent-A-Car-InMemory-Java-Project

Entities Katmanında
Class içinde kullanılacak isterleri tanimladiktan sonra
Database icindeki data alisverini yapabilmek icin 
ilk olarak parametresiz constructor tanimliyoruz
sonra parametreli constructor tanimliyoruz
son asama olarak database icine data almak icin
get fonksiyonlarini tanimliyoruz
database icinden data almak icin
get fonksiyonlarini tanimliyoruz
database icine data gondermek icin 
set fonksiyonlarini tanimliyoruz

DataAccess Katmanı altında abstracts katmanı altında
BrandRepository dosyasında
Entities katmani altindaki Brand Class icinde yer alan id ve name degerleri uzerinden database icindeki
tum datalari getAll Fonksiyonunu kullanarak listeliyoruz
Listeleme islemi Icin List Tipindeki Array yapisini kullaniyoruz

DataAccess Katmanı altında concretes katmanı altında
InMemoryBrandRepository dosyasında
Repository kullanarak database icideki datalara ulasmak icin kullanildigini belirtiyoruz
InMemory olarak olusturulacak olan data lara ulasmak icin 
InMemoryBrandRepository class icinde global olarak
List tipinde icinde Brand barindiran array list olusturuyoruz.
DataAccess katmani altindaki 
Abstracts katmani altinda yer alan 
BrandRepository interface icinde bulunan
List tipindeki Array Listesini implements komutu ile aliyoruz.
InMemory olarak calisan sistem oldugundan dolayi
List tipinde array list kullanarak kendi girdigimiz Brand leri kullaniyoruz
Parametresiz InMemoryBrandRepository constructor icinde
InMemory olarak database olusturulacagi icin 
ArrayList yapisi icinde database de yer alacak datalari giriyoruz
Kendi Olusturdugumuz Database icinde tuttuğumuz data lari
DataAccess katmani altindaki 
Abstracts katmini altinda bulunan
BrandRepository interface icindeki 
List Brand GetAll fonksiyonu ile database icindeki tum brand leri donduruyoruz.

Business Katmanı altında Abstracts katmanı altında
BrandService dosyasında
List tipindeki array list yapisini kullanarak database icindeki Brand ulasiyoruz
getAll fonksiyonu ile listeme islemini yaoiyoruz

Business Katmanı altında Concretes katmanı altında
BrandManager dosyasında
Service kullanarak BrandManager class i icindeki islemlere ulasilmasini kolaylastirmak icin
IOC uzerinden ulasim sagliyoruz
Autowired kullanarak BrandRepository interface ini implement komutu ile kullanan class i ariyor
buldugunda class icindeki datalari aliyoruz
BrancManager parametreli constructor icinde datanin gelecegi yeri belirtiyoruz
BrandService interface icinden gelen List tipindeki Brand leri getiren fonksiyon icinde
brandRepository uzerinden getAll fonksiyonu ile 
InMemoryBrandRepository icinde girdigimiz data lari donduruyoruz

WebApi katmanı altında controllers katmanı altında
BrandsController dosyasında
RestController uzerinden browser araciligi ile 
kullanici ve database arasinda haberlesmeyi sagliyor
RequestMapping ile browser uzerinden gelen istegi aliyoruz
BrandService interface i kullanarak Brand leri listeleme islemini
injection yaparak dahil ediyoruz
Autowired kullanarak BrandService interface ini implements komutu ile kullanan class i ariyor
buldugunda Obje olusturuyor
Bu işlemin gerceklesmesi icin BrandsController paremtreli constructor icinde BrandService calistiriyoruz
GetMapping kullanarak browser uzerinden kullaniciya gosterilecek brand bilgilerinin
gpsterilmesi icin browser da girilmesi gereken adres bilgisini belirtiyoruz
List tipindeki array list icinde Brand leri listeliyoruz
Bu islem ile browser uzerinden brand leri kullaniciya gosteriyoruz

Proje klasörü içinde Pom.xml dosyasında
InMemory calisacak uygulamalarda Spring Data JPA ve 
				PostgreSQL in devre disi birakilmasi gerekiyor
