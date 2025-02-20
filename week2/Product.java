public class Product {

	private static int count = 0;
	private String id;
	private String name;
	private int quantity;
	private int price;
	private String category;


	Product(String nameP, int quantityP, int priceP, String categoryP) {
		
		count++;	
		this.id = Integer.toString(count);
		this.name = nameP;
		this.quantity = quantityP;
		this.price = priceP;
		this.category = categoryP;
			
	}


	public void setName(String nameS) {
		this.name = nameS;		
	}

	public void setQuantity(int quantityS) {
		this.quantity = quantityS;		
	}

	public void setPrice(int priceS) {
		this.price = priceS;		
	}

	public void setCategory(String categoryS) {
		this.category = categoryS;		
	}

	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
	

	public void display() {

		System.out.printf("PRODUCT DETAILS%n");
		System.out.printf("Category: %s%n", category);
		System.out.printf("%nID: %s%n", id);
		System.out.printf("Name: %s%n", name);
		System.out.printf("Price : $ %d%n", price);
		System.out.printf("Quantity: %s%n", quantity);
			
	}




}