package exam;

public class Q9498 {

	public static void main(String[] args) {
		int examScore = 100;
		if(examScore <= 100 && examScore >= 90) {
			System.out.println("A");
		}else if(examScore <= 89 && examScore >= 80) {
			System.out.println("B");
		}else if(examScore <= 79 && examScore >= 70) {
			System.out.println("C");
		}else if(examScore <= 69 && examScore >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
//https://www.acmicpc.net/problem/9498