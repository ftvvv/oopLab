package people;
public class Teacher extends Person{
	private String subject;
	private int teacherID;



	public Teacher(String name, int age, int TeacherID,String subject){
		super(name,age);
		this.subject = subject;
		this.teacherID = TeacherID;
		

	}



	public String getSubject(){
		return subject;
	}

	public int getID(){
		return teacherID;
	}

	public void setSubject(String sub){
		this.subject = sub;

	}
	

	public void setID(int teacherIDp){
		this.teacherID = teacherIDp;
	}


	@Override
	public String toString(){
		return "Teacher: " + getName() + " | " + getAge() + "yrs old | " + getID() + " ID | " + getSubject();
	}

	@Override
    	public boolean equals(Object obj) {
        	if (this == obj) {
			return true;
		}

        	if (obj == null || getClass() != obj.getClass()) {
			return false;}

        	Teacher teacher = (Teacher) obj;
        	return false;
    }
}
