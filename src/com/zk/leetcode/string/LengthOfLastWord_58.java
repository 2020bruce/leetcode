package com.zk.leetcode.string;

public class LengthOfLastWord_58 {
	public static void main(String[] args) {
		String string = "hello world";
		int lengthOfLastWord = lengthOfLastWord(string);
		System.out.println(lengthOfLastWord);
		
	}
	public static int lengthOfLastWord(String s) {
		int ans = 0;
		int end = s.length() - 1;
		while(end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		while(end >= 0 && s.charAt(end) != ' ') {
			ans++;
			end--;
		}
		
		return ans;
    }
}
