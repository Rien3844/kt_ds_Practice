package com.ktdsuniversity.edu.datetime;

import java.io.CharArrayReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalndarExam {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now);

		int year = now.get(Calendar.YEAR);
		System.out.println(year);

		// 배열 때문에 +1 한 값이 현재 달
		int month = now.get(Calendar.MONTH);
		System.out.println(month);

		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);

		// 1 - 일요일 | 2 - 월요일 | 3 - 화요일 | ... | 7 - 토요일
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weekDays = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(weekDays[week - 1] + "요일");

		System.out.println("---------------------------------");

		// 내가 태어난 날의 요일 확인
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(1999, 2 - 1, 2);
		week = birthdate.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDays[week - 1] + "요일");

		System.out.println("---------------------------------");

		// 오늘 날짜 부터 56일 후는 몇월 몇일 무슨 요일일까?
		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DAY_OF_MONTH, 56);
		int year2 = now2.get(Calendar.YEAR);
		int month2 = now2.get(Calendar.MONTH) + 1;
		int date2 = now2.get(Calendar.DAY_OF_MONTH);
		int week2 = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println("2026년 02월 04일 수요일에서 56일 후는 " 
							+ year2 + "년 " + month2 + "월 " 
							+ date2 + "일 " + weekDays[week2 - 1] + "요일 입니다.");

		System.out.println("---------------------------------");

		// 2025년 2월 4일은 2026년 2월 4일보다 과거인가?
		Calendar now3 = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.set(2025, 2 - 1, 4);

		// now3의 시간이 1970 1월 1일 0시 0분 0초 부터 얼마나 흘렀나?
		long nowTime = now3.getTimeInMillis();
		System.out.println(nowTime + " nowTime");
		long pastTime = past.getTimeInMillis();
		System.out.println(pastTime + " pastTime");
		if (nowTime > pastTime) {
			System.out.println("2025년 2월 4일은 2026년 2월 4일보다 과거입니다.");
		}

		System.out.println("---------------------------------");

		// 2026년 2월 4일 부터 2026년 7월 14일 까지 며칠이 걸리나?
		Calendar now4 = Calendar.getInstance();
		int daysCount = 0;
		while (true) {
			now4.add(Calendar.DAY_OF_MONTH, 1);
			daysCount++;

			if (now4.get(Calendar.YEAR) == 2026 
				&& now4.get(Calendar.MONTH) == 6
				&& now4.get(Calendar.DAY_OF_MONTH) == 14) {
				break;
			}
		}
		System.out.println("2026년 2월 4일 부터 2026년 7월 14일까지 " 
							+ daysCount + "일 걸렸습니다.");

		System.out.println("---------------------------------");

		// 오늘부터 7영업일 이후는 몇년 몇월 몇일 무슨 요일일까?
		Calendar now5 = Calendar.getInstance();
		int dayCount = 0;
		while (true) {
			now5.add(Calendar.DAY_OF_MONTH, 1);
			if (!(now5.get(Calendar.DAY_OF_WEEK) == 1 
				|| now5.get(Calendar.DAY_OF_WEEK) == 7)) {
				dayCount++;
			}
			if (dayCount == 7) {
				break;
			}
		}
		int year5 = now5.get(Calendar.YEAR);
		int month5 = now5.get(Calendar.MONTH) + 1;
		int date5 = now5.get(Calendar.DAY_OF_MONTH);
		int week5 = now5.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘부터 7영업일 이후는 " + year5 + "년 " 
							+ month5 + "월 " + date5 + "일 " 
							+ weekDays[week5 - 1] + "요일 입니다.");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Calender를 위한게 아니라 date를 위한 포맷이므로 date로 변경
		Date dateTime = now5.getTime();
		String dateString = sdf.format(dateTime);
		dateString += " " + weekDays[week5 - 1] + "요일";
		System.out.println(dateString);
		System.out.println("---------------------------------");

	}
}
