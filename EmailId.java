package PracticeProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailId{

	public static boolean isValidEmail(String email) 
	{
		   String regex = "^(.+)@(.+)$";
		 // STEP 1: initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	 public static void main(String[] args)
	 {
	       List<String> emails = new ArrayList<String>();
	       // STEP 2 :valid email addresses
	       emails.add("lahari@gmail.com");
	       emails.add("laharie@boorgula.com");
	       emails.add("lahari@krishna.me.org");
	       //STEP 3:invalid email addresses
	       emails.add("krishna.b.com");
	       emails.add("lahari..boorgula.com");
	       emails.add("lahari.boorgula.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }



}
