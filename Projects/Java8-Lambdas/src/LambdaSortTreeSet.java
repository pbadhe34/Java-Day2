 import java.util.*; 

public class LambdaSortTreeSet { 
	public static void main(String[] args) 
	{ 
		//TreeSet<Integer>(Comparator<? super Integer> comparator)
		
		TreeSet<Integer> h = 
					new TreeSet<Integer>((a1, a2) -> (a1 > a2) ? 
										-1 : (a1 < a2) ? 1 : 0); 
		h.add(850); 
		h.add(235); 
		h.add(1080); 
		h.add(15); 
		h.add(5); 
		System.out.println("Elements of the TreeSet after" + 
										" sorting are: " + h); 
	} 
} 
