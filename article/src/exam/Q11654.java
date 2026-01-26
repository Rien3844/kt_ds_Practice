package exam;

import java.util.Scanner;

public class Q11654 {
	private Scanner keyboard;
	private String word;
	private char i;
	
	public Q11654(){
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("문자를 입력해주세요.");
		this.word = this.keyboard.nextLine();
		i = this.word.charAt(0);
		System.out.println(word + "의 아스키 코드값은 " + (i + 0) + "입니다.");
	}
	
	public static void main(String[] args) {
		Q11654 qus = new Q11654();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/11654
