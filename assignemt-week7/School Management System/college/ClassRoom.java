package college;
import people.Teacher;
import people.Student;

public class ClassRoom{
	private String name;
	private String code;
	private Teacher teacher;
	private Student[] students;
	private int studentCount;


	public ClassRoom(String name, String code, Teacher teacher){
		this.name = name;
		this.code = code;
		this.teacher = teacher;
		this.students = new Student[5];
		this.studentCount = 0;
	}

	
		

	public boolean addStudent(Student std){
		if (studentCount <5 ) {
			students[studentCount] = std;
			studentCount++;
			return true;
		}
		else {
			System.out.println("Only maximum 5 students can be added");
			return false;
		}
		
	}

	public String getName() {
        	return name;
    	}

    	public String getCode() {
        	return code;
    	}

	public Teacher getTeacher() {
        	return teacher;
    	}

	public void setTeacher(Teacher teacher) {
        	this.teacher = teacher;
    	}

	public void setName(String nameP) {
        	this.name = nameP;
    	}

	public void setCode(String codeP){
		this.code = codeP;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
        	sb.append("Class: ").append(name).append(" (").append(code).append(")\n");
        	if (teacher != null) {
            		sb.append("  ").append(teacher).append("\n");
        	} else {
            		sb.append("  No teacher assigned yet.\n");
        	}
        	sb.append("  Students:\n");
        	for (int i = 0; i < studentCount; i++) {
            		sb.append("    ").append(students[i]).append("\n");
        	}
        	return sb.toString();
	}
	

	}