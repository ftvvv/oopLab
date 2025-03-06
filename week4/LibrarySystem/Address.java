package LibrarySystem;

public class Address {

	private String street;
	private String city;


	public Address(String street1, String city1) {
		this.street = street1;
		this.city = city1;
	}

	public Address(Address other) {
		this.street = other.street;
		this.city = other.city;
	}

	public void showAddress(){


	}

	public boolean equals(Object obj){


	}


	public String getStreet() {
		return street;
	}


	public setStreet(String streetp) {
		this.street = streetp;
	}

	public String getCity(){
		return city;

	}


	public void setCity(String cityp){
		this.city = cityp;
	}



}