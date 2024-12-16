package com.jit.thirdsem;

import java.util.List;

public class localvariables {
	public static void main(String[] args) {
		var name = "john";
		var age = 30;
		System.out.println("name: "+name+" age: " +age);
		var numbers = List.of(1, 2, 3, 4, 5);
		
		for (var number : numbers) {
			System.out.print(number+ " ");
		}
	}

}
