package com.zk.leetcode.array;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 * @author Administrator
 *考察知识点:数组、双指针
 */
public class SortedSquares_977 {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		for (int i = 0, j = n - 1, k = n - 1; i <= j; ) {
			if (nums[i] * nums[i] > nums[j] * nums[j]) {
				ans[k] = nums[i] * nums[i];
				k--;
				i++;
			}else {
				ans[k] = nums[j] * nums[j];
				k--;
				j--;
			}
		}
		return ans;
    }
}








