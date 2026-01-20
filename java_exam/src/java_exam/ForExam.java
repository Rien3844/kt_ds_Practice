package java_exam;

public class ForExam {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		
		for(int i = 1; i <= 100; i++) {//1
			a += i;
		}System.out.println("1부터 100까지의 합은" + a + "입니다.");
		System.out.println();
		
		for(int i = 1; i < 100; i += 2) {//2
			b += i;
		}System.out.println("1부터 100까지의 홀수의 합은" + b + "입니다.");
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {//3
			//System.out.println(i);
			if(i % 3 == 0) {
				System.out.println(i);
			}else if(i % 5 == 0) {
				System.out.println(i);
			}else if(i % 6 == 0) {
				System.out.println(i);
			}//3의 배수 5의 배수 6의 배수 모두 출력
			
//			if(i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
//				System.out.println(i);
//			}//3, 5, 6의 배수 겹치는거만	
		}
		System.out.println();
		
		for(int i = 1; i < 6; i++) {//4
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
//		1. 1 부터 100 까지의 합을 구해 출력해보세요.
//		2. 1 부터 100 중 홀수의 합을 구해 출력해보세요.
//		3. 1 부터 100 중 3, 5, 6의 배수만 출력해보세요.
//		4. 아래 결과가 나오게 반복문을 작성해보세요.
//		*
//		**
//		***
//		****
//		*****

		for(int i = 1; i < 6; i++) {
			System.out.println(i);
		}//1~5
		System.out.println();
		
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}//5~1
		System.out.println();
	}

}
