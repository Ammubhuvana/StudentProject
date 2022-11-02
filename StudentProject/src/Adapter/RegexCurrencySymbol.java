package Adapter;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	 
	public class RegexCurrencySymbol {
	 
	    public static void main(String args[]) {
	        String password = "Alexa coded123";
	 
	        String regex = "^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{8,20}$";
	        boolean validPassword = isValidPassword(password,regex);
	        System.out.println("Alexa coded123:" +validPassword);
	 
	    }
	 
	    public static boolean isValidPassword(String password,String regex)
	    {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        return matcher.matches();
	    }
	}


