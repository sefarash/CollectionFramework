import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		
		//Collection<Integer> items = new ArrayList<>();
		
//		System.out.println(items.isEmpty());
		
//		items.add(1);
//		items.add(2);
//		items.add(3);
//		items.add(4);
//		items.add(5);
//		
		//List<Integer> ls1 = Arrays.asList(66,44,32,33);
		
//		items.addAll(ls1);
//		items.removeAll(ls1);
//		System.out.println(items);
//		
//		List<Integer> ls2 = Arrays.asList(1,33);
//		items.retainAll(ls2);
//		System.out.println(items);
//		items.remove(1);
//		items.remove(1);
//		
//		items.remove(new Integer(1));
		
		//System.out.println(items);
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("carrot");
	
		List<String> cars = Arrays.asList("toyota","bmw","carrot");
		//fruits.addAll(cars);
		//System.out.println(fruits);
		fruits.retainAll(cars);
		System.out.println(fruits);
		

	}

}
