package hashmap;

import java.util.*;

public class PairExistOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		// hashmap
		Map<Integer, Integer> map = new HashMap<>();
		// traversing on the array
		for (int i = 0; i < n; i++) {
			if (map.containsKey(target - arr[i])) {
				// pair found
				System.out.println("Pair Exist");
				return;
			}
			// add value to the map
			map.put(arr[i], i);
		}
		// pair does not exist
		System.out.println("Pair does not exist");
	}

}
