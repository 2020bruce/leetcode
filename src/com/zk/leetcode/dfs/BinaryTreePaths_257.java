package com.zk.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths_257 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		List<String> strings = binaryTreePaths(root);
		System.out.println(strings);
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> strings = new ArrayList<String>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<String> pathStack = new Stack<String>();
		stack.push(root);
		pathStack.push(Integer.toString(root.val));
		while (!stack.isEmpty()) {
			TreeNode next = stack.pop();
			String path = pathStack.pop();

			if (next.right != null) {
				stack.push(next.right);
				pathStack.push(new StringBuffer(path).append("->").append(next.right.val).toString());
			}
			if (next.left != null) {
				stack.push(next.left);
				pathStack.push(new StringBuffer(path).append("->").append(next.left.val).toString());
			}else if(next.right == null){
				strings.add(path);
			}
			
		}

		return strings;
	}
}









