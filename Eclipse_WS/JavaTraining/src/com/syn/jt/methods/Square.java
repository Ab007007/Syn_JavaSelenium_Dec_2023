package com.syn.jt.methods;

public class Square extends Geometry
{
	double length;
	double bredth;
	
	public void area() {
		System.out.println("Area of square is l * b"  + (this.length * this.bredth));
		
	}

}
