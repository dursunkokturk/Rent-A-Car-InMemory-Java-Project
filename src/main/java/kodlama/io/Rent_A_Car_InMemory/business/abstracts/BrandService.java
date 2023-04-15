package kodlama.io.Rent_A_Car_InMemory.business.abstracts;

import java.util.List;

import kodlama.io.Rent_A_Car_InMemory.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
/*

List tipindeki array list yapisini kullanarak database icindeki Brand ulasiyoruz
getAll fonksiyonu ile listeme islemini yaoiyoruz

*/