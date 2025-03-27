package main;
import people.*;
import college.*;

public class Main{

	public static void main(String[] args){

		Principal principal = new Principal("Dr. Ahmed", 60, 30);

        
        	School school = new School("Crescent", "street 4, Shadman 2", principal);

        	Teacher csTeacher = new Teacher("Shahid Bhatti", 54, 201, "Computer Science");
        	Teacher mathTeacher = new Teacher("Adil Qureshi", 47, 202, "Mathematics");

        	ClassRoom csClass = new ClassRoom("N-14","CS101", csTeacher);
        	ClassRoom mathClass = new ClassRoom("D-12","MATH101", mathTeacher);

        	Student s1 = new Student("Fatima", 19, "S101");
        	Student s2 = new Student("Aiman", 20, "S102");
        	Student s3 = new Student("Areesha", 21, "S103");
        	Student s4 = new Student("Zahra", 19, "S104");
        	Student s5 = new Student("Nia", 20, "S105");

        	csClass.addStudent(s1);
        	csClass.addStudent(s2);
        	csClass.addStudent(s3);
        	csClass.addStudent(s4);
        	csClass.addStudent(s5);

        	mathClass.addStudent(s1);
        	mathClass.addStudent(s3);


        	school.addClass(csClass);
        	school.addClass(mathClass);

        	System.out.println(school);
	}


}