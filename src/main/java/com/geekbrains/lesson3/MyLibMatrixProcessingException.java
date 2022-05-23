package com.geekbrains.lesson3;

public class MyLibMatrixProcessingException extends MyLibException {
	
	
	private int row;
	private int column;
	private int value;
	
	public MyLibMatrixProcessingException (int row, int column, int[][] arr) {
		super ("Invalid data in [" + column + "; " + row + "]: " + arr[row][column]);
		this.row = row;
		this.column = column;
		this.value = arr[column][row];
	}
}
