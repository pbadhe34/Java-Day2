 //check if String contains only Alphabets using Lambda Expression 

class LambdaStringCompare { 

	// Function to check String for only Alphabets 
	public static boolean isStringOnlyAlphabet(String str) 
	{ 
		//The Lambda Expression Character::isLetter().
		return ((str != null) 
				&& (!str.equals("")) 
				&& (str.chars().allMatch(Character::isLetter))); 
	} 

	 
	public static void main(String[] args) 
	{ 

		// Checking for True case 
		System.out.println("Test Case 1:"); 

		String str1 = "Uzbekistan se aya Hai"; 
		System.out.println("Input: " + str1); 
		System.out.println("Output: " + isStringOnlyAlphabet(str1)); 

		// Checking for String with numeric characters 
		System.out.println("\nTest Case 2:"); 

		String str2 = "My7Tr#"; 
		System.out.println("Input: " + str2); 
		System.out.println("Output: " + isStringOnlyAlphabet(str2)); 

		// Checking for null String 
		System.out.println("\nTest Case 3:"); 

		String str3 = null; 
		System.out.println("Input: " + str3); 
		System.out.println("Output: " + isStringOnlyAlphabet(str3)); 

		// Checking for empty String 
		System.out.println("\nTest Case 4:"); 

		String str4 = ""; 
		System.out.println("Input: " + str4); 
		System.out.println("Output: " + isStringOnlyAlphabet(str4)); 
	} 
} 
