package com.syn.jt.access.files;

import java.io.File;
import java.io.FileInputStream;

public class FileRedingDemo 
{
	
	public static void main(String[] args) throws Exception
	{
		
		File f = new File("data\\info.txt");
		FileInputStream fis = new FileInputStream(f);
		
		int i=0;
		while((i=fis.read()) != -1)
		{
			System.out.print((char)i);
		}
		//char ch = (char)fis.read();
		
		fis.close();
	}

}
