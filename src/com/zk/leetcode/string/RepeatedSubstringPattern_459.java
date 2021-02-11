package com.zk.leetcode.string;
/**
 * 459. 重复的子字符串
 * @author Administrator
 *
 */
public class RepeatedSubstringPattern_459 {
	public static void main(String[] args) {
		String s = "abab";
		boolean repeatedSubstringPattern = repeatedSubstringPatternAns(s);
		System.out.println(repeatedSubstringPattern);
	}
	public static boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i * 2 <= n; i++) {
			if(n % i == 0) {
				boolean match = true;
				for (int j = i; j < n; j++) {
					if(s.charAt(j) != s.charAt(j - i)) {
						match = false;
						break;
					}
				}
				if(match) {
					return true;
				}
			}
		}
		return false;
    }
	public static boolean repeatedSubstringPatternAns(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}












