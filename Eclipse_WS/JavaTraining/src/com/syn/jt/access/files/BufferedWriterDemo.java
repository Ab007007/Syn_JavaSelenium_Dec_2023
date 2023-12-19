package com.syn.jt.access.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("data\\info2.txt"));
		int num = 5;
		BufferedWriter br = new BufferedWriter(fw);
		for (int i = 1; i <= 10; i++) 
		{
			br.write(num + " * " + i + " = " + (num * i));
			br.newLine();
		}
				
		br.close();
	}
}
