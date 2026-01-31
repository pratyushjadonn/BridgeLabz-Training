package com.example.junit;

public class StringUtils {
	public String reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	public boolean isPalindrome(String str) {
		String str1=reverse(str);
		return str1.equals(str);
	}
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}

}