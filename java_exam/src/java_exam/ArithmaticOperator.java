package java_exam;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		
		System.out.println(n);
		n++;
		System.out.println(n);
		
		System.out.println(n++); // 후위 연산자라 출력 이후 연산이 진행. => 결과값 1, 다음 결과가 +1이됨.
		System.out.println(n);
		
		n = 0;
		System.out.println(n);
		
		System.out.println(--n); // 전위 연산자라 연산 후 출력이 진행 => 결과값 -2
		
		int m = 10;
		System.out.println(++m); // 11
		System.out.println(m++); // 11
		System.out.println(m); // 12
		
		System.out.println(--m); // 11
		System.out.println(m--); // 11
		System.out.println(m); // 10
	}

}
