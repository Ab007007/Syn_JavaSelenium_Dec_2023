package com.syn.jt.access.strings;

public class StringBufferDemo 
{
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Aravinda ");
		sb.append("Kiran ");
		System.out.println(sb);
		
		
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.reverse());
		StringBuffer sb2 = new StringBuffer(StringsDemo.email);
		System.out.println(sb2.reverse());
		
	}

}
