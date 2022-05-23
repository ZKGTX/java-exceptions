package com.geekbrains.lesson3.homework;

public class MyArraySizeException extends Exception {
	public MyArraySizeException () {
		super();
		System.out.println("Wrong array size, must be 4x4");
	}
}
