package com.oldcalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		var input = new Scanner(System.in);
		String ch = input.nextLine();

		while (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/") && !ch.equals("div")
				&& !ch.equals("mod") && !ch.equals("^")) {
			System.out.println("Vvedi ewe raz");
			ch = input.nextLine();
		}
		var pChislo = input.nextInt();
		var vChislo = input.nextInt();

		switch (ch) {
		case "+": {
			System.out.println(pChislo + vChislo);
			break;
		}
		case "-": {
			System.out.println(pChislo - vChislo);
			break;
		}
		case "*": {
			System.out.println(pChislo * vChislo);
			break;
		}

		case "/": {
			if (vChislo == 0) {
				System.out.println("Na 0 nelzya delit");
			} else {
				System.out.println((float) pChislo / vChislo);
			}
			break;
		}

		case "div": {
			if (vChislo == 0) {
				System.out.println("Na 0 nelzya delit");
			} else {
				System.out.println(pChislo / vChislo);
			}
			break;
		}
		case "mod": {
			if (vChislo == 0) {
				System.out.println("Na 0 nelzya delit");
			} else {
				System.out.println(pChislo % vChislo);
			}
			break;
		}
		case "^": {
			float vozvStep = 1;
			var b = Math.abs(vChislo);
			for (var i = 0; i < b; i += 1) {
				vozvStep = vozvStep * pChislo;
			}
			if (vChislo > 0) {
				System.out.println(vozvStep);
			} else {
				vozvStep = 1 / vozvStep;
				System.out.println(vozvStep);
			}
			break;
		}

		}
	}
}
