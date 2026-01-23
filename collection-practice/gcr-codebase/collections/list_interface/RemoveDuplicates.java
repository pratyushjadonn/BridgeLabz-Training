package list_interface;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int size=sc.nextInt();
		System.out.println("Enter elements of the list : ");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		Set<Integer> set=new HashSet<>();
		List<Integer> temp=new ArrayList<>();
		for(int i=0;i<size;i++) {
			if(!set.contains(list.get(i))) {
				temp.add(list.get(i));
				set.add(list.get(i));
			}
		}
		System.out.println("List before removing duplicates : "+list);
		System.out.println("List after removing duplicates : "+temp);
	}

}
