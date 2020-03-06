 package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		IntStream.range(1, 4)
	    .forEach(System.out::println);
		
		/*Primitive streams use specialized lambda expressions,
		e.g. IntFunction instead of Function or 
		IntPredicate instead of Predicate. 
		And primitive streams support the additional terminal 
		aggregate operations sum() and average():*/
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> n)
	    .average()
	    .ifPresent(System.out::println);  
		
		int num = Arrays.stream(new int[] {1, 2, 3}).sum();
		
		OptionalDouble average = Arrays.stream(new int[] {1, 2, 3}).average();
	     
		long count = Arrays.stream(new int[] {1, 2, 3}).count();
		
				long  ndc = Arrays.stream(new int[] {2, 3,2, 3,3})
		.distinct().count();
		
		System.out.println("The distinct numbers are "+ndc);
		
		System.out.println("The first distinct value is ");  
		Arrays.stream(new int[] {2, 1, 3})
		.distinct().findFirst().ifPresent(System.out::println);
		
		Arrays.stream(new int[] {1, 1, 2})
		.distinct().findAny().ifPresent(System.out::println);
		
	     System.out.println("sum is "+num);  
	     System.out.println("The avergae is "+average);  
	     System.out.println("The count is  "+count);  
		
	}

}