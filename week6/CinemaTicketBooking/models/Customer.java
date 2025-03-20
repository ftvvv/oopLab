package models;


public class Customer{

	private int customerId;
	private String name;
	private String phoneNumber;
	private String email;


	public Customer(int customerId, String name, String phoneNumber, String email){
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;

	}


	

	@Override
	public boolean equals(Object obj){
		if (this == obj) {
            		return true; 
        	}

        	if (obj == null || getClass() != obj.getClass()) {
            		return false; 
        	}

        	Customer other = (Customer) obj;
        	return this.customerId == other.customerId;
	}

	public void displayCustomer(){
		System.out.println("Customer ID: " + customerId + " | Name: " + name);
	}	

   	public String getName() {
        	return name;
    	}


}