package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {

	private Scanner sc;

	private List<Contact> contactList;

	public List<Contact> getContactList() {
		return this.contactList;
	}

	public ContactManager() {
		this.contactList = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}

	// 1. contactList에 Contact 인스턴스를 추가하는 기능.
	public void add(Contact contact) {
		this.contactList.add(contact);
	}

	// 2. contactList의 모든 연락처 정보를 출력하는 기능.
	public void printAllInformation() {
//		for (Contact c : this.contactList) {
//			System.out.println(c);
//		}
		this.contactList.forEach(System.out::println);
	}

	// 3. contactList에서 전화번호 검색 결과 출력하는 기능.
	// ex) 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력.
	public List<Contact> phoneNumberSearchResult(String inputNum) {

		List<Contact> result = new ArrayList<>();
		List<Phone> phoneNum = null;

		for (Contact c : this.contactList) {
			phoneNum = c.getPhones();
			if (phoneNum != null) {
				for (Phone phone : phoneNum) {
					if (inputNum.contains(phone.getPhoneNumber())) {
						result.add(c);
					}
				}
			}
		}
		return result;
	}

	// 4. contactList에서 이름 검색 결과 출력하는 기능.
	// ex) "김" 파라미터로 전달하면 name firstName, LastName, companyName에 "김"이 포함된 연락처의 모든
	// 정보를 출력.
	public List<Contact> printSearchName(String inputName) {

		List<Contact> result = new ArrayList<>();

		for (Contact c : this.contactList) {
			if (c.getName() != null && c.getName().contains(inputName)) {
				result.add(c);
			} else if (c.getFirstName() != null && c.getFirstName().contains(inputName)) {
				result.add(c);
			} else if (c.getLastName() != null && c.getFirstName().contains(inputName)) {
				result.add(c);
			} else if (c.getCompany().getCompanyName() != null && c.getCompany().getCompanyName().contains(inputName)) {
				result.add(c);
			}
		}
		return result;

	}

	// 5. contactList에서 이메일 검색 결과 출력하는 기능.
	// ex) "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된 연락처의 모든 정보 출력.
	public List<Contact> printSearchEmail(String inputEmail) {
		List<Contact> result = new ArrayList<>();

		for (Contact c : this.contactList) {
			if (c.getEmail() != null && c.getEmail().contains(inputEmail)) {
				result.add(c);
			}
		}
		return result;
	}

	// 6. 연락처 정보 수정 기능
	// ex) 다양한 검색의 결과 중 하나를 선택해 연락처 정보를 수정할 수 있는 기능.
	// 이름 변경, 전화번호 추가, 수정, 회사 정보 수정 등등....
	public void replaceContact(int index, Contact contact) {
		if (index >= 0 && index < contactList.size()) {
			this.contactList.set(index, contact);
		}
	}

	// 7. 연락처 정보 삭제 기능
	// ex) 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능.
	public void deleteContact(int index) {
		if (index >= 0 && index < this.contactList.size()) {
			this.contactList.remove(index);
		}
	}

	public static void main(String[] args) {

		ContactHelper helper = new ContactHelper();
		ContactManager cm = new ContactManager();
		int menuNum = 0;

		List<Contact> searchResult = null;
		String searchKeyword = null;
		while (true) {
			searchKeyword = null;
			searchResult = null;

			System.out.println("=".repeat(40));
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 조회");
			System.out.println("3. 연락처 검색 - 전화번호");
			System.out.println("4. 연락처 검색 - 이름");
			System.out.println("5. 연락처 검색 - 이메일");
			System.out.println("9. 종료");
			System.out.println("=".repeat(40));

			menuNum = helper.inputInteger();
			if (menuNum == 9) {
				break;
			} else if (menuNum == 1) {
				cm.add(helper.makeContact());
			} else if (menuNum == 2) {
				cm.printAllInformation();
			} else if (menuNum == 3) {
				searchKeyword = helper.inputRequireField(1, "검색할 전화번호를 입력하세요: ", "한 글자 이상 입력하세요.");
				searchResult = cm.phoneNumberSearchResult(searchKeyword);
			} else if (menuNum == 4) {
				searchKeyword = helper.inputRequireField(1, "검색할 이름을 입력하세요: ", "한 글자 이상 입력하세요.");
				searchResult = cm.printSearchName(searchKeyword);
			} else if (menuNum == 5) {
				searchKeyword = helper.inputRequireField(1, "검색할 이메일을 입력하세요: ", "한 글자 이상 입력하세요.");
				searchResult = cm.printSearchEmail(searchKeyword);
			}

			if (searchResult != null) {
				System.out.println("[" + searchKeyword + "] 검색 결과");

				if (searchResult.isEmpty()) {
					System.out.println("검색 결과가 존재하지 않습니다.");
				} else {
					System.out.println(searchResult.size() + "개의 연락처가 검색되었습니다.");
					for (Contact contact : searchResult) {
						System.out.println(cm.getContactList().indexOf(contact) + ". " + contact);
					}

					helper.replaceOrDeleteContact(cm);
				}
			}
		}
	}
}
