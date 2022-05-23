package com.geekbrains.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {
	
// try catch finally throw throws
	
	public static void main(String[] args) {
		
		FileOutputStream out = null; // <<<< объ€вить заранее, иначе в блоке finally не будет видно
	
		try { 
			out = new FileOutputStream("File.txt");
			out.write(69);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
				out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream out2 = new FileOutputStream("File2.txt")) {
			
		} catch (IOException e) {
			
		}
		
		try {
			ReportMaker.makePDFReport("1.txt", "AssToMouthHentai");
		} catch (Exception e1) {
			//Alert alert = new Alert(Alert.AlertType.ERROR);	
			//alert.showAndWait();
			e1.printStackTrace();
			}
	
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(8189);
			System.out.println(1);
			int x = 10/0;
			System.out.println(2);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				serverSocket.close();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
		System.out.println(3);
	}
 
}
