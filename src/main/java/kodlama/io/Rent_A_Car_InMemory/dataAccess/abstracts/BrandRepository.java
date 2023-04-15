package kodlama.io.Rent_A_Car_InMemory.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Rent_A_Car_InMemory.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();
}

/*

Entities katmani altindaki Brand Class icinde yer alan id ve name degerleri uzerinden database icindeki
tum datalari getAll Fonksiyonunu kullanarak listeliyoruz

Listeleme islemi Icin List Tipindeki Array yapisini kullaniyoruz
*/