package kodlama.io.Rent_A_Car_InMemory.entities.concretes;

public class Brand {
	private int id;
	private String name;

	public Brand() {
		super();
	}
	
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
/*
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
*/