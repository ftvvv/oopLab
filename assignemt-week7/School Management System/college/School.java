package college;
import people.Principal;
import college.ClassRoom;

public class School{
	private String name;
	private String address;
	private ClassRoom[] classes;
	private Principal principal;
	private int classCount;

	public School(String name, String address, Principal principal){
		this.name = name;
		this.address = address;
		this.principal = principal;
		this.classCount = 0;
		this.classes = new ClassRoom[10];

	
	}

	public String getName() {
        	return name;
    	}

    	public String getAddress() {
        	return address;
    	}

    	public Principal getPrincipal() {
        	return principal;
    	}

	public void setName(String nameP){
		this.name = nameP;
	}


    	public void setPrincipal(Principal principal) {
        	this.principal = principal;
    	}


	public boolean addClass(ClassRoom classP){
	
		if (classCount < 10){
			classes[classCount] = classP;
			classCount++;
			return true;
		}
		else{
			System.out.println("Error...Only max 10 classes can be added.");
			return false;
		}
	}

	 @Override
    	public String toString() {
        	StringBuilder sb = new StringBuilder();
        	sb.append("School: ").append(name).append("\n");
        	sb.append("Address: ").append(address).append("\n");
        	sb.append(principal).append("\n");
        	sb.append("Classes:\n");
        	for (ClassRoom classRoom : classes) {
            		sb.append(classRoom).append("\n");
        	}
        	return sb.toString();
    	}


}