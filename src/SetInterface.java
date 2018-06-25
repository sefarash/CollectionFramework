import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer> numSets = new HashSet<>();
		//HashSet<Integer> numSets2 = new HashSet<>();
		numSets.add(123);
		numSets.add(121);
		numSets.add(12);
		numSets.add(123);
		numSets.add(123);
		
		for (Integer each : numSets) {
//			System.out.println(each);
		}
		Iterator<Integer> setIter = numSets.iterator();
		
		while(setIter.hasNext()) {
			if(setIter.next()>100) {
				setIter.remove();
				System.out.println(numSets);
			}
		}
		
		

	}

}
