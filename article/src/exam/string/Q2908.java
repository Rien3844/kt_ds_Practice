package exam.string;

import java.util.Scanner;

public class Q2908 {
	private Scanner keyboard;
	private String input;
	
	public Q2908() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void start() {
		System.out.println("상근이가 두 수를 입력합니다. 두 수는 같지않은 세자리수입니다.");
		this.input = this.keyboard.nextLine();
		String[] nums = input.split(" ");;
		String a = "";
		
		String input1 = nums[0];
		String input2 = nums[1];
		for(int i = 2; i >= 0; i--) {
			if(input1.charAt(i) > input2.charAt(i)) {
				a = input1;
				break;
			}else {
				a = input2;
				break;
			}
		}
		System.out.print("상수가 생각하는 큰 수는 ");
		for(int i = 2; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println(" 입니다.");
		
	}

	public static void main(String[] args) {
		Q2908 qus = new Q2908();
		qus.start();
	}
}
//https://www.acmicpc.net/problem/2908