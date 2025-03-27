package people;
public class Student extends Person{

	private String rollNumber;


	public Student(String name, int age, String rollNumber){
		super(name,age);
		this.rollNumber = rollNumber;

	}

	public String getRollNum(){
		return rollNumber;
	}

	public void setRollNum(String rollNum){
		this.rollNumber = rollNum;
	}

	@Override
	public String toString(){

		return "Student: " + getName() + " | " + getAge() + "yrs old | " + getRollNum() + " ID";
	}

	@Override
    	public boolean equals(Object obj) {
        	if (this == obj) {
			return true;}
	
        	if (obj == null || getClass() != obj.getClass()) {
			return false;}

        	Student student = (Student) obj;
        	return rollNumber == student.rollNumber;
    	}

}