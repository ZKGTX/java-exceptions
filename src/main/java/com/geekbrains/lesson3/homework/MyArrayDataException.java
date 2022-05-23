package com.geekbrains.lesson3.homework;

public class MyArrayDataException extends Exception {
	
	
	public MyArrayDataException() {
		super();
		System.out.println("Some data can't be parsed to int");
		
		//super("Invalid data in [" + column + "; " + row + "]: " + array[row][column]);
		//this.row = row;
		//this.column = column;
		//this.value = array[column][row];
		
		
	}
	
	
}
