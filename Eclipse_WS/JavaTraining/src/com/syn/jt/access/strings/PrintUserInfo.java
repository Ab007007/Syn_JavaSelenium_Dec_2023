package com.syn.jt.access.strings;

public class PrintUserInfo {

	public static void main(String[] args) {
		
		String userDetails = "Name=Aravind;Age=39;Location=Bangalore;Phone=4564564564";
		
		String[] details = userDetails.split(";");
	
		
		//Name=Aravind
		for (String info : details) 
		{
			System.out.println(info.substring(info.indexOf("=")+1, info.length()));
		}
				
	}
}
