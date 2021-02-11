package com.zk.leetcode.string;

public class FirstUniqChar_387 {
	public static void main(String[] args) {
		String s = "loveleetcode";
		int i = firstUniqChar(s);
		System.out.println(i);
	}
	public static int firstUniqChar(String s) {
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(arr[i] > 0) {
				return i;
			}
		}
		return -1;
    }
}
