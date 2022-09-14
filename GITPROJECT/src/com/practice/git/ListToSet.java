package com.practice.git;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(2);
			list.add(4);
			list.add(6);
			list.add(8);
			
			Set<Integer> set = new HashSet<Integer>();
			for(int a :list) {
				set.add(a);
			}System.out.println(set);

		}

	}



