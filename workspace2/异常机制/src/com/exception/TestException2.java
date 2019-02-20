package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:/JavaProject/workspace2/pleaseread.txt");
		System.out.println((char)reader.read());
		reader.close();
	}

}
