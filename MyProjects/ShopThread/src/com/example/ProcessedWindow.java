package com.example;

import java.util.Vector;

public class ProcessedWindow implements Runnable {

	private Vector<Integer> noProcessed;
	private Vector<Integer> yesProcessed;

	public ProcessedWindow(Vector<Integer> noProcessed, Vector<Integer> yesProcessed) {
		this.noProcessed = noProcessed;
		this.yesProcessed = yesProcessed;
	}

	@Override
	public void run() {
		while (processedWindow());
	}

	public boolean processedWindow() {
		Integer people;
		synchronized (ProcessedWindow.class) {
			if (noProcessed.isEmpty())
				return false;
			else {
				people = noProcessed.remove(0);
			}
		}
		yesProcessed.add(people);
		return true;
	}
}
