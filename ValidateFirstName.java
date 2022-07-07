package Regex;

public class ValidateFirstName {

	public class MainClass
	{
	   public static void main( String[] args )
	   {
	       System.out.println(validateFirstName("Ashu"));
	       System.out.println(validateLastName("pant"));
	   }
	   // For first name
	   public static boolean validateFirstName( String FirstName )
	   {
	      return FirstName.matches( "[A-Z a-z]{3,4}" );
	   } // validateFirstName method

	   // For last name
	   public static boolean validateLastName( String LastName )
	   {
	      return LastName.matches( "[A-Z a-z]{3,4}" );
	   } // validateLastName method
	   
	}
}

















	

