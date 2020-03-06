 package app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SimpleStreamFilter {

	public static void main(String[] args) {
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);

	}
	

}