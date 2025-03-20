package models;

public class Cinema{

	private String name;
	private String location;
	private Screen[] Screens;



	public Cinema(String name, String location,int totalScreens){
		this.name = name;
		this.location = location;
		this.Screens = new Screen[totalScreens];

	}


	public void addScreen(int index, Screen screen){
		if (index >= 0 && index < Screens.length) {
			Screens[index] = screen;
		}



	}


	public void displayCinema(){

		System.out.println();
		System.out.println("Cinema: " + name);
		System.out.println("Location: " + location);
		System.out.println();

		for (Screen screen : Screens) {
            		if (screen != null) {
                		screen.displayScreen();
            		}
		}
		
	}






}