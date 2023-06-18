package edu.jspider.Resources;

public class SpiralNumber {
	public static int[][] spiral(int size) {
		int[][] a = new int[size][size];
		int row = 0;
		int col = -1;
		char m = 'r';
		for (int i = 1; i <= size * size; i++) {
			switch (m) {
			case 'r':
				a[row][++col] = i;
				if (col == size - 1 || a[row][col + 1] != 0)
					m = 'd';
				break;
			case 'd':
				a[++row][col] = i;
				if (row == size - 1 || a[row + 1][col] != 0)
					m = 'l';
				break;
			case 'l':
				a[row][--col] = i;
				if (col == 0 || a[row][col - 1] != 0)
					m = 'u';
				break;
			case 'u':
				a[--row][col] = i;
				if (a[row - 1][col] != 0)
					m = 'r';
				break;
			}
		}
		return a;
	}
}
