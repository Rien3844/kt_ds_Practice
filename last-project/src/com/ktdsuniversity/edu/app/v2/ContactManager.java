package com.ktdsuniversity.edu.app.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactManager {

	private List<Contact> contactList;

	public List<Contact> getContactList() {
		return this.contactList;
	}

	public ContactManager() {
		this.contactList = new ArrayList<>();
	}

	// 1. contactList에 Contact 인스턴스를 추가하는 기능.
	public void addContact(Contact contact) {
		contactList.stream().forEach(contactList::add);
		;
	}

	// 2. contactList의 모든 연락처 정보를 출력하는 기능.
	public void printAllContacts() {
		contactList.forEach(System.out::println);
	}

	// 3. contactList에서 전화번호 검색 결과 출력하는 기능
	// 예> 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력.
	//
	// conctactList에서 이름 검색 결과 출력하는 기능.
	// 예> "김"을 파라미터로 전달하면 name, firstName, lastName에
	// "김"이 포함된 연락처의 모든 정보를 출력.
	//
	// contactList에서 이메일 검색 결과 출력하는 기능.
	// 예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된
	// 연락처의 모든 정보를 출력.
	public List<Contact> search(Predicate<Contact> predicate) {
		if (this.contactList == null) {
			return Collections.emptyList();
		}

		return this.contactList.stream().filter(predicate).collect(Collectors.toList());
	}

	// 5. 삭제하려는 연락처의 정보를 이용한 연락처 삭제 기능.
	// 예> 이름이 "tt"인 연락처는 삭제한다., 전화번호 마지막 자리가 7777 인 연락처는 삭제한다.
	public void deleteContact(Predicate<Contact> predicate) {
		this.contactList.removeIf(predicate);
	}

	public static void main(String[] args) {

		ContactManager cm = new ContactManager();

		Contact newContact = new Contact();
		newContact.setName("김선우");
		newContact.setNickname("vRien");
		newContact.setEmail("kuda3844@gmail.com");
		newContact.setFirstName("김");
		newContact.setLastName("선우");
		newContact.setPhone("010-3337-3844");
		newContact.setMemo("없음");
		cm.addContact(newContact);

		newContact = new Contact();
		newContact.setName("김선우2");
		newContact.setNickname("vRien2");
		newContact.setEmail("kuda32844@gmail.com");
		newContact.setFirstName("김");
		newContact.setLastName("선우");
		newContact.setPhone("010-2222-3844");
		newContact.setMemo("없음");
		cm.addContact(newContact);

		newContact = new Contact();
		newContact.setName("김선우3");
		newContact.setNickname("vRien3");
		newContact.setEmail("kuda33844@gmail.com");
		newContact.setFirstName("김");
		newContact.setLastName("선우");
		newContact.setPhone("010-3333-3844");
		newContact.setMemo("없음");
		cm.addContact(newContact);

		System.out.println("전체 조회 결과");
		cm.printAllContacts();

		List<Contact> searchResult = cm.search(contact -> contact.getName().contains("2"));
		System.out.println("2 검색결과");
		searchResult.forEach(System.out::println);

		searchResult = cm.search(contact -> contact.getPhone().endsWith("3844"));
		System.out.println("3844 검색결과");
		searchResult.forEach(System.out::println);

		cm.deleteContact(contact -> contact.getName().contains("2"));
		System.out.println("2 삭제 후 전체 조회 결과");
		cm.printAllContacts();
	}
}