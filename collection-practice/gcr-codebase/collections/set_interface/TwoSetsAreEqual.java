package set_interface;
import java.util.*;
public class TwoSetsAreEqual {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set2.add(2);
		set2.add(1);
		set2.add(4);
		if(set1.equals(set2)) {
			System.out.println("These two sets are equal");
		}
		else {
			System.out.println("These two sets are not equal");
		}
	}

}
