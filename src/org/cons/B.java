package org.cons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class B {
	 public static void main(String[] args) {
		List<Integer> a=new LinkedList<>();
		List<Integer> a2=new LinkedList<>();
		Set<Integer> s1=new HashSet<>();
		Set<Integer> s=new LinkedHashSet<>();
//		Set<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(40);
		a.addAll(s);
//		System.out.println(a);
//		Collections.sort(a);
////		System.out.println(s);
//		System.out.println(a);
		a.add(10);
		int indexOf = a.indexOf(20);
		System.out.println(indexOf);
		System.out.println(a.size());
		System.out.println(a.lastIndexOf(10));
		boolean contains = a.contains(90);
		System.out.println(contains);
		boolean equals = a.get(0).equals(10);
		System.out.println(equals);
		a.forEach(System.out::println);
		Integer remove = a.remove(1);
		System.out.println(remove);
		a.forEach(System.out::println);
		a2.addAll(a);
		a2.add(300);
		a2.add(232);
		a2.add(111);
		System.out.println("a-----"+a);
		System.out.println("before a2----"+a2);
		boolean retainAll = a2.removeAll(a);
		System.out.println("After a2---"+a2);
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(50);
//		a.add(40);
//		a.add(50);
//		a.add(60);
//		a.add(70);
//		a.add(30);
//		a.add(20);
//		System.out.println(a);
//		System.out.println(a.size());
//	
//	 List<Integer> ds =new ArrayList<Integer>();
//	 ds.addAll(a);
//	 System.out.println(ds);
//	 ds.add(22);
//	 ds.add(222);
////	 ds.remove(3);
////	 ds.remove(2);
////	 ds.remove(6);
//	 System.out.println(ds);
//	 int indexOf = ds.indexOf(20);System.out.println(indexOf);
//	 int lastindexOf = ds.lastIndexOf(20);System.out.println(lastindexOf);
//	 Integer dss = ds.get(3);System.out.println(dss);
//	 System.out.println(ds);
////	 ds.retainAll(a);
//	 ds.removeAll(a);
//	 System.out.println("k"+ds);
////	for(int i=0;i<ds.size();i++) {
////	System.out.println(ds.get(i));
////	} 
////	System.out.println("---------enhanced loop------");
////	for(int x:a) {
////		System.out.println(x);
////	}
////	System.out.println("---------For each Method loop------");
////	ds.forEach(System.out::println);
//	 Set<Integer> se=new TreeSet<Integer>();
//	 se.add(10);
//	 se.add(10);
//	 se.addAll(a);
//	 System.out.println("set"+se);
//	 System.out.println("---------enhanced loop------");
//	 for(int xb:se) {
//		 System.out.println(xb);
//	 }
//	 
//	se.forEach(System.out::println);
//	 
//	 
//	 
//	 
	 
	 
	 }	} 