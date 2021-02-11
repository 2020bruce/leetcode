package com.zk.leetcode.dfs;

import java.util.LinkedList;
import java.util.Queue;

/**
    3
   / \
  9  20
    /  \
   15   7
 * @author Administrator
 *
 */
public class MaxDepth_104 {
    public static int maxDepth(TreeNode root) {
    	/*if(root == null) {
    		return 0;
    	}else {
    		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    	}*/
    	int ans = 0;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		TreeNode t = queue.poll();
    		if(t == null) {
    			continue;
    		}else {
    			ans += 1;
    			queue.offer(t.left);
    			queue.offer(t.right);
    		}
    	}
    	return ans;
    }
     
    
    
    public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		int i = maxDepth(t1);
		//System.out.println(i);
	}
}



















