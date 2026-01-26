package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame2 {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
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
		
		while(true) {
			//다음 단어 입력
			System.out.println("다음 단어를 입력해주세요.");
			this.nextWord = this.keyboard.nextLine();
			//다음 단어의 좌우 공백을 제거, 제거된 결과를 할당시킨다.
			this.nextWord = this.nextWord.trim();
			System.out.println("입력된 단어 : " + this.nextWord);
			//시작 단어의 마지막 글자를 추출.
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
//			lastLetter = this.startWord.substring(this.startWord.length() - 2, this.startWord.length() - 1);
			//다음 단어가 시작 단어의 마지막 글자로 시작하는가?
			if(nextWord.startsWith(lastLetter)) {
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
		RelayGame2 game = new RelayGame2();
		game.startGame();
	}
}
