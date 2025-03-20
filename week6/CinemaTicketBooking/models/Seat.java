package models;
import enums.SeatType;

public class Seat{

	private int seatNumber;
	private int rowNumber;
	private SeatType type;
	private double price;
	private boolean isBooked;

	public Seat(int seatNumber, int rowNumber, SeatType type, double price){
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.type = type;
		this.price = price;
		this.isBooked = false;

	}

    	public int getSeatNumber() {
        	return seatNumber;
    	}


	public boolean bookSeat(){
		if (!isBooked) {
            		isBooked = true;
            		return true;
        	}
        	return false;

	}

	public void display(){
		System.out.println("Seat " + seatNumber + " (Row: " + rowNumber + ") Type: " + type + " Price: $" + price);
	}


	public boolean isBooked() {
    		return isBooked; 
	}


	



}