package com.practice.arrays.partA;

public class SquareMatrix_90 {

	public static void main(String[] args) {
		int N = 4;
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		rotateMatrix(mat, N);
		displayMatrix(mat, N);
	}

	private static void displayMatrix(int[][] mat, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	private static void rotateMatrix(int[][] mat, int n) {
		for (int x = 0; x < n / 2; x++) {
			for (int y = x; y < n - x - 1; y++) {
				int temp = mat[x][y];

				mat[x][y] = mat[y][n - 1 - x];
				mat[y][n - 1 - x] = mat[n - 1 - x][n - 1 - y];
				mat[n - 1 - x][n - 1 - y] = mat[n - 1 - y][x];
				mat[n - 1 - y][x] = temp;
			}
		}
	}

}
