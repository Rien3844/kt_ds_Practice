package exam.array;

public class Q2562 {
	public static void main(String[]args) {
		int[] numArray = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = numArray[0];
		int n = 0;
		for(int i = 1; i < numArray.length; i++) {
			if(max < numArray[i]) {
				max = numArray[i];
				n = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		
	}
}
//https://www.acmicpc.net/problem/2562