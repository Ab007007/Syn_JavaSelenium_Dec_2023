package com.syn.jt.access.conditional;

public class LargerNumber {

	static int num1 = 50, num2 = 70, num3 = 70;
	
	public static void main(String[] args) {
//		[11:45 AM] Soumya Roy
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("num1 is gerater");
		}
		else if(num2>num3 && num2> num1)
		{
			System.out.println("num2 is gerater");
		}
		else if(num3>num1 && num3> num2)
		{
			System.out.println("num3 is gerater");
		}
		else
		{
			System.out.println("Numbers are same");
		}
	}
}
