package people;
public class Principal extends Person{
	private int experience;


	public Principal(String name, int age, int experience){
		super(name,age);		
		this.experience = experience;
		
	}


	public void setExperience(int exp){
		this.experience = exp;

	}


	public int getExperience(){

		return experience;

	}

	@Override
	public String toString(){

		return "Principal: " + getName() + " | " + getAge() + "yrs old | " + getExperience() + " years experience";


	}

	
}