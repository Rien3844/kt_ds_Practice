package exam;

public class ArithmaticQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
		int totalScore = subjectA + subjectB + subjectC + subjectD; // 모든 과목들의 합
		double average = totalScore / 4d; // 평균 점수
//		double score = average - 55; // 4.5 만점 기준 학점 계산. 소수점 이하 두자리 까지.
//						  // (평균 점수 - 55) 에서 소수점 계산
//		score = Math.round(score * 10);
//		score /= 100;
		
		double score = Math.round((average - 55) * 10) / 100d;
		
		System.out.println("점수 총합 : " + totalScore);
		System.out.println("점수 평균 : " + average);
		System.out.println("학점 결과 : " + score);
		
	}

}