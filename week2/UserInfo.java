import java.util.Scanner;
public class UserInfo {

	private static String Username = "Fatima";
	private static String Password = "12345abc";


	public static boolean LoginCheck(String Name, String Pw) {
		
		return Username.equals(Name) && Password.equals(Pw); 
	}


	
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter username:");
		String name = sc.next();

		System.out.print("enter password:");
		String pw = sc.next();

		if (LoginCheck(name, pw)) {
			System.out.print("successful");
		}

		else {
			System.out.print("unsuccessful");
		}
		

	}

}