package app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class ObjectStream {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Manava", 18), new Person("Paresh", 20),
				new Person("Pamela", 25), new Person("Jaba", 15));
		// transform the elements of the stream into a
		// different kind of result, e.g. a List, Set or Map.

		List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());

		System.out.println(filtered);

		// construct a list from the elements of a stream

		Map<Object, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

		// Use reduce to find max age person
		persons.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2).ifPresent(System.out::println);

		// Person with min age
		persons.stream().reduce((p1, p2) -> p1.age < p2.age ? p1 : p2).ifPresent(System.out::println);

		// construct a new Person with the aggregated names and ages
		// from all other persons in the stream:

		Person result = persons.stream().reduce(new Person("", 0), (p1, p2) -> {
			p1.age += p2.age;
			p1.name += p2.name;
			return p1;
		});

		System.out.format("name=%s; age=%s", result.name, result.age);
// get   the sum of ages from all persons:	
		Integer ageSum = persons.stream().reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

		System.out.println("\nSum of ages " + ageSum);

// Detailsed output
		/*The accumulator function does all the work.
		It first get called with the initial identity value 0 
		and the first person Max. 
		In the next three steps sum continually increases 
		by the age of the last steps person up to a total age 
		*/
		Integer ageSum2 = persons.stream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			return sum += p.age;
		}, (sum1, sum2) -> {
			System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			return sum1 + sum2;
		});
		
		//Run in parellel mode
		
		System.out.println("Start parallel steram");
		Integer sumParallel = persons
			    .parallelStream()
			    .reduce(0,
			        (sum, p) -> {
			            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			            return sum += p.age;
			        },
			        (sum1, sum2) -> {
			            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			            return sum1 + sum2;
			        });
	}
}
