 package app;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeTestWithStream {

	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		
		System.out.println(isPrimeByStream(3));
		System.out.println(isPrimeByCompareWithStream(4));
		

	}

	//Traditional approach
	private static boolean isPrime(int number) {
		System.out.println("Inside isPrime()");
		if(number < 2) return false;
		for(int i=2; i<number; i++){
			if(number % i == 0) return false;
		}
		return true;
	}
	
	//Declarative approach using lambdas, stream and predicate
	private static boolean isPrimeByStream(int number) {
		System.out.println("Inside isPrimeByLammada and Predicate()");
		IntPredicate isDivisible = index -> number % index == 0;
		
		return number > 1
				&& IntStream.range(2, number - 1).noneMatch(isDivisible);
	}
	
	//Declarative approach
	private static boolean isPrimeByCompareWithStream(int number) {
		System.out.println("Inside isPrimeByCompare()");
		return number > 1
				&& IntStream.range(2, number - 1).noneMatch(
						index -> number % index == 0);
	}
	
	

}