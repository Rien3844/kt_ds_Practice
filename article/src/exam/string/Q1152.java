package exam.string;

import java.util.Scanner;

public class Q1152 {
	private Scanner keyboard;
	private String word;
	
	public Q1152(){
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("단어를 입력해주세요.");
		this.word = this.keyboard.nextLine();
		String[] wordchange = word.split(" ");
		System.out.println(wordchange.length);
		
	}

	public static void main(String[] args) {
		Q1152 qus = new Q1152();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/1152
