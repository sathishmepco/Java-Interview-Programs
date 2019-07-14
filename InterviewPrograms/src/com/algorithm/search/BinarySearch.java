package com.algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int key = 50;
		int index = binarySearch(array, key);
		if(index == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at "+index+" index");
	}

	public static int binarySearch(int array[], int key) {
		int leftIndex = 0, rightIndex = array.length - 1;
		while (leftIndex <= rightIndex) {
			int mid = (leftIndex + rightIndex) / 2;
			if (array[mid] == key)
				return mid;
			if (array[mid] < key)
				leftIndex = mid + 1;
			else
				rightIndex = mid - 1;
		}
		return -1;
	}

}