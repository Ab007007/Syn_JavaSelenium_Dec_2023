package com.syn.jt.access.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader(new File("data\\info.txt"));
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
//		System.out.println(br.readLine());
	}
}
