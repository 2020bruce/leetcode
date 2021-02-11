package com.zk.leetcode.string;

import java.util.Stack;

public class ReverseWords_557 {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String words = reverseWords(s);
		System.out.println(words);
	}
    public static String reverseWords(String s) {
    	StringBuffer buffer = new StringBuffer();
    	Stack<Character> stack = new Stack<Character>();
    	for (int i = 0; i < s.length(); ) {
			while(i < s.length() && s.charAt(i) != ' ') {
				stack.push(s.charAt(i));
				i++;
			}
			while(!stack.isEmpty()) {
				buffer.append(stack.pop());
			}
			
			if(i < s.length() && s.charAt(i) == ' ') {
				buffer.append(s.charAt(i));
				i++;
			}
		}
    	return buffer.toString();
    }
}






