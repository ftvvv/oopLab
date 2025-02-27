import java.io.Console;
import users.UserManager;
import java.util.Scanner;

public class LoginSystem{

	public static void main(String[] arg) {

		String username;
		String password;
		
		Console console = System.console();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		username = scanner.next();

		char[] passwordArray = console.readPassword("Enter Password: ");
		password = new String(passwordArray);

		if (UserManager.LoginProcessor.authenticate(username, password)) {
			System.out.println("welcome");

		}
		
		else {
			System.out.println("Incorrect Password or Username");
		}


	}



}