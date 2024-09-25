package lesson16_stream;
 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3,1,4,5,6,2,2,1,2,3,4);
		
		List<String> list = 
		stream
		.distinct()
		.sorted((a, b) -> b - a)
		.map(i -> i.toString() + i)
		.collect(Collectors.toList());
		System.out.println(list);
//		.forEach(System.out::println);
		
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println); 
		
	}
}
