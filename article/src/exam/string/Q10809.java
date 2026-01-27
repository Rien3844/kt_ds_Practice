package exam.string;

import java.util.Scanner;

public class Q10809 {
	private Scanner keyboard;
	private String S;
	
	public Q10809() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("소문자로 단어를 입력해주세요.");
		this.S = this.keyboard.nextLine();
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(S.indexOf(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		Q10809 qus = new Q10809();
		qus.start();
	}
	
	
}
//https://www.acmicpc.net/problem/10809
