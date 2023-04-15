package kodlama.io.Rent_A_Car_InMemory.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Rent_A_Car_InMemory.business.abstracts.BrandService;
import kodlama.io.Rent_A_Car_InMemory.dataAccess.abstracts.BrandRepository;
import kodlama.io.Rent_A_Car_InMemory.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		return brandRepository.getAll();
	}
}

/*

Service kullanarak BrandManager class i icindeki islemlere ulasilmasini kolaylastirmak icin
IOC uzerinden ulasim sagliyoruz

Autowired kullanarak BrandRepository interface ini implement komutu ile kullanan class i ariyor
buldugunda class icindeki datalari aliyoruz
BrancManager parametreli constructor icinde datanin gelecegi yeri belirtiyoruz

BrandService interface icinden gelen List tipindeki Brand leri getiren fonksiyon icinde
brandRepository uzerinden getAll fonksiyonu ile 
InMemoryBrandRepository icinde girdigimiz data lari donduruyoruz


*/