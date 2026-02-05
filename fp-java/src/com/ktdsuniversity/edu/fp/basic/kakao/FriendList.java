package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FriendList {

	private List<Friend> friends;

	public FriendList() {
		this.friends = new ArrayList<>();

	}

	public void add(Friend friend) {
		this.friends.add(friend);
	}

	public void printSpecialFriends(Search search) {

//		LocalDate tempBirthdate = null;

		for (Friend f : this.friends) {
//			tempBirthdate = LocalDate.parse(f.getBirthdate().toString());
//			tempBirthdate = tempBirthdate.withYear(LocalDate.now().getYear());
			
			if(search.check(f)) {
				System.out.println(f);
			}
			
		}
	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();

		if (this.friends.size() == 0) {
			buffer.append("등록된 친구가 없습니다.");
		} else {
			for (Friend f : this.friends) {
				buffer.append(f);
				buffer.append("\n");
			}
		}

		return buffer.toString();
	}

}
