package java_exam;

public class Variables1 {
	
	public static void main(String[] agrs) {
//		중요한 타입(int, long, float, double, boolean)
//		나이가 몇살인지 구해보는 나이 계산기
//		현재 연도 - 나의 생년
		System.out.println("당신의 나이는 " + (2026 - 1999 + 1 )+"세 입니다.");
		{
			int nowYear = 2026; // 현재 연도
			int myBirthYear = 1999; // 나의 생년
			System.out.println("당신의 나이는 " + (nowYear - myBirthYear + 1 )+"세 입니다.");
			
			int myAge = nowYear - myBirthYear + 1;
			System.out.println("당신의 나이는 " + myAge+"세 입니다.");
		}
//		변수가 사라지는 과정 == 해당 변수들은 중괄호 안에서 만들어졋으므로 중괄호 밖에서 사라짐
		
		final long price = 1000;
		//정수는 기본적으로 int 타입.
		long buildingPrice = 10_000_000_000L; // l or L을 안붙여주면 int로 판단. l or L을 붙임으로서 long으로 판단함.
		
		//실수는 기본적으로 double 타입.
		float ratio = 5.111f;
		double doubleRation = 3.141592;
		
		// price = 10_000; price 앞에 final 을 붙여서 상수로 만듦 => 상수는 값 변환 불가능 => 에러 발생
		
		int ex = 1;

	    long bigNumber = Integer.MAX_VALUE + 1L;
	    int normalNumber = (int) bigNumber;

	    int num = Integer.MAX_VALUE;
	    num = num + 1 ;
	    System.out.println(num);// 정수 오버플로우
	    
	    byte bNumber = 127;
	    // bNumber = bNumber + (byte) 1); ==> 오류발생 -> 128은 byte에 넣을수 없으니까.
	    bNumber = (byte) (bNumber + 1);
	    System.out.println(bNumber); // 결과는 -128 -> 위와 같이 정수 오버플로우 발생.
	    
	    //문장의 형변환
	    System.out.println("3 + 7의 결과는? " + 3 + 7); // 3이라는 문자와 7이라는 문자가 더해져 37이 값으로 나옴. 10을 얻고싶으면 (3 + 7)로 해야함.
		
	    //실수의 형변환
	    System.out.println(10L + 3.5f); // 정수는 어쨋든간에 실수보다 작다. Long은 8byte, float은 4byte이지만 결과는 실수(float)로 나온다.
	    
	    System.out.println(3.5f + 10.7); // 실수간의 연산은 double이 더 크기에 double로 나온다.
	    System.out.println( (float) 10 / 3); // 소숫점을 얻고싶으면 앞의 정수나 뒤의 정수를 float, double로 명시적 형변환을 한다. or 숫자 뒤에 형변환(f or d)를 붙여주기.
	    
	    //정수 <-> 부동 소수점의 변환
	    int n1 = 10;
	    float fn1 = n1;
	    double dn1 = n1;
	    
	    //묵시적 형변환
	    System.out.println("n1 = " + n1);
	    System.out.println("fn1 = " + fn1);
	    System.out.println("dn1 = " + dn1);
	    
	    //명시적 형변환
	    float fn2 = 10.9f;
	    int n2 = (int) fn2;
	    System.out.println("fn2 = " + fn2);
	    System.out.println("n2 = " + n2);
	    
	    double dn3 = 11.15;
	    int n3 = (int) dn3;
	    System.out.println("dn3 = " + dn3);
	    System.out.println("n3 = " + n3);
	    
	    // 부동소수점 소수점 처리
	    // 변수명 = Math.ceil(변수명) => 소수점 올림 
	    // 변수명 = Math.floor(변수명) => 소수점 내림
	    // 변수명 = Math.round(변수명) => 소수점 반올림
	    /* 
	   ex) double dnum = 10.1;
	       dnum = Math.ceil(dnum) => 실행결과 : 11.0
	       dnum = Math.floor(dnum) => 실행결과 : 10.0
	       dnum = Math.round(dnum) => 실행결과 : 10.0 / if (10.5 <= dnum <= 11) 실행결과 11.0
	    */
	    //Java에서 소수점 자리 처리는 유연하지 못하므로 원하는 자릿 수 만큼 곱한 후 처리해야함.
	    /*
	      ex)29.37 => 29.4로 올림처리하려면 10을 곱한 후 올림을 하고 10을 나눠줘야함.
	      double dnum = 29.37;
	      double dnum2 = dnum * 10;
	      dnum2 = Math.round(dnum2);
	      double dnum3 = dnum2 / 10;
	      dnum = dnum3;
	    */
	    
		System.out.println("계산 끝났습니다.");
		
	}

}
