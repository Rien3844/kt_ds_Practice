package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	/**
	 * 연락처의 이름
	 */
	private String name;

	/**
	 * 연락처 별명
	 */
	private String nickname;

	/**
	 * 연락처 이메일
	 */
	private String email;

	/**
	 * 연락처 이름
	 */
	private String firstName;

	/**
	 * 연락처 성
	 */
	private String lastName;

	/**
	 * 전화번호 목록
	 */
	private List<Phone> phones;

	/**
	 * 근무중인 회사 정보
	 */
	private Company company;

	/**
	 * 메모
	 */
	private String memo;

	public Contact() {
		this.phones = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {

		return "전체 이름: " + this.name + ", 별명: " + this.nickname + ", email: " + this.email + ", 성: " + this.firstName
				+ ", 이름: " + this.lastName + ", 연락처: " + this.phones + ", 회사: " + this.company + ", 메모: " + this.memo;
	}
}
