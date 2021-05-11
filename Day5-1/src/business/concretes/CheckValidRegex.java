package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidRegex {
	
	private static final Pattern emailPattern = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public  boolean isValidEmail(String emailStr) {
		        Matcher matcher = emailPattern.matcher(emailStr);
		        return matcher.find();
		}
	
	
	private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    private static final Pattern patternPassword = Pattern.compile(PASSWORD_PATTERN);
    
	
	public  boolean isValidPassword(String passwordStr) {
		Matcher matcher=patternPassword.matcher(passwordStr);
	    return matcher.matches();
	}
	
	

	public boolean isValidName (String nameStr) {
		if (nameStr.length()>2) {
			return true;
		}
		return false;
		
	}
}
