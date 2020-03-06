package app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamReuse {

	public static void main(String[] args) {
		 
		Stream<String> stream =
			    Stream.of("d2", "a2", "b1", "b3", "c")
			        .filter(s -> s.startsWith("a"));

			//stream.anyMatch(s -> true);    // ok
			stream.noneMatch(s -> true);   // exception
			
			//stream.anyMatch(s -> true);    // ok
			
			/*create a new stream chain for every terminal operation
			 to execute, e.g.  create a stream supplier to construct
			 a new stream with all intermediate operations*/
			
			Supplier<Stream<String>> streamSupplier =
				    () -> Stream.of("d2", "a2", "b1", "b3", "c")
				            .filter(s -> s.startsWith("a"));

				streamSupplier.get().anyMatch(s -> true);   // ok
				streamSupplier.get().noneMatch(s -> true);  // ok
				
				System.out.println("Stream done");
	}
}
