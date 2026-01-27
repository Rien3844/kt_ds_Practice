package exam.array;

public class Q10807 {
	
	public static void main(String[] args) {
		int[] numArray = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
		int findNum = 2;
		
		int count = 0;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == findNum) {
				count++;
			}
		}
		
		int[] numArray2 = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
		int findNum2 = 5;
		
		int count2 = 0;
		for(int i = 0; i < numArray2.length; i++) {
			if(numArray2[i] == findNum2) {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
	}
}
//https://www.acmicpc.net/problem/10807