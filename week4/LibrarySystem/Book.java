package LibrarySystem;
public class Book {

	private String title;
	private String issn;
	private Date publicationDate;
	private Person author;


	public Book(String title1, String issn1, Date publicationDate1, Person author1) {
		this.title = title1;
		this.issn = issn1;
		this.publicationDate = new Date(publicationDate1);
		this.author = new Person(author1);
		
	}

	public Book(Book other) {
		this.title = other.title;
		this.issn = other.issn;
		this.publicationDate = new Date(other.publicationDate);
		this.author = new Person(other.author);
	
	}

	public void showBookDetails() {



	}

	boolean equals(Object obj) {


	}


	public String getTitle(){
		return title;
	}

	public void setTitle(String titlep) {

		this.title = titlep;
	}

	public String getIssn(){
		return issn;
	}

	public void setIssn(String issnp){

		this.issn = issnp;
	}



}