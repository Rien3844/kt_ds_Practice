package exam;

public class Q2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a_H = 10;
		int a_M = 10;
		int b_H = 0;
		int b_M = 30;
		int c_H = 23;
		int c_M = 40;
		
		int n = 45;
		if(a_M - n < 0 && a_H > 0) {//분이 n보다 작음 => 시간 - 1
			System.out.println((a_H - 1) + " " + (a_M + 60 - n));
		}else if(a_M - n < 0 && a_H <= 0) {//분이 n보다 작고 시간이 0시 ==> 24시 - 1
			System.out.println((a_H + 24 - 1) + " " + (a_M + 60 - n));
		}else {//분이 n보다 큼
			System.out.println(a_H + " " + (a_M - n));
		}
		
		if(b_M - n < 0 && b_H > 0) {//분이 n보다 작음 => 시간 - 1
			System.out.println((b_H - 1) + " " + (b_M + 60 - n));
		}else if(b_M - n < 0 && b_H <= 0) {//분이 n보다 작고 시간이 0시 ==> 24시 - 1
			System.out.println((b_H + 24 - 1) + " " + (b_M + 60 - n));
		}else {//분이 n보다 큼
			System.out.println(b_H + " " + (b_M - n));
		}
		
		if(c_M - n < 0 && c_H > 0) {//분이 n보다 작음 => 시간 - 1
			System.out.println((c_H - 1) + " " + (c_M + 60 - n));
		}else if(c_M - n < 0 && c_H <= 0) {//분이 n보다 작고 시간이 0시 ==> 24시 - 1
			System.out.println((c_H + 24 - 1) + " " + (c_M + 60 - n));
		}else {//분이 n보다 큼
			System.out.println(c_H + " " + (c_M - n));
		}
	}

}
//https://www.acmicpc.net/problem/2884
