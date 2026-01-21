package oop;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public int getSumAllScores() {
		int allScores = java + python + cpp + csharp;
		return allScores;
	}
	
	public double getAverage() {
		double average = Math.round((double) getSumAllScores() * 100) / 100.0 / 4;
		return average;
		
//		int average = (int) (getSumAllScores() / 4.0 * 100);
//		return average / 100.0;

	}
	
	public double getCourseCredit() {
		double credit = (getAverage() - 55 ) / 10;
		double courseCredit = Math.floor((double)credit * 100) / 100.0;
		return courseCredit;
		
//		int courseCredit = (int) ((getAverage() - 55) / 10.0 * 100);
//		return courseCredit / 100.0;

	}
	
	public String getABCDE() {
		String grade = null;
		if(getCourseCredit() >= 4.1 && getCourseCredit() <= 4.5) {
			grade = "A+";
		}else if(getCourseCredit() >= 3.6 && getCourseCredit() <= 4.0) {
			grade = "A";
		}else if(getCourseCredit() >= 3.1 && getCourseCredit() <= 3.5) {
			grade = "B+";
		}else if(getCourseCredit() >= 2.6 && getCourseCredit() <= 3.0) {
			grade = "B";
		}else if(getCourseCredit() >= 1.6 && getCourseCredit() <= 2.5) {
			grade = "C";
		}else if(getCourseCredit() >= 0.6 && getCourseCredit() <= 1.5) {
			grade = "D";
		}else if(getCourseCredit() >= 0.1 && getCourseCredit() <= 0.5) {
			grade = "F";
		}
		return grade;
		
//		double courseCredit = getCourseCredit();
//		if (courseCredit >= 4.1) {
//			return "A+";
//		} else if (courseCredit >= 3.6) {
//			return "A";
//		} else if (courseCredit >= 3.1) {
//			return "B+";
//		} else if (courseCredit >= 2.6) {
//			return "B";
//		} else if (courseCredit >= 1.6) {
//			return "C";
//		} else if (courseCredit >= 0.6) {
//			return "D";
//		} else {
//			return "F";
//		}

	}
}
