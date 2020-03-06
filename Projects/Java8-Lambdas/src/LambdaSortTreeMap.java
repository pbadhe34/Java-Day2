 import java.util.*; 

public class LambdaSortTreeMap { 
	public static void main(String[] args) 
	{ 
		/*TreeMap<Integer, String> map = 
				new TreeMap<Integer, String>((key1, key2) -> (key1 > key2) ? 
											-1 : (key1 < key2) ? 1 : 0); 
	*/	
		TreeMap<Integer, String> map = 
				new TreeMap<Integer, String>((key1, key2) -> (key1 > key2) ? 
											1 : (key1 < key2) ? -1 : 0); 
	
		map.put(1, "Apple"); 
		map.put(4, "Mango"); 
		map.put(5, "Orange"); 
		map.put(2, "Banana"); 
		map.put(3, "Grapes"); 
		System.out.println("Elements of the TreeMap " + 
							"after sorting are : " + map); 
	} 
} 
