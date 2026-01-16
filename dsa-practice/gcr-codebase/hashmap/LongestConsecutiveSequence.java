package hashmap;

import java.util.*;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();

		// add all elements
		for (int num : nums) {
			set.add(num);
		}

		int longest = 0;

		// find sequences
		for (int num : set) {

			// start only if num-1 doesn't exist
			if (!set.contains(num - 1)) {
				int currentNum = num;
				int count = 1;

				// check consecutive numbers
				while (set.contains(currentNum + 1)) {
					currentNum++;
					count++;
				}

				longest = Math.max(longest, count);
			}
		}

		return longest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Longest Consecutive Sequence : ");
		System.out.println(longestConsecutive(arr)); // 4
	}
}
