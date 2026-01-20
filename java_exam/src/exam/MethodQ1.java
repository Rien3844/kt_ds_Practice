package exam;

import java.util.Arrays;

public class MethodQ1 {
	//1. 1 부터 파라미터로 전달된 숫자까지의 합을 구한다.
	public static void printSum(int number1) {
		int a = 0;
		for(int i = 1; i <= number1; i++) {
			a += i; 
		}
		System.out.println(a);
	}
	
	//2. 4 부터 파라미터로 전달된 숫자 중 소수만 출력한다.
	public static void printPrime(int number1) {
		for(int i = 4; i <= number1; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
	
	//3. 파라미터로 전달된 숫자 두 개 중 가장 큰 수 하나만 출력한다.
	public static void printMax(int number1, int number2) {
		if(number1 > number2) {
			System.out.println(number1);
		}else if(number2 > number1) {
			System.out.println(number2);
		}
	}
	
	//4. 파라미터로 전달된 나이가 성인인지 미성년인지 구분하여 출력한다.
	public static void printAge(int number1) {
		if(number1 >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
	}
	
	//5. 랜덤한 숫자를 생성하고 아래 규칙에 따른 결과를 반환한다. 
	public static String getFizzBuzz(int number1) {
		String a = null;
		if(number1 % 3 == 0 && number1 % 5 == 0) {
			a = "FizzBuzz";
		}else if(number1 % 3 == 0) {
			a = "Fizz";
		}else if(number1 % 5 == 0) {
			a = "Buzz";
		}else {
			a = Integer.toString(number1);
		}
		return a;
	}
	
	//6. 서로 다른 숫자 7개를 배열에 할당하여 반환한다.
	//- 단, 배열에 할당된 숫자는 중복되지 않아야 한다.
	public static String getUniqueNumbers() {
		int[] lottoNums = new int[7];
		
		int count = 0; // 배열에 채워진 숫자의 개수.
		boolean existsNumber = false; // 새롭게 만든 숫자가 배열내에 존재하는지 여부.
		int randomNumber = 0; // 새롭게 만들 숫자 1 ~ 45중 하나.
		
		while (count < 7) { // 배열에 숫자가 7개가 채워질 때까지 반복.
			randomNumber = (int) (Math.random() * 45 + 1);
			existsNumber = false;
			
			// 새롭게 만든 숫자가 배열에 존재하는지 확인.
			for (int i = 0; i < count; i++) {
				if (lottoNums[i] == randomNumber) {
					existsNumber = true;
					break;
				}
			}
			
			// 새롭게 만든 숫자가 배열에 없다면, 배열에 추가한다.
			if (!existsNumber) { 
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 		lottoNums[count] = randomNumber;
				count++; // 배열에 채운 숫자 하나 증가.
			}
		}
		return Arrays.toString(lottoNums);
		
	}
	
	//7. 정수 파라미터 두 개를 전달받아 곱한 결과가 짝수인지 홀수인지 반환한다.
	public static String getEvenOdd(int number1, int number2) {
		String a = null;
		if(number1 * number2 % 2 == 0) {
			a = "짝수";
		}else {
			a = "홀수";
		}
		return a;
	}
	
	//8. 전달된 정수 파라미터 5개의 합을 구해 반환한다.
	public static int getSumOfFive(int number1, int number2, int number3, int number4, int number5) {
		int a = number1 + number2 + number3 + number4 + number5;
		return a;
	}
	
	//9. 합과 점수의 개수를 전달하여 평균을 구해 반환한다. (소수점 둘째 자리까지)
	public static double getAverage(double number1, double number2) {
		double a = number1 / number2;
		
		a = Math.round(a * 100) / 100.0;
		
		return a;
	}
	
	//10. 평균 점수를 파라미터로 전달하여 학점을 반환한다.
	public static String getGrade(int number1) {
		String a = null;
		if(number1 > 90 && number1 <= 100) {
			a = "A";
		}else if(number1 > 80 && number1 <= 90) {
			a = "B";
		}else if(number1 > 70 && number1 <= 80) {
			a = "C";
		}else if(number1 > 60 && number1 <= 70) {
			a = "D";
		}else {
			a = "F";
		}
		return a;
	}
	
	//11. char 타입의 파라미터 하나를 받아 그 다음의 글자를 문자열로 반환한다.
	public static String nextChar(char ch) {
		String a = null;
		a = Character.toString(ch + 1);
		return a;
	}
	
	//12. char 타입의 파라미터 두 개를 받아 문자 사이에 있는 모든 글자를 문자열로 반환한다.
	public static String getCharacters(char ch1, char ch2) {
		String a = Character.toString(ch1);
		for(int i = ch1; i < ch2; i++) {
			a += Character.toString(i + 1);
		}
		return a;
	}
	
	//13. 영소문자는 26개로 구성됨. 'a'에 25를 더하면 'z'. char와 int 파라미터를 전달했을 때 예상되는 문자를 반환.
	public static String getLowerCaseAlpha(char ch1, int number1) {
		String a = null;
		if(number1 > 25 || number1 < 0) {
			a = Character.toString(' ');
		}else {
			a = Character.toString(ch1 + number1);
		}
		return a;
	}
	
	//14. 영 소문자 글자 하나를 파라미터로 전달하면 대문자로 변환하여 반환.
	public static String convertUpperCase(char ch) {
		String a = null;
		if(ch >= 'a' && ch <= 'z') {
			a = Character.toString(ch - 32);
		}else {
			a = Character.toString(' ');
		}
		return a;
	}
	
	public static void main(String[] args) {
		printSum(10);
		System.out.println("---");
		
		printPrime(20);
		System.out.println("---");
		
		printMax(10, 20);
		System.out.println("---");
		
		printAge(20);
		printAge(15);
		System.out.println("---");
		
		System.out.println(getFizzBuzz(9));
		System.out.println(getFizzBuzz(10));
		System.out.println(getFizzBuzz(15));
		System.out.println(getFizzBuzz(7));
		System.out.println("---");
		
		System.out.println(getUniqueNumbers());
		System.out.println("---");
		
		System.out.println(getEvenOdd(4, 5));
		System.out.println(getEvenOdd(3, 5));
		System.out.println("---");

		System.out.println(getSumOfFive(1, 2, 3, 4, 5));
		System.out.println("---");
		
		System.out.println(getAverage(130, 3));
		System.out.println("---");
		
		System.out.println(getGrade(95));
		System.out.println(getGrade(85));
		System.out.println(getGrade(75));
		System.out.println(getGrade(65));
		System.out.println(getGrade(55));
		System.out.println("---");
		
		System.out.println(nextChar('a'));
		System.out.println(nextChar('c'));
		System.out.println("---");
		
		System.out.println(getCharacters('a', 'z'));
		System.out.println(getCharacters('A', 'Z'));
		System.out.println(getCharacters('가', '나'));
		System.out.println("---");
		
		System.out.println(getLowerCaseAlpha('a', 25));
		System.out.println(getLowerCaseAlpha('a', 1));
		System.out.println(getLowerCaseAlpha('a', 0));
		System.out.println(getLowerCaseAlpha('a', -1));
		System.out.println(getLowerCaseAlpha('a', 26));
		System.out.println("---");

		System.out.println(convertUpperCase('a'));
		System.out.println(convertUpperCase('c'));
		System.out.println(convertUpperCase('1'));
		System.out.println(convertUpperCase('A'));
		System.out.println(convertUpperCase('^'));
		System.out.println("---");
	}
}