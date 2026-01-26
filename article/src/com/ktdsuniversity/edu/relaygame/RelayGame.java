package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void startGame() {
		//게임 시작
		System.out.println("게임이 시작되었습니다.");
		//시작 단어 입력
		System.out.println("시작 단어를 입력해주세요.");
		this.startWord = this.keyboard.nextLine();
		System.out.println("입력된 단어 : " + this.startWord);
		
		String lastLetter = "";
		String firstLetter = "";
		
		while(true) {
			//다음 단어 입력
			System.out.println("다음 단어를 입력해주세요.");
			this.nextWord = this.keyboard.nextLine();
			//다음 단어의 좌우 공백을 제거, 제거된 결과를 할당시킨다.
			this.nextWord = this.nextWord.trim();
			System.out.println("입력된 단어 : " + this.nextWord);
			//시작 단어의 마지막 글자를 추출.
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
			//다음 단어의 첫 번째 글자를 추출.
//			String firstLetter = this.nextWord.charAt(0) + "";
			firstLetter = this.nextWord.substring(0, 1);//0번부터 1번 전까지 가지고와라.
			//시작 단어의 마지막 글자와 다음 단어의 첫 번째 글자가 같은가?
			if(lastLetter.equals(firstLetter)) {
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				}else {
					System.out.println("글자의 길이가 3글자 이상이어야 합니다.");
					System.out.println("게임이 종료되었습니다.");
					break;
				}
			}else {
				System.out.println("끝말잇기 규칙에 위배되었습니다.");
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		RelayGame game = new RelayGame();
		game.startGame();
	}
}
