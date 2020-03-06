  
public class TestLamdaTwoParams
{ 
	// operation is implemented using lambda expressions 
	interface FuncInter1 
	{ 
		int getSum(int a, int b); 
	} 

	// greetMessage() is implemented using lambda expressions 
	  
	interface FuncInter2 
	{ 
		void greetMessage(String message); 
	} 

	// Pass Function as parameter and perform function's operation on 'a' and 'b' 
	private static int verify(int a, int b, FuncInter1 fobj) 
	{ 
		return fobj.getSum(a, b); 
	} 

	public static void main(String args[]) 
	{ 
		// lambda expression for addition for two parameters 
		// data type for x and y is optional. 
		// This expression implements 'FuncInter1' interface 
		FuncInter1 add = (int x, int y) -> x + y; 
		
		System.out.println("The add fun is "+add);

		// lambda expression multiplication for two parameters 
		// This expression also implements 'FuncInter1' interface 
		FuncInter1 multiply = (int x, int y) -> x * y; 
		
		System.out.println("The multiply fun is "+multiply);

		// Add two numbers using lambda expression 
		System.out.println("Addition is " + 
				verify(6, 3, add)); 

		// Multiply two numbers using lambda expression 
		System.out.println("Multiplication is " + 
				verify(6, 3, multiply)); 

		// lambda expression for single parameter 
		// This expression implements 'FuncInter2' interface 
		FuncInter2 fobj = message ->System.out.println("Hello "
												+ message); 
		fobj.greetMessage("Geeks"); 
	} 
} 
