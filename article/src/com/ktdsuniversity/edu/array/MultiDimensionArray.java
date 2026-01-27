package com.ktdsuniversity.edu.array;

public class MultiDimensionArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		int[][] arr2 = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int[][] arr3 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		// 보정길이 다차원 배열

		int[][] arr4 = new int[3][]; // 열은3개, 행은 모름 ==> 각각의 index값이 다를 수 있음.
		arr4[0] = new int[] { 1, 2, 3 };
		arr4[1] = new int[] { 1, 2, 3, 4, 5, 6 };
		arr4[2] = new int[] { 1 };
		// 가변길이 다차원 배열
	}
}