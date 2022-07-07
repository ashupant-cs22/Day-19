package Regex;

import java.util.Scanner;

public class ValidatePhoneNo {

	 public static void main(String[] args) {
	    
		 Scanner phonenumber = new Scanner(System.in);
	      
		 System.out.println("Enter your Phone number: ");
	      
		 String phone = phonenumber.next();
	       
		 String regex = "\\d{10}";
	     
	     boolean result = phone.matches(regex);
	     
		 if (result) {
	       
			 System.out.println("Phone number is valid");
	     
		 } else {
	     
			 System.out.println("Phone number is not valid");
	      }
	   }
	
}
