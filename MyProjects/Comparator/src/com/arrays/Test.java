package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		
		var array1 = new IntArray(new Integer[]{1,2,3});
		var array2 = new IntArray(new Integer[]{1,2,3,5,6});
		var array3 = new IntArray(new Integer[]{0,0,0,0,0});   
		ArrayList<IntArray> manyArrays = new ArrayList<IntArray>();
		manyArrays.add(array1);
		manyArrays.add(array2);
		manyArrays.add(array3);
		Collections.sort(manyArrays);
		
		for ( IntArray m : manyArrays) {
			for (int a : m.getArray()) {
				System.out.print(a);
			}
			  System.out.println();
		}
	
			
		
}
}
