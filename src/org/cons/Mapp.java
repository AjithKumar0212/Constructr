package org.cons;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapp {
public static void main(String[] args) {
	Map<Integer,String> a=new TreeMap<>();
	a.put(10, "java");
	a.put(20, "sql");
	a.put(30, "oops");
	a.put(40, "sql");
	a.put(50, "orcale");
	a.put(60, "Db");
	a.put(70, "Selenim");
	a.put(10, "psql");
	a.put(50, "Selenim");
	a.put(40, "Hadoop");
	System.out.println(a.keySet());
	System.out.println(a.values());
	System.out.println(a);
	Set<Entry<Integer, String>> es = a.entrySet();
	for(Entry<Integer, String> x:es) {System.out.println(x);		
	}
}
}
