public class Person {

	String name;
	String fatherName;
	String address;
	String id;
	String city;
	String country;
	String DOB;
	String profession;
	String gender;


	public Person (String name1, String fatherName1, String address1, String id1, String city1, String country1, String dob1, String profession1, String gender1) {
		this.name = name1;
		this.fatherName = fatherName1;
		this.address = address1;
		this.id = id1;
		this.city = city1;
		this.country = country1;
		this.DOB = dob1;
		this.profession = profession1;
		this.gender = gender1;																															
	}

	public Person (String addP, String Cityp, String cntryP) {
		this.address = addP;
		this.city = Cityp;
		this.country = cntryP;
		
		System.out.println(address + " " + city + " " + country);
		
	}
	

	public Person ( String NameP, String FatherNameP ) {
		this.name = NameP;
		this.fatherName = FatherNameP;
		System.out.println(name + " " + fatherName);

		
	}



}