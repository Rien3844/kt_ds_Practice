package java_exam;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤 난수 맞추기
		int randomNumber = (int) (Math.random() * 100);
		
		System.out.println(randomNumber);
		
		//if를 안쓰고 푸는 법.
		int radix = randomNumber / 10 * 10;
		System.out.println(radix + "범위의 숫자가 나왔습니다.");
		
		//if 사용
		if(randomNumber < 10) {
			System.out.println("0범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 10 && randomNumber < 20) {
			System.out.println("10범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 20 && randomNumber < 30) {
			System.out.println("20범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 30 && randomNumber < 40) {
			System.out.println("30범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 40 && randomNumber < 50) {
			System.out.println("40범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 50 && randomNumber < 60) {
			System.out.println("50범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 60 && randomNumber < 70) {
			System.out.println("60범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 70 && randomNumber < 80) {
			System.out.println("70범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 80 && randomNumber < 90) {
			System.out.println("80범위의 숫자가 나왔습니다.");
		}else if(randomNumber >= 90 && randomNumber < 100) {
			System.out.println("90범위의 숫자가 나왔습니다.");
		}
		
		if(randomNumber >= 90) {
			System.out.println("90범위의 숫자입니다.");
		}else if(randomNumber >= 80) {
			System.out.println("80범위의 숫자입니다.");
		}else if(randomNumber >= 70) {
			System.out.println("70범위의 숫자입니다.");
		}else if(randomNumber >= 60) {
			System.out.println("60범위의 숫자입니다.");
		}//if부터 실행되므로 큰수부터 내려오면 이렇게도 작성가능.
	}

}
