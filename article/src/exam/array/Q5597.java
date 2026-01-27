package exam.array;

import java.util.Arrays;

public class Q5597 {
//	public static void main(String[] args) {
//		int[] numArray = { 3, 1, 4, 5, 7, 9, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
//				28, 29, 30};
//
//		Arrays.sort(numArray);
//		
//		int[] miss = new int[numArray.length];
//		int missIndex = 0;
//		for (int i = 0; i < numArray.length - 1; i++) {
//			if (numArray[i] != numArray[i + 1] - 1) {
//				miss[missIndex++] = numArray[i] + i;
//			}
//		}
//		
//		System.out.println(miss[0]);
//		System.out.println(miss[1]);
//
//	}
	public static void main(String[] args) {
		int[] nums = {3, 1, 4, 5, 7, 9, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		// 정렬
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		// 과제를 내지 않은 사람 찾기
		int[] miss = new int[nums.length];
		int missIndex = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1] - 1) {
				miss[missIndex++] = nums[i] + 1;
			}
		}
		
		System.out.println(miss[0]);
		System.out.println(miss[1]);
		
	}
}

