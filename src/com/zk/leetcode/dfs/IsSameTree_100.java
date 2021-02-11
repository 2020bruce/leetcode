package com.zk.leetcode.dfs;

public class IsSameTree_100 {
	public static void main(String[] args) {
		TreeNode100 t1 = new TreeNode100(1);
		TreeNode100 t2 = new TreeNode100(2);
		TreeNode100 t3 = new TreeNode100(3);
		TreeNode100 tn1 = new TreeNode100(1);
		TreeNode100 tn2 = new TreeNode100(2);
		TreeNode100 tn3 = new TreeNode100(3);
		t1.left = t2;
		t1.right = t3;
		tn1.left = tn2;
		tn1.right = tn3;
		boolean sameTree = isSameTree(t1, tn1);
		System.out.println(sameTree);
		
	}
    public static boolean isSameTree(TreeNode100 p, TreeNode100 q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}

class TreeNode100 {
    int val;
    TreeNode100 left;
    TreeNode100 right;
    TreeNode100() {}
    TreeNode100(int val) { this.val = val; }
    TreeNode100(int val, TreeNode100 left, TreeNode100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}











