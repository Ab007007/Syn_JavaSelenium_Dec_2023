package com.syn.jt.access.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrowsDemo 
{
	
	public static void readMyFile() throws FileNotFoundException
	{
		File f = new File("data\\info.txt");
		FileInputStream fis = null;
		fis = new FileInputStream(f);
	}

	public static void myTest() throws Exception
	{
		throw new Exception();
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		try
		{
			readMyFile();
			myTest();
		}
		catch(FileNotFoundException fise)
		{
			System.out.println("File not found please check \n" + fise.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("User thrown exception " + ex.getMessage());
		}
		System.out.println("Main Ended");
	}
}
