package hashmap;

import java.util.*;

public class ZeroSumSubarrays {
	public static void findZeroSumSubarrays(int[] arr) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		int sum = 0;
		// Base case
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum)) {
				for (int startIndex : map.get(sum)) {
					System.out.println("Zero-sum subarray: [" + (startIndex + 1) + " , " + i + "]");
				}
			}
			map.putIfAbsent(sum, new ArrayList<>());
			map.get(sum).add(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		findZeroSumSubarrays(arr);
	}
}
