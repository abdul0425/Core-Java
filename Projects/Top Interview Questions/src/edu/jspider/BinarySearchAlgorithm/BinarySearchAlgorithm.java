package edu.jspider.BinarySearchAlgorithm;

public class BinarySearchAlgorithm {

	static int binarySearchAlgorithm(int[] a, int search) {
		int start = 0, end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (search == a[mid])
				return mid;
			else if (search < a[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearchAlgorithm(a, 2));
	}
}
