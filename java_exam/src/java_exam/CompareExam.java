package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		
		// age가 10대인지 확인.
		boolean isTen = age >= 10 && age < 20;
		System.out.println(isTen);
		
		// age가 20대인지 확인.
		boolean isTwin = age >= 20 && age < 30;
		System.out.println(isTwin);
		
		//가게에 방문한 고객의 나이.
		int customerAge = 15;
		//고객의 지갑에 들어있는 돈.
		int customerWallet = 3000;
		
		boolean isBuy = customerAge >= 19 && customerWallet >= 1500;
		System.out.println(isBuy);
		
		customerAge = 23;
		customerWallet = 1300;
		
//		isBuy = customerAge >= 19 && (customerWallet >= 2000 || customerAge % 3 == 0);
		// 빠른 연산 지원 불가능.
		boolean isAdult = customerAge >= 19;
		isBuy = customerWallet >= 2000 || customerAge % 3 == 0;

		System.out.println(isAdult && isBuy);
		
		// 빠른 연산 지원 가능.
		boolean canBuy = customerAge >= 19;
//		canBuy = canBuy && (customerWallet >= 2000 || customerAge % 3 == 0); <<이 코드를 아래 코드로 줄일 수 잇음.
		canBuy &= (customerWallet >= 2000 || customerAge % 3 == 0);
		
		System.out.println(canBuy);
		
		
	}

}
