package com.geekbrains.lesson3.homework;

public class MainApp {

	public static void main(String[] args) {
		String[][] myArray = {
				{"1", "2", "3", "4"},
				{"5", "6", "7", "8"},
				{"9", "10", "11", "12"},
				{"13", "14", "15", "16"}
		};
		
		try {
			System.out.println(arraySum(myArray));
		} catch (MyArraySizeException e) {
			
		}
		catch (MyArrayDataException e1) {
			
		}
	
	}
	
	public static int arraySum (String[][] array) throws MyArraySizeException, MyArrayDataException {
		if (array.length != 4) {
			throw new MyArraySizeException();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i].length !=4) {
				throw new MyArraySizeException();
			}
		}
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				try {
					result += Integer.parseInt(array[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException();
				}
			}
		}
		return result;
	}
}
