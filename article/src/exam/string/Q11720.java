package exam.string;

import java.util.Scanner;

public class Q11720 {
	private Scanner keyboard;
	private String numberNum;
	private String number;
	private int sum;
	
	public Q11720() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		char a;
		int b;
		System.out.println("숫자의 개수를 입력해주세요.");
		this.numberNum = this.keyboard.nextLine();
		System.out.println("숫자를 공백없이 입력해주세요.");
		this.number = this.keyboard.nextLine();
		for(int i = 0; i < number.length(); i ++) {
			a = number.charAt(i);
			b = a - '0';
			sum += b;
		}
		System.out.println(sum);	
	}
	
	public static void main(String[] args) {
		Q11720 qus = new Q11720();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/11720
