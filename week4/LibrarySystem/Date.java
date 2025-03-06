package LibrarySystem;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day1, int month1, int year1) {
		this.day = day1;
		this.month = month1;
		this.year = year1;
	}

	public Date(Date other){
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;

	}

	public void showDate() {



	}

	public boolean equals(Object obj){

	}


	pubic void getDay() {
		return day;
	}

	public int setDay(int dayp) {

		this.day = dayp;
	}


	public int getMonth(){
		return month;

	}


	public void setMonth(int monthp){

		this.month = monthp;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int yearp){

		this.year = yearp;
	}


}