package exam.string;

import java.util.Scanner;

public class Q2743 {
	private Scanner keyboard;
	private String word;
	private int length;
	
	public Q2743() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("알파벳으로만 이루어진 단어를 입력해주세요.");
		this.word = this.keyboard.nextLine();
		length = this.word.length();
		System.out.println("해당 단어의 길이는 " + length + "입니다.");
	}
	
	public static void main(String[] args) {
		Q2743 qus = new Q2743();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/2743
