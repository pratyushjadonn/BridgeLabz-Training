package list_interface;
import java.util.*;
public class ReverseAList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original Array list"+list);
		reverseList(list);
		System.out.println("Reversed Array list"+list);
		List<Integer> list2=new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println("Original Linked list"+list2);
		reverseList(list2);
		System.out.println("Reversed Linked list"+list2);
		
	}
	public static <T>void reverseList(List<T> list) {
		int i=0;
		int j=list.size()-1;
		while(i<j) {
			T temp=list.get(i);
			list.set(i,list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}
	
}
