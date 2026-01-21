package oop;

/**
 * <pre>
 * ex) 김밥천국
 * 김밥류
 * 식사류
 * 분식류
 * 튀김류
 * 찌개류
 * 죽  류...
 * 각 메뉴별 태그가 있고 가격이 있다. ==> 김밥류 - 기본김밥 - 2000원
 * 키오스크에서 메뉴 선택 => 결제 => 대기번호 받기
 * </pre>
 */
public class Kiosk {
	boolean isPaymentStartButton;
	boolean payingByCard;
	boolean successByPayment;
	boolean equalPay;
	int waitingNumber;
	boolean receiptButton;
	// 메뉴 종류 - Menu_Type(김밥류 식사류 분식류 튀김류 찌개류 죽  류...)
	// 종류별 메뉴(김밥류 - 기본김밥 참치김밥 돈까스김밥 오이김밥)
	
	// 메뉴 품절 여부
	// 메뉴 선택 여부 is_Pick
	// 선택이 되었다면 선택한 메뉴의 가격 합.
	// 결제 하기 버튼 -> 현금 or 카드
	// 결제 완료 - 카드를 가져가세요, 영수증을 출력하겠습니까? 대기번호 출력
	// 결제 실패 - 
	
	//결제 행위
	public void payment() {
		if(isPaymentStartButton) {//결제하기 버튼
			System.out.println("결제를 시작합니다. 현금 / 카드를 선택해주세요.");
			if(payingByCard) {// 카드 결제
				System.out.println("카드로 결제합니다. 카드를 넣어주세요.");
				if(successByPayment) {// 결제 성공
					System.out.println("결제에 성공했습니다.");
					// 영수증 출력(yes or no)
					// 대기번호 출력
				}else {// 결제 실패
					System.out.println("결제에 실패했습니다. 카드를 IC로 결제해주세요.");
					//재 결제
				}
			}else {//현금 결제
				System.out.println("현금으로 결제합니다. 현금을 넣어주세요.");
				// 받은 현금 계산
				if(cashPayment() == 0) {// 계산할 금액 = 받은 현금 ==> 거스름돈 없음
					paymentTermination();
				}else {
					//거스름돈 => 결제종료
				}
			}
		}
	}
	
	//카드 결제
	public void creditCardPayment() {
		
	}
	
	//현금 결제(int 받은돈)
	public int cashPayment() {
		int changeMoney = receivedMoney("오만원") - paymentAmount(pickmenu[]);//웨 안댐?????
		return changeMoney;
	}

	//음식의 총합 가격
	public int paymentAmount(int[] menuPrice) {
		int paymentAmount = 0;
		for(int i = 0; i < menuPrice.length; i++) {
			paymentAmount += menuPrice[i];
		}
		return paymentAmount;
	}
	
	//받은 돈
	public int receivedMoney(String depositMoney) {
		int receivedMoney = 0;
		if(depositMoney == "오만원") {
			receivedMoney += 50000;
		}else if(depositMoney == "만원") {
			receivedMoney += 10000;
		}else if(depositMoney == "천원") {
			receivedMoney += 1000;
		}else if(depositMoney == "오백원") {
			receivedMoney += 500;
		}else if(depositMoney == "백원") {
			receivedMoney += 100;
		}
		return receivedMoney;
	}
	
	//결제 종료 ==> 영수증 출력, 대기번호 출력
	public void paymentTermination() {
		System.out.println("영수증을 출력하시겠습니까?");
		if(receiptButton) {
			//영수증 출력(메뉴이름, 가격, 총합가격)
		}
		waitingNumber++;
		System.out.println("대기번호 : " + waitingNumber);
	}
}
