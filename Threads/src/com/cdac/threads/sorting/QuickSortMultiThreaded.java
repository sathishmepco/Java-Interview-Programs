package com.cdac.threads.sorting;
/*
 * Author: Suraj Subramanian
 * 
 * Quick Sort implemented using Generics and Multithreading
 * 
 * */

public class QuickSortMultiThreaded<T extends Comparable<T>> implements Runnable {

	private T arr[];
	private int start;
	private int end;

	// Driver
	public static void main(String[] args) {
		Integer[] data = { 5, 10, 4, 1, 2, 88, 11, 23, 13 };
		new QuickSortMultiThreaded<Integer>().quickSort(data);

		for (Integer integer : data) {
			System.out.println(integer);
		}
	}

	private int partition(T arr[], int start, int end) {
		// set pivot as last element
		T pivot = arr[end];
		int index = start - 1;

		for (int i = start; i <= end - 1; i++) {
			if (arr[i].compareTo(pivot) < 0) {
				index++;
				T temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}

		T temp = arr[index + 1];
		arr[index + 1] = arr[end];
		arr[end] = temp;

		return index + 1;
	}

	private void quickSort(T arr[]) {
		Thread t = new Thread(new QuickSortMultiThreaded<T>(arr, 0, arr.length - 1));
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public QuickSortMultiThreaded(T arr[], int start, int end) {
		super();
		this.arr = arr;
		this.start = start;
		this.end = end;
	}

	public QuickSortMultiThreaded() {
		super();
	}

	@Override
	public void run() {
		if (start < end) {
			// partition the array
			int partition = partition(arr, start, end);

			Thread t1 = new Thread(new QuickSortMultiThreaded<T>(arr, start, partition - 1));
			Thread t2 = new Thread(new QuickSortMultiThreaded<T>(arr, partition + 1, end));

			t1.start();
			t2.start();

			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}