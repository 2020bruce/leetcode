package com.zk.leetcode;

public class Test {
	public static void main(String[] args) {
		Home home = new Home();
		home.eatBeef(() -> {
			System.out.println("398260");
		});
		
	}
}


interface Person{
	public void eat();
}

class Home{
	public void eatBeef(Person p) {
		p.eat();
	}
}

