package com.zk.leetcode.string;
/**
1.     1
2.     11
3.     21
4.     1211
5.     111221
 * @author Administrator
 *
 */
public class CountAndSay_38 {
	public static void main(String[] args) {
		String countAndSay = countAndSay(6);
		System.out.println(countAndSay);
	}
	public static String countAndSay(int n) {
		if(n == 1) {
			return "1";
		}
		StringBuilder ans = new StringBuilder();
		String s = countAndSay(n - 1);
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if(i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}else {
				ans.append(count).append(s.charAt(i));
				count = 1;
			}
		}
		
		return ans.toString();
    }
}


















