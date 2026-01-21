package oop;

public class CraneGameMachineTest {
	public static void main(String[] args) {
		CraneGameMachine gameMachine = new CraneGameMachine();
		gameMachine.isInsertCoin = false;
		gameMachine.dolls = 10;

		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			gameMachine.insertCoin();
			System.out.println("게임을 진행합니다." + i + "회 째");
			result += gameMachine.doGame();
		
			System.out.println("isInsertCoin : " + gameMachine.isInsertCoin);
			System.out.println("남은 인형개수 : " + gameMachine.dolls);
			System.out.println("뽑은 인형개수 : " + result);
			System.out.println();
		}
	}
	
//	public static void main(String[] args) {
//		CraneGameMachine cgm = new CraneGameMachine();
//		cgm.isInsertCoin = false;
//		cgm.dolls = 10;
//		
//		cgm.insertCoin();
//		int result = cgm.doGame();
//		System.out.println("isInsertCoin: " + cgm.isInsertCoin);
//		System.out.println("남은 인형개수: " + cgm.dolls);
//		System.out.println("뽑은 인형개수: " + result);
//	}

}
