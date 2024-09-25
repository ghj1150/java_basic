package lesson13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class Final {
	public static void main(String[] args) {
		// Arrays, Collections objects
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		System.out.println(list.get(2));
		list.add(10);
		System.out.println(list);
		
		Integer[] arr = {1,2,3,4,5,6,7};
		list = Arrays.asList(arr);
		
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
