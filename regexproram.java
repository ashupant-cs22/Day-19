package Regex;

    import java.util.regex.*;
	class regex {

		public static boolean
		ValidPassword(String password)
		{

			String regex = "^(?=.*[0-9])"
						+ "(?=.*[a-z])(?=.*[A-Z])"
						+ "(?=.*[@#$%^&+=])"
						+ "(?=\\S+$).{8,20}$";

			Pattern p = Pattern.compile(regex);

			
			if (password == null) {
				return false;
			}

			Matcher match = p.matcher(password);

			
			return match.matches();
		}

		public static void main(String args[])
		{

			// Case 1:
			String str1 = "Ashu@123";
			System.out.println(ValidPassword(str1));

			// Case 2:
			String str2 = "Ashu";
			System.out.println(ValidPassword(str2));

			// Case 3:
			String str3 = "Ashu@ 123";
			System.out.println(ValidPassword(str3));

			// Case 4:
			String str4 = "1234";
			System.out.println(ValidPassword(str4));

			// Case 5:
			String str5 = "ashu@123";
			System.out.println(ValidPassword(str5));

			// Case 6:
			String str6 = "ashu@l23";
			System.out.println(ValidPassword(str6));
		}
	}

	

