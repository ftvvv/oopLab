package LibrarySystem;
public class Library{

	private Person staff;
	private Book book;
	private String name;
	private Person incharge;

	public Libray(Person staff1, Book book1, String name1, Person incharge1) {
		this.staff = new Person(staff1);
		this.book = new Book(book1);
		this.name = name1;
		this.incharge = new Person(incharge1);
	}


	public Library(Library other) {
		this.staff = new Person(other.staff);
		this.book = new Book(other.book);
		this.name = other.name;
		this.incharge = new Person(other.incharge);
	}


	public void showLibraryDetails() {
		System.out.println("Library Details");
		System.out.printf("Name: %s", name);



	}



	public String getName() {
		return name;
	}

	public void setName(String namep) {
		this.name = namep
	}

	




}