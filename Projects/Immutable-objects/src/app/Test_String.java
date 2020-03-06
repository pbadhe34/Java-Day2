package app;

public class Test_String {

	public static void main(String[] args) {
		 String s1 = new String("User is running");
		 String s2 = s1.concat(" with tools");
		 String s3 = s1.concat(" with tools");
		 System.out.println("S1 "+s1);
		 System.out.println("S2 "+s2);
		 System.out.println("S3 "+s3);
		 System.out.println("Equal objects "+s2.equals(s3));
		 
		 System.out.println("Equal Values "+s2.equalsIgnoreCase(s3));
			
		  String s4 = "User is running";
		  String ns = s3.replace("tools", "Data");
		  System.out.println("S3 after replace "+s3);
		  System.out.println("Ns after replace "+ns);
		  
		  System.out.println("Literal Equal objects "+s1.equals(s4));
			 
		  System.out.println("Literal Equal Values "+s1.equalsIgnoreCase(s4));
			
		 s1 = "User is running with tools";
			
	     System.out.println("S1 Equal objects "+s1.equals(s2));
			 
	     System.out.println("S1 Equal Values "+s1.equalsIgnoreCase(s2));
			
	     System.out.println("S4 "+s4);
	      s3=s1;
	      s4 = "MyData#$%";
	      s1=s4;
	      System.out.println("S4 hashCode"+s4.hashCode());
	      System.out.println("S1 hashcode "+s1.hashCode());
	      
	      s4= "TestUser";	      
	      System.out.println("S4 "+s4);
	      System.out.println("S1 "+s1);
	      System.out.println("S3 "+s3);	      
	      
	      System.out.println("S3 hashCode "+s3.hashCode());
	      
	      
	       
			
	}

}
