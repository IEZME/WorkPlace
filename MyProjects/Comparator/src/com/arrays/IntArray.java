package com.arrays;

public class IntArray implements Comparable<IntArray> {
	private Integer[] array;

	public void setArray(Integer[] array) {
		this.array = array;
	}

	public Integer[] getArray() {
		return array;
	}

	public IntArray() {

	}

	public IntArray(Integer[] array) {
		this.array = array;
	}

	public Integer getMaximum() {
		var getMax = array[0];
		for (var i = 0; i < array.length; i++) {
			if (getMax < array[i]) {
				getMax = array[i];
			}
		}
		return getMax;
	}

	public Integer getMinimum() {
		var getMin = array[0];
		for (var i = 0; i < array.length; i++) {
			if (getMin > array[i]) {
				getMin = array[i];
			}
		}
		return getMin;
	}

	@Override
	public int compareTo(IntArray o) {
		Integer a = this.getMaximum() - this.getMinimum();
		return a.compareTo(o.getMaximum() - o.getMinimum());
	}

}
