

  
import java.util.ArrayList; 
class Lambda_with_Array
{ 
	public static void main(String args[]) 
	{ 
		 
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
		arrL.add(1); 
		arrL.add(2); 
		arrL.add(3); 
		arrL.add(4); 

		System.out.println("For Each with Lambda");
		// Using lambda expression to print all elements of arrL 
		arrL.forEach(n -> System.out.println(n)); 

		System.out.println("For Each for evens");
		// Using lambda expression to print even elements of arrL 
		arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
		
		System.out.println("For Each for odds");
		// Using lambda expression to print odd elements of arrL 
	    arrL.forEach(n -> { if (n%2 != 0) System.out.println(n); }); 
	} 
} 
