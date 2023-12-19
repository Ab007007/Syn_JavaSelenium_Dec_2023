package com.syn.jt.access.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos =  new FileOutputStream(new File("data\\info1.txt"));
		
		String s = "written from java program";
		byte[] b = s.getBytes();
		fos.write(b);
		
		fos.close();
		System.out.println("done");
	}

}
