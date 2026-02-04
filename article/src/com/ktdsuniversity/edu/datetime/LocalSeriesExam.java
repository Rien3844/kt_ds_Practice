package com.ktdsuniversity.edu.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalSeriesExam {

	/*
	 * LocalDate : 날짜만 처리 LocalTime : 시간만 처리 LocalDateTime : 날짜와 시간 모두 처리
	 */
	public static void main(String[] args) {
		// 현재 날짜를 출력
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);

		System.out.println("----------------------------------");

		// 현재 시간을 출력
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		// 뒤의 nano seconds 안보이게 출력하기
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatTime = dtf.format(nowTime);
		System.out.println(formatTime);

		System.out.println("----------------------------------");

		// 현재 날짜와 시간을 출력
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E요일 HH:mm:ss");
		String formatDateTime = dtf.format(nowDateTime);
		System.out.println(formatDateTime);

		System.out.println("----------------------------------");

		// 태어난 일이 무슨 요일인가?
		LocalDate birthdate3 = LocalDate.of(1999, 02, 02);
		System.out.println(birthdate3);

		// 요일확인
		DayOfWeek week = birthdate3.getDayOfWeek();
		System.out.println(week);
		dtf = DateTimeFormatter.ofPattern("E요일");
		String weekString = dtf.format(birthdate3);
		System.out.println(weekString);

		LocalDate birthdate = LocalDate.parse("1999-02-02");
		System.out.println(birthdate);

		int birthYear = birthdate.getYear();
		System.out.println(birthYear);

		// 포맷이 다른 값을 구할때 => 뒤의 formater에게 받은 값과 같은 타입을 넣어주면 LocalDate 의 타입으로 변경해줌.
		LocalDate birthdate2 = LocalDate.parse("1999년 02월 02일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(birthdate2);

		System.out.println("----------------------------------");

		// 오늘 날짜부터 19일 이후가 언제인가?
		LocalDate future = LocalDate.now().plusDays(19);
		System.out.println("19일 뒤 : " + future);

		System.out.println("----------------------------------");

		// 오늘 날짜부터 35년 후가 언제인가?
		future = LocalDate.now().plusYears(35);
		System.out.println("35년 후 : " + future);

		// 오늘 날짜부터 97년 전은 언제인가?
		LocalDate past = LocalDate.now().minusYears(97);
		System.out.println("97년 전 : " + past);

		// 오늘 날짜부터 1300개월 이후는 언제인가?
		future = LocalDate.now().plusMonths(1300);
		System.out.println("1300개월 뒤 : " + future);

		// 2025년 1월 1일은 2026년 1월 1일보다 과거인가?
		LocalDate date1 = LocalDate.parse("2025-01-01");
		LocalDate date2 = LocalDate.parse("2026-01-01");
		System.out.println(date1.isBefore(date2));
		
		// 2026년 12월 11일은 2025년 2월 5일보다 미래인가?
		LocalDate date3 = LocalDate.parse("2026-12-11");
		LocalDate date4 = LocalDate.parse("2025-02-05");
		System.out.println(date3.isAfter(date4));

		System.out.println("----------------------------------");
		
		//얼마나 차이나는가?
		Period period = Period.between(date3, date4);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		// 몇 일 차이나는지
		long betweenDays = ChronoUnit.DAYS.between(date3, date4);
		System.out.println(betweenDays);
		
	}

}
