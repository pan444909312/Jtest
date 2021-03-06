package com.shenyang.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {

	public static void main(String[] args) {
		File src = new File("iotest.txt");
		File dest = new File("TextCopy.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(src));
			BufferedWriter bw = new BufferedWriter(new FileWriter(dest))
				) {
			String line = "";
			while((line=br.readLine())!=null){
				bw.write(line);
				bw.newLine();
			}
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
