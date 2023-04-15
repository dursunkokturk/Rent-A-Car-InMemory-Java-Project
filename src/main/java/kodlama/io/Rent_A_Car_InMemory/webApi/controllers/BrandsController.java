package kodlama.io.Rent_A_Car_InMemory.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Rent_A_Car_InMemory.business.abstracts.BrandService;
import kodlama.io.Rent_A_Car_InMemory.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;
	
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
}

/* 

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

*/