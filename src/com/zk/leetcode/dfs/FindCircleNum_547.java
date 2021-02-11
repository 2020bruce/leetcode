package com.zk.leetcode.dfs;

import java.util.Stack;

import org.omg.CORBA.UnionMember;

/**
 * 547. 省份数量
 * @author Administrator
 *
 */
public class FindCircleNum_547 {
	public static void main(String[] args) {
		int[][] isConnected = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
							};
		int num = findCircleNumAns(isConnected);
		System.out.println(num);
	}
	/**
	 * 深度优先遍历
	 * @param isConnected
	 * @return
	 */
	public static int findCircleNum(int[][] isConnected) {
		int n = isConnected.length;
		int nums = 0;
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] isVisited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if(!isVisited[i]) {
				stack.push(i);
				while(!stack.isEmpty()) {
					int j = stack.pop();
					isVisited[j] = true;
					for(int k = 0; k < n; k++) {
						if(!isVisited[k] && isConnected[j][k] == 1) {
							stack.push(k);
						}
					}
				}
				nums++;
			}
		}
		return nums;
    }
	/**
	 * 并查集
	 * @param isConnected
	 * @return
	 */
    public static int findCircleNumAns(int[][] isConnected) {
    	int n = isConnected.length;
        int nums = 0;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
        for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if(isConnected[i][j] == 1) {
					union(parent, i, j);
				}
			}
		}
        for (int i = 0; i < n; i++) {
			if (parent[i] == i) {
				nums++;
			}
		}
        
        
        return nums;
    }
	private static void union(int[] parent, int i, int j) {
		parent[find(parent, i)] = find(parent, j);
	}
	private static int find(int[] parent, int j) {
		if(parent[j] != j) {
			parent[j] = find(parent, parent[j]);
		}
		return parent[j];
	}

}













