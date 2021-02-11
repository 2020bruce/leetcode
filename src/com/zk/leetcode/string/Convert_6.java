package com.zk.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
输入：s = "PAYPALISHIRING", numRows = 4
输出："PINALSIGYAHRPI"
解释：
P     I    N
A   L S  I G
Y A   H R
P     I
 * @author Administrator
 *
 */
public class Convert_6 {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
    	long begin = System.currentTimeMillis();
		String convert = convert(s, 4);
    	long end = System.currentTimeMillis();
		System.out.println(convert);
    	System.out.println(end - begin);
		
	}
    public static String convert(String s, int numRows) {
    	if(numRows == 1) {
    		return s;
    	}
    	int n = Math.min(s.length(), numRows);
    	List<StringBuilder> list = new ArrayList<StringBuilder>(n);
    	for (int i = 0; i < n; i++) {
			list.add(new StringBuilder());
		}
    	int index = 0;
    	boolean flag = true;
    	for(int i = 0; i < s.length(); i++) {
    		list.get(index).append(s.charAt(i));
    		if(flag) {
    			index++;
    		}else {
    			index--;
			}
    		if(index == n - 1 || index == 0) {
    			flag = !flag;
    		}

    	}
    	StringBuilder sBuilder = new StringBuilder();
    	for(StringBuilder sb : list) {
    		sBuilder.append(sb);
    	}
    	return sBuilder.toString();
    }
}










