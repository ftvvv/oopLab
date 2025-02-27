package users;
import utils.PasswordValidator;



public class UserManager{

	static final String storedUsername = "fatima101";
	static final String storedPassword = "abcdef123" ;

	public static class LoginProcessor{

		public static boolean authenticate(String username, String password) {

			PasswordValidator pwValidator = new PasswordValidator();
			PasswordValidator.Rules rules = pwValidator.new Rules();


			
			if (!rules.isValid(password)) {
				System.out.println("password is less than 8 characters");
				return false;
			}
			
			return storedUsername.equals(username) && storedPassword.equals(password);
			
		}

	}


}