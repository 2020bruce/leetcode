package com.zk.leetcode.array;
/**
 * 628. 三个数的最大乘积
 * @author Administrator
 *标签:数组、数学
 */
public class MaximumProduct_628 {
	public static void main(String[] args) {
		int[] nums = {-100, 0, 1, 9, 16};
		System.out.println(maximumProduct(nums));
	}
	
	public static int maximumProduct(int[] nums) {
		int n = nums.length;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		
		for (int i : nums) {
			if(i < min1) {
				min2 = min1;
				min1 = i;
			}else if(i < min2) {
				min2 = i;
			}
			if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(i > max2) {
            	max3 = max2;
            	max2 = i;
            }else if(i > max3){
				max3 = i;
			}

		}

		
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
	public static int maximumProductAns(int[] nums) {
        // 最小的和第二小的
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        // 最大的、第二大的和第三大的
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }

            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
