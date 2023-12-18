package iterator;


import java.util.Iterator;

import java.util.SortedSet;
import java.util.TreeSet;

public class set1 {
	public static <T> void main(String[] args) {
		
	
	        SortedSet<Ogrenci>sortedSet=new TreeSet<>();
	        sortedSet.add(new Ogrenci(25,"A"));
	        sortedSet.add(new Ogrenci(25, "b"));
	        
	        
	        Iterator<Ogrenci>iterator=sortedSet.iterator();
	        
	        
	        while (iterator.hasNext()) {
				Ogrenci next=iterator.next();
				
			System.out.println(next);				
			}
	
}}