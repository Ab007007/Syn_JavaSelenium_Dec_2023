package com.synechron.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalDataRreader {
	
	public static String getPropertyValue(String key) 
	{
		File f = null;
		FileInputStream fis = null;
		Properties props = null;
		String value = null;
		try
		{
			f = new File("data/globaldata.properties");
			fis = new FileInputStream(f);
			props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			System.out.println("Returning " + value);
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
	
}
