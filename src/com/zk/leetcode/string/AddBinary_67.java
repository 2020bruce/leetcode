package com.zk.leetcode.string;

public class AddBinary_67 {
	public static void main(String[] args) {
		String a = "1001";
		String b = "111";
		String addBinary = addBinary(a, b);
		System.out.println(addBinary);
	}
	public static String addBinary(String a, String b) {
		StringBuffer ans = new StringBuffer();
		int n = Math.max(a.length(), b.length());
		int c = 0;
		for (int i = 0; i < n; i++) {
			if(i < a.length()) {
				c = c + (a.charAt(a.length() - 1 - i) - '0'); 
			}
			if(i < b.length()) {
				c = c + (b.charAt(b.length() - 1 - i) - '0'); 
			}
			ans.append(c % 2);
			c /= 2;
		}
		if(c > 0) {
			ans.append("1");
		}
		ans.reverse();
		return ans.toString(); 
    }
}











