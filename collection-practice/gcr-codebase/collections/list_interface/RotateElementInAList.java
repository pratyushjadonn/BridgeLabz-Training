package list_interface;
import java.util.*;
public class RotateElementInAList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int size=sc.nextInt();
		System.out.println("Enter elements of the list : ");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter number of positions by which list should be rotated");
		int k=sc.nextInt();
		System.out.println("List before rotation "+list);
		rotate(list,k);
		System.out.println("List after rotation "+list);

	}
	public static void rotate(List<Integer> list,int k) {
		List<Integer> temp=new ArrayList<>();
		for(int i=k;i<list.size();i++) {
			temp.add(list.get(i));
		}
		for(int i=0;i<k;i++) {
			temp.add(list.get(i));
		}
		for(int i=0;i<list.size();i++) {
			list.set(i,temp.get(i));
		}
	}
}
