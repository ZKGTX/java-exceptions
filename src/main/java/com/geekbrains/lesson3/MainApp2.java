package com.geekbrains.lesson3;

public class MainApp2 {
	public static void main(String[] args) {
		throw new MyLibException("Message"); 
		
		System.out.println(1);
		int coef;
		
		try {
			coef = sqrt(-100);
		} catch (ArithmeticException e) {
			coef = 7;
		}
		
		try {
			catch (RuntimeException e) {
				System.out.println(2);
				throw new ArithmeticException();
			}
		}
		
		
		//try {
			//throw new RuntimeException("Runtime Exception");
		//} catch (RuntimeException e) {
			//System.out.println("RE") ;
		//}
	}

	private static int sqrt(int i) {
		return 0;
	}
	
}
