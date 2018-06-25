import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		
		SortedSet<String> sSet2 = new TreeSet<>();

		sSet2.add("abc");
		sSet2.add("abcd");
		sSet2.add("bc");
		sSet2.add("bbc");
		sSet2.add("bbc");
		sSet2.add("bb");
		sSet2.add("dbc");
		sSet2.add("ebc");
		sSet2.add("fbc");
		sSet2.add("mkld");
		sSet2.add("zqwr");
		sSet2.add("lima");

		System.out.println(sSet2);

		System.out.println(sSet2.tailSet("c"));
		System.out.println(sSet2.headSet("c"));
		System.out.println(sSet2.subSet(("c"), "y"));
		System.out.println(sSet2.headSet("k"));
		System.out.println(sSet2.tailSet("l"));


	}

}
