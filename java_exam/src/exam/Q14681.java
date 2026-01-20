package exam;

public class Q14681 {

	public static void main(String[] args) {
		int a_x = 12;
		int a_y = 5;
		int b_x = 9;
		int b_y = -13;
		
		if(a_x > 0 && a_y > 0) {
			System.out.println("1");
		}else if(a_x < 0 && a_y > 0) {
			System.out.println("2");
		}else if(a_x < 0 && a_y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		
		if(b_x > 0 && b_y > 0) {
			System.out.println("1");
		}else if(b_x < 0 && b_y > 0) {
			System.out.println("2");
		}else if(b_x < 0 && b_y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}

}
//https://www.acmicpc.net/problem/14681
