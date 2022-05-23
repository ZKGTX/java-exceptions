package com.geekbrains.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReportMaker {
	public static void makePDFReport (String path, String data) throws Exception {
			FileOutputStream out = new FileOutputStream("1.txt"); // <<< может возникнуть исключение
			out.write(data.getBytes());
			out.close();
		
	}
}
