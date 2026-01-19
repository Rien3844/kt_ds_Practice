package exam;

public class Q2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_H = 23;
		int start_M = 48;
		int need_M = 25;

		int end_M = (start_M + need_M) % 60;
		int end_H = (start_M + need_M) / 60;
		
		if(need_M >= 1440) {
			int days = need_M / 1440;
			need_M -= 1440 * days;
		}// 필요 시간이 하루를 넘어갈 때.
		
		if(start_M + need_M < 60) {
			System.out.println(start_H + " " + (start_M + need_M));
		}else if(start_M + need_M > 60 && start_H <= 23) {
			if(start_H + end_H >= 24) {
				System.out.println((start_H + end_H - 24) + " " + (end_M));
			}else {
				System.out.println(start_H + end_H + " " + (end_M));
			}
		}
	}

}
//https://www.acmicpc.net/problem/2525