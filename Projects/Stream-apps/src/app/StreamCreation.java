 package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		// method stream() on a list of objects returns a regular object stream
		
		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println); 
		
		// No need to create collections in order to work with streams
		
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
		
	}

}