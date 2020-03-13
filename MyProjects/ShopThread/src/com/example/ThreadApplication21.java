package com.example;

import java.util.ArrayList;
import java.util.Vector;

public class ThreadApplication21 {

	public static void main(String[] args) throws InterruptedException {

		var noProcessed = new Vector<Integer>();
		var yesProcessed = new Vector<Integer>();

		for (int i = 1; i <= 2000; i++) {
			noProcessed.add(i);
		}

		var thread1 = new ArrayList<Thread>();
		for (int i = 0; i < 4; i++)
			thread1.add(new Thread(new ProcessedWindow(noProcessed, yesProcessed)));

		for (var turn : thread1)
			turn.start();

		for (var turn1 : thread1)
			turn1.join();

		System.out.println(noProcessed.size());
		System.out.println(yesProcessed);
		System.out.println(yesProcessed.size());

	}

}
