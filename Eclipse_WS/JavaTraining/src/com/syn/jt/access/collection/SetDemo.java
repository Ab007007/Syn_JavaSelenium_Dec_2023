package com.syn.jt.access.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		//Set set = new HashSet();
		//Set set = new LinkedHashSet();
		Set set = new TreeSet();
		set.add(100);
		set.add(10);
		set.add(25);
		set.add(99);
		set.add(100);
		set.add(10);
		set.add(25);
		set.add(99);
		
		System.out.println("Size : " + set.size());
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
