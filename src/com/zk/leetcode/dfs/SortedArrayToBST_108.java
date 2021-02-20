package com.zk.leetcode.dfs;

import java.util.ArrayDeque;

public class SortedArrayToBST_108 {
	public static void main(String[] args) {
		int[] arr = { -11, -10, -3, 0, 5, 9 };
		TreeNode sortedArrayToBST = sortedArrayToBST(arr);
		show(sortedArrayToBST);
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public static TreeNode helper(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		// 总是选择中间位置右边的数字作为根节点
		int mid = (left + right + 1) / 2;

		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums, left, mid - 1);
		root.right = helper(nums, mid + 1, right);
		return root;
	}
	
	public static void show(TreeNode node) {
		if (node == null) {
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            // 一定要放判定之前，否则会出大事
            node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
	}
}










