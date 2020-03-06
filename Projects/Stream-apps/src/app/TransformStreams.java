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

public class TransformStreams {

	public static void main(String[] args) {
		
		//Stream.of("a1", "a2", "a4").forEach(System.out::println);
		
		Stream.of("a1", "a2", "a4").map(s->s.substring(0)).forEach(System.out::println);
		
		//Convert to IntStream
		Stream.of("a1", "a2", "a4")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println); 
		
		 
		
	}

}