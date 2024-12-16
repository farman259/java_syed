package com.jit.thirdsem;

public class p5 extends p4 {
	int b=20;
	static int y=200;
	public static void test2() {
		System.out.println("from static of p5");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		p5 ob = new p5();
		ob.test1();
		System.out.println(ob.a);
		ob.test2();
		System.out.println(ob.b);
		System.out.println(ob.x);
		System.out.println(ob.y);
	}

}
