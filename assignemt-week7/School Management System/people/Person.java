package people;

public class Person{

	private String name;
	private int age;

	public Person(String name, int age){

	this.name = name;
	this.age = age;

	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String Namep){	
		this.name = Namep;
	}

	public void setAge(int Agep){
		this.age = Agep;

	}
	
	@Override
	public String toString(){
	 	return "Person: " + name + ", Age: " + age;	 
	}



}