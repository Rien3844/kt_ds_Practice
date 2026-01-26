package exam;

import java.util.Scanner;

public class Q27866 {
	private Scanner keyboard;
	private String S;
	private int i;
	private String m;
	
	public Q27866() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("단어를 입력해주세요.");
		this.S = this.keyboard.nextLine();
		System.out.println("단어에서 찾으려는 위치 값을 입력해주세요.");
		this.i = Integer.parseInt(this.keyboard.nextLine()) - 1;
		m = this.S.charAt(i) + "";
		System.out.println("입력된 단어의 " + (i + 1) + "번째 글자는" + m + "입니다.");
	}
	
	public static void main(String[] args) {
		Q27866 qus = new Q27866();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/27866
