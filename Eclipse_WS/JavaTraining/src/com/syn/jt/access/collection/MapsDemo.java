package com.syn.jt.access.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo 
{
	public static void main(String[] args) {
		
		//Map mp = new HashMap();
		//Map mp = new LinkedHashMap();
		Map mp = new TreeMap();
		mp.put("name", "Aravinda");
		mp.put("age", 40);
		mp.put("location", "Bangalore");
		
		
	//	System.out.println(mp.get("name"));
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}
		
	}

}
