package exam;

public class IfQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		if(father >= 19) {
			money -= adultOneWayFlightFare;
		}else {
			money -= kidOneWayFlightFare; 
		}//아빠 비행요금 계산
		
		if(mother >= 19) {
			money -= adultOneWayFlightFare;
		}else {
			money -= kidOneWayFlightFare; 
		}//엄마 비행요금 계산
		
		if(daughter >= 19){
			money -= adultOneWayFlightFare;
		}else {
			money -= kidOneWayFlightFare; 
		}//딸 비행요금 계산
		
		if(money > 0) {
			System.out.println("여행 가자!");
		}else {
			System.out.println("다음에 가자");
		}
		
////3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다.
//		     // 부모님의 나이는 각각 40, 36세입니다.
//		     // 딸의 나이는 11세입니다.
//		     // 성인의 비행요금은 30만원
//		     // 아동의 비행요금은 12만원입니다. 성인 판단 기준은 19세 이상입니다.
//		     // 3인 가족은 여행을 떠날 수 있을까요?
//		     // 여행을 떠날 수 있다면 "여행가자!"
//		     // 여행을 떠날 수 없다면 "다음에가자"
//		     // 를 출력해보세요.

	}

}
