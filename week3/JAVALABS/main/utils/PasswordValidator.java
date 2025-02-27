package utils;

public class PasswordValidator {




	public class Rules{


		public boolean isValid(String password){
			
			if (password != null &&  password.length() >=8) {
				return true;	
			}
			
			else {
				return false;
			}

		}

	}

}