package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPassword {
	
	public void Password() {

		// scanning
		String line = "abcdefoo123";
		String pattern = "^[a-z][A-Z][0-9]*$";

		// Create pattern object
		Pattern pat = Pattern.compile(pattern);

		// matching object create
		Matcher mat = pat.matcher(line);

		// Check Matching or not
		boolean result4 = mat.matches();
		System.out.println("password Matching result is " + result4);
		System.out.println();

	}
	public void PasswordWith1Uppercase() {

		// scanning
		String line = "Abcdefoo";
		String pattern = "^[A-Z]{1}[a-z]*";

		// Create pattern object
		Pattern pat = Pattern.compile(pattern);

		// matching object create
		Matcher mat = pat.matcher(line);

		// Check Matching or not
		boolean result5 = mat.matches();
		System.out.println("password with one U/C Matching result is " + result5);
		System.out.println();

	}
	public void PasswordWith1Numeric() {

		// scanning
		String line = "Abcdefoo123";
		String pattern = "^[A-Z]{1}[a-z][0-9]$";

		// Create pattern object
		Pattern pat = Pattern.compile(pattern);

		// matching object create
		Matcher mat = pat.matcher(line);

		// Check Matching or not
		boolean result6 = mat.matches();
		System.out.println("password with Numeric Number Matching result is " + result6);
		System.out.println();
	}

}
