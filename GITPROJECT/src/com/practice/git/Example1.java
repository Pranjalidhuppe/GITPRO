package com.practice.git;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
	   List<Integer> l = Arrays.asList(1,2,3,4);
		Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	

}
