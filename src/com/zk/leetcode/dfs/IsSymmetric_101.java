package com.zk.leetcode.dfs;

import java.util.LinkedList;
import java.util.Queue;

/**
    1
   / \
  2   2
 / \ / \
3  4 4  3
    1
   / \
  2   2
 / \ / \
   3   3
 * @author Administrator
 *
 */
public class IsSymmetric_101 {
    public static boolean isSymmetric(TreeNode root) {

    	return giveTwo(root, root);
    }
    
    public static boolean giveTwo(TreeNode left, TreeNode right) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(left);
    	queue.offer(right);
    	while(!queue.isEmpty()) {
    		TreeNode t1 = queue.poll();
    		TreeNode t2 = queue.poll();
    		if(t1 == null && t2 == null) {
    			continue;
    		}else if(t1 == null || t2 == null) {
    			return false;
    		}

    		if(t1.val == t2.val) {
    			queue.offer(t1.left);
    			queue.offer(t2.right);
    			queue.offer(t1.right);
    			queue.offer(t2.left);
    		}
    	}
    	return true;
    }
    
    
    
    
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		boolean symmetric = isSymmetric(t1);
		System.out.println(symmetric);
	}
}











