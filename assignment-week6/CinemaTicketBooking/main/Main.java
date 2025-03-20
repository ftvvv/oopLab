package main;
import models.*;
import enums.*;

public class Main{

	public static void main(String[] args){

        	Cinema cinema = new Cinema("Vox Cinema", "Lahore", 4);

        	Screen screen1 = new Screen(1, "Rio 2", 10, 5);
        	cinema.addScreen(0, screen1);

        	Customer customer1 = new Customer(101, "Fatima Azhar", "+92 330 424 7839", "ft7vv@gmail.com");

        	boolean booked = screen1.bookSeat(2, 3, customer1);

        	if (booked) {
            		Ticket ticket = new Ticket(1, customer1, 1, 13, "Rio 2", 15.0);
            		ticket.displayTicket();
        	}

        	cinema.displayCinema();

	}



}