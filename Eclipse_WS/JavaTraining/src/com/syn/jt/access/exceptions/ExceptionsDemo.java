package com.syn.jt.access.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo 
{
	
	public static void main(String[] args) 
	{
	
			File f = new File("data\\info1.txt");
			FileInputStream fis = null;
			try
			{
				fis = new FileInputStream(f);
				System.out.println("file inputstream created successfully");
			}
			catch(FileNotFoundException fnfe)
			{
				System.out.println("File not found please check " + fnfe.getMessage());
			}
			finally {
				try 
				{
					fis.close();
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fis =null;
			}
		
	}

}
