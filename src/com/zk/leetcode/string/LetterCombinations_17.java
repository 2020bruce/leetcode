package com.zk.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations_17 {
	public static void main(String[] args) {
		List<String> letterCombinations = letterCombinations("23");
		System.out.println(letterCombinations);
	}
    public static List<String> letterCombinations(String digits) {
    	List<String> list = new ArrayList<String>();
    	if(digits == "") {
    		return list;
    	}
    	Map<Character, String> map = new HashMap<Character, String>();
    	map.put('2', "abc");
    	map.put('3', "def");
    	map.put('4', "ghi");
    	map.put('5', "jkl");
    	map.put('6', "mno");
    	map.put('7', "pqrs");
    	map.put('8', "tuv");
    	map.put('9', "wxyz");
    	backtrack(list, map, digits, 0, new StringBuffer());
    	return list;
    }
	private static void backtrack(List<String> list, Map<Character, String> map, String digits, int i, 
			StringBuffer stringBuffer) {
		if(i == digits.length()) {
			list.add(stringBuffer.toString());
			return;
		}
		char c = digits.charAt(i);
		String string = map.get(c);
		for(int j = 0; j < string.length(); j++) {
			stringBuffer.append(string.charAt(j));
			backtrack(list, map, digits, i + 1, stringBuffer);
			stringBuffer.deleteCharAt(i);
		}
		
	}

}













