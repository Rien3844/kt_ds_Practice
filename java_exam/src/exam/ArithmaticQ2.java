package exam;

public class ArithmaticQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int processTime = 145;
		int minutes = processTime / 60;
		int seconds = processTime % 60;

		System.out.println(processTime + "은 총 " + minutes + "분 " + seconds + "초 입니다.");

	}

}
/*
         * 산술 연산자를 이용해 
         * processTime을 분(Minute), 초(Second)
         * 를 구한다음 minutes, seconds 변수에 할당하고
         * 출력해보세요.
*/