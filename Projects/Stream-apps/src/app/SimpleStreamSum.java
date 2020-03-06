package app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15);

		System.out.println("Iterator Sum=" + sumIterator(list));

		System.out.println("Stream API Sum=" + sumStream(list));
		
		//Create a stream
		System.out.println("Create a stream");
		
		/*nothing is printed to the console.
		Since the intermediate operations will only be executed 
		when a terminal operation is present.*/
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    });
		
		//print it
		Stream.of("d1", "a2", "b1", "b4", "c1")
	    .filter(s -> {
	        System.out.println("filter by : " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		//matched values
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map by : " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	}

	//sum of numbers greater than 10
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();

		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}

		}
		return sum;
	}
	//sum of numbers greater than 10
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

}
