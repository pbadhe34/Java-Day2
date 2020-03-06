package app;

public class Test_Wrappers {

	public static void main(String[] args) {
		  Integer num1 = new Integer(112);
		  Integer num2 = 112;		  
		  
		 System.out.println("Equal objects "+num1.equals(num2));
		 
		 System.out.println("Equal Values "+(num1.intValue()==num2.intValue()));
			
		 System.out.println("Num1 hashCode "+num1.hashCode());
		 System.out.println("Num2 hashCode "+num2.hashCode());
			
			
	}

}
