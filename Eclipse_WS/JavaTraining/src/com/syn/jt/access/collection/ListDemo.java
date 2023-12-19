package com.syn.jt.access.collection;

import java.util.List;
import java.util.Vector;

import com.syn.jt.inheritance.Employee;

public class ListDemo {
	
	public static void main(String[] args) {
		//List al = new ArrayList();
		//List al = new LinkedList();
		List al = new Vector();
		al.add(123);
		al.add("abc");
		al.add(123);
		al.add("abc");
		al.add(new Employee());
		al.add(12121.22);
		al.add(true);
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
			
		}
	}

}
