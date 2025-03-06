package LibrarySystem;

public class Person {

	String name;
	Address address;


	public Person(String namep, Address addressp) {
		this.name = namep;
		this.address = new Address(addressp);

	} 


	public Person(Person other) {
		this.name = other.name;
		this.address = new Address(other.address);
		
	}

	public void showPersonDetails() {

	}

	pubic boolean equals(Object obj){

	}

	public String getName(){
		return name;
	}


	public void setName(String namep) {
		this.name = namep;

	}




}