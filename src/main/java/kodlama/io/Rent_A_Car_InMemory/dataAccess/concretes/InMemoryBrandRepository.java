package kodlama.io.Rent_A_Car_InMemory.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Rent_A_Car_InMemory.dataAccess.abstracts.BrandRepository;
import kodlama.io.Rent_A_Car_InMemory.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(1,"Audi"));
		brands.add(new Brand(1,"Fiat"));
		brands.add(new Brand(1,"Renault"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}
}

/*

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
 */