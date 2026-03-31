package list_interface;
import java.util.*;
public class FindNthElementFromEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int size = sc.nextInt();
		System.out.println("Enter elements of the list : ");
		for (int i = 0; i < size; i++) {
			list.add(sc.next().charAt(0));
		}
		System.out.println("Enter the value of n");
		int N = sc.nextInt();
		findNthFromEnd(list, N);
	}

	public static void findNthFromEnd(List<Character> list, int N) {
		Iterator<Character> fast = list.iterator();
		Iterator<Character> slow = list.iterator();
		//move fast pointer N steps ahead
		for (int i = 0; i < N; i++) {
			if (fast.hasNext())
				fast.next();
			else {
				System.out.println("N is greater than list size");
				return;
			}
		}
		//move both pointers together
		while (fast.hasNext()) {
			fast.next();
			slow.next();
		}

		//slow points to Nth element from end
		System.out.println("Nth element from end: " + slow.next());
	}
}
