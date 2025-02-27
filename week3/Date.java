public class Date{

	int day;
	int month;
	int year;

	public Date(int d1, int m1, int y1) {
		setDay(d1);
		setMonth(m1);
		setYear(y1);
	}




																				
	public void setDay(int dayP){
		if ( dayP >= 1 && dayP <= 30) {
			this.day = dayP;
		}
	}

	
	public void setMonth (int monthP) {

		if (monthP >= 1 && monthP<= 12) {
			this.month = monthP;
		}
	}


	public void setYear(int yearP) {
		if ( yearP > 0 ) {
			this.year = yearP;
		}

	}




	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}


	public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
	}	


	




}