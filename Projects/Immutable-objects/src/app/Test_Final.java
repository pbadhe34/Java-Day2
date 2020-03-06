package app;

import java.util.ArrayList;
import java.util.List;

public class Test_Final {

	public static void main(String[] args) {
		int data = 34;
		final int num1 = data;
		//num1 = 45;
		//num1= data;
		data = 56;
		System.out.println("Num1 value "+num1);
		System.out.println("data value "+data);
		final String s1 = new String("Baba");
		System.out.println("s1 value "+s1);
		//s1= "fsf";
		String ns =s1.concat("hhs");
		 
		final User obj = new User(1234);
		System.out.println("User obj data "+obj.getNum()+ " "+obj.getName());
		//Can modify the state of object
		obj.setName("nsansn");
		obj.setNum(342);
		
		//The ref cannot be chnaged
		//obj = new User(322);
		
		System.out.println("User obj data "+obj.getNum()+" "+obj.getName());
		
		final StringBuffer sb = new StringBuffer("Hello"); 
		         
		 //reassignment is not possible for final variable 
	     // sb = new StringBuffer("Hello World"); 
	  
		System.out.println("original value is "+sb);   
        // We can perform any changes and modify it 
        sb.append("Data"); 
  
                  
        System.out.println("New value is  "+sb); 
        
        final List<String> stringList = new ArrayList<>();
        stringList.add("userDsfs");
        stringList.add(1, "KishorDa");
        System.out.println("Size of final list "+stringList.size()); 
		
        
        //stringList = new ArrayList();
        
        System.out.println("The final list "+stringList); 
		
		
		 	
			
	}

}
