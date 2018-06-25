import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {

		List<Integer> items = new ArrayList<>();

		// System.out.println(items.isEmpty() );
		items.add(10);
		items.add(23);
		items.add(344);
		items.add(47);
		items.add(36);

		Iterator<Integer> iter = items.iterator();

		while (iter.hasNext()) {

			if (iter.next() > 100)
				iter.remove();

			// System.out.println( iter.next() );

		}
		//
		// for (int i = 0; i < args.length; i++) {
		//
		// if(items.get(i)>100) {
		// items.remove(items.get(i));
		// }
		//
		// }
		System.out.println(items);

		// System.out.println( iter.hasNext() );
		// System.out.println( iter.next() );
		// System.out.println( iter.next() );
		//
		// iter.remove();
		// System.out.println( items );

		// System.out.println( iter.next() );
		// System.out.println( iter.next() );
		// System.out.println( iter.next() );
		//
		// System.out.println( iter.next() );

	}

}