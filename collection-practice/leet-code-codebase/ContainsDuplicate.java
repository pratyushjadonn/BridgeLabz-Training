package leetcode_collections;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	// Method to check if array contains duplicate elements
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				return true; // Duplicate found
			}
			set.add(num);
		}
		return false; // No duplicates
	}

	// Main method
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		int[] nums2 = { 1, 2, 3, 1 };

		System.out.println("Array 1 contains duplicate: " + containsDuplicate(nums1));
		System.out.println("Array 2 contains duplicate: " + containsDuplicate(nums2));
	}
}
