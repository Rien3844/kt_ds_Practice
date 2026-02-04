package com.ktdsuniversity.edu.datetime.kakao;

public class KakaoTalk {

	public static void main(String[] args) {
		FriendList f1 = new FriendList();
		
		f1.add(new Friend("A", "2000-01-01"));
		f1.add(new Friend("B", "2001-11-01"));
		f1.add(new Friend("C", "2004-05-16"));
		f1.add(new Friend("D", "2001-02-28"));
		f1.add(new Friend("E", "1998-02-04"));
		f1.add(new Friend("F", "2001-02-09"));
		f1.add(new Friend("G", "1994-01-30"));
		f1.add(new Friend("H", "2011-02-01"));
		
		f1.printSpecialFriends(Base.FUTURE); // 생일이 다가오는 친구
		f1.printSpecialFriends(Base.NOW); // 오늘이 생일인 친구
		f1.printSpecialFriends(Base.PAST); // 생일이 지난 친구
		
		System.out.println(f1);
	}
	
}
