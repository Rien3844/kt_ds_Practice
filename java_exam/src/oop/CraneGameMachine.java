package oop;

import java.util.Random;//랜덤 변수 리턴

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	
	public CraneGameMachine(boolean isInsertCoin, int dolls) {
		this.isInsertCoin = isInsertCoin;
		this.dolls = dolls;
	}
//	인형뽑기 기계에 동전을 넣습니다.
//	동전을 넣지 않으면 doGame()은 실행되지 않아야 합니다.
//	동전을 넣으면 isInsertCoin 변수는 true가 되어야 합니다.
//	dolls의 값이 0보다 작거나 같을 경우 isInsertCoin은 true로 변하지 않습니다
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
		}
	}
	

	public int doGame() {
		Random random = new Random();
		int a = 0;
		if(isInsertCoin) {
			if(random.nextInt(2) == 1) {
				a = 1;
			}else {
				a = 0;
			}
			
			if(a >= 1) {
				dolls -= 1;
				isInsertCoin = false;
			}else {
				isInsertCoin = false;
			}
		}
		return a;
		
//		if (isInsertCoin) {
//			Random random = new Random();
//			// 0 ~ 1 중 하나가 랜덤하게 추출됩니다.
//			int result = random.nextInt(2);
//			dolls -= result;
//			isInsertCoin = false;
//			return result;
//			}
//			return 0;

	}
}
