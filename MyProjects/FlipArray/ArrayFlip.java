package com.Mas1;

import java.util.Scanner;

public class ArrayFlip {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		var array = new int[8];
		var array2 = new int[8];
		for (var i = 0; i < array.length; i++) {
			var n = input.nextInt();
			array[i] = n;
		}
		for (var b = 0; b < 8; b++) {
			System.out.print(array[b] + " ");
		}
		System.out.println();
		for(var c = 0; c < array.length; c++) {
			array2[c] = array[7-c];
			System.out.print(array2[c] + " ");
			
			
	}
	}
}
