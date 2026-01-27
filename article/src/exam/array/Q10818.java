package exam.array;

import java.util.Arrays;

public class Q10818 {
	public static void main(String[] args) {
		int n = 5;
		int[] numArray = {20, 10, 35, 30, 7};
		Arrays.sort(numArray);
		System.out.println(numArray[0] + " " + numArray[n - 1]);
	}
}
//https://www.acmicpc.net/problem/10818