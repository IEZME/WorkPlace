package com.editop;

import java.util.Scanner;

public class Frame {

	public static void main(String[] args) {

		var input = new Scanner(System.in);
		System.out.println("Please, input vertikal");
		var b = input.nextInt();
		System.out.println("Please, input horizontal");
		var c = input.nextInt();
		System.out.println("Please, input your word");
		var a = input.next();
		
		char d = '*';
		var f = a.length();
		if (c < f + 2) {
			System.out.print("Error");
		} else if (b < 3) {
			System.out.print("Error");
		} else {
			for (var i = 1; i <= b; i++) {
				System.out.print(d);

				if (i == 1 || i == b) {
					for (var t = 2; t < c; t++) {
						System.out.print("*");
					}
				} else {
					if (i == b / 2 && b % 2 == 0) {

						var w = c - 2 - f;
						var p = w / 2;
						var u = w - p;
						for (var y = 0; y < p; y++) {
							System.out.print(" ");

						}
						System.out.print(a);

						for (var l = 0; l < u; l++) {
							System.out.print(" ");

						}
					} else if (i == b / 2 + 1 && b % 2 != 0) {

						var w = c - 2 - f;
						var p = w / 2;
						var u = w - p;
						for (var y = 0; y < p; y++) {
							System.out.print(" ");

						}
						System.out.print(a);

						for (var l = 0; l < u; l++) {
							System.out.print(" ");

						}
					}

					else if (b == 3) {
						var w = c - 2 - f;
						var p = w / 2;
						var u = w - p;
						for (var y = 0; y < p; y++) {
							System.out.print(" ");

						}
						System.out.print(a);

						for (var l = 0; l < u; l++) {
							System.out.print(" ");

						}
					}

					else {
						for (var t = 2; t < c; t++) {
							System.out.print(" ");

						}

					}

				}
				System.out.println(d);
			}
		}

	}

}
