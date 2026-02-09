package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ContactHelper {

	private Scanner input;

	public ContactHelper() {
		this.input = new Scanner(System.in);
	}

	public int inputInteger() {
		try {
			return this.input.nextInt();
		} catch (InputMismatchException ime) {
			return 0;
		} finally {
			this.input.nextLine();
		}
	}

	public String inputRequireField(int minimumLength, String inputMessage, String errorMessage) {
		String fieldValue = null;
		while (fieldValue == null || fieldValue.length() < minimumLength) {
			if (inputMessage != null) {
				System.out.print(inputMessage);
			}
			fieldValue = this.input.nextLine();
			fieldValue = fieldValue.trim();

			if (fieldValue.length() < minimumLength) {
				System.out.println(errorMessage);
			}
		}
		return fieldValue;
	}

	public int inputPhoneType() {
		System.out.println("전화번호 유형을 선택하세요.");
		System.out.println("1. 개인");
		System.out.println("2. 집");
		System.out.println("3. 직장");
		System.out.println("9. 종료");
		int type = this.inputInteger();
		return type;
	}

	/**
	 * 연락처 만들기
	 * 
	 * @return 새롭게 만든 연락처
	 */
	public Contact makeContact() {
		Contact newContact = new Contact();
		String name = this.inputRequireField(2, "이름: ", "이름은 두 글자 이상 입력해야 합니다.");
		newContact.setName(name);
		newContact.setLastName(name.substring(1));
		newContact.setFirstName(name.substring(0, 1));

		System.out.print("별명: ");
		newContact.setNickname(this.input.nextLine().trim());

		System.out.print("이메일: ");
		newContact.setEmail(this.input.nextLine().trim());

		System.out.println("전화번호");
		int type = 0;
		while (true) {
			type = this.inputPhoneType();

			if (type >= 1 && type <= 3) {
				newContact.getPhones().add(this.makeNewPhone(type));
			} else if (type == 9) {
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}

		System.out.print("회사 정보를 입력할까요? (y/N)");
		if (this.input.nextLine().equalsIgnoreCase("Y")) {
			String companyName = this.inputRequireField(1, "회사 이름: ", "회사 이름은 반드시 입력하세요.");

			System.out.print("회사 직급: ");
			String companyJob = this.input.nextLine();

			System.out.print("회사 주소: ");
			String companyAddress = this.input.nextLine();

			Company newCompany = new Company(companyName, companyJob, companyAddress);
			newContact.setCompany(newCompany);
		}

		System.out.print("메모: ");
		newContact.setMemo(this.input.nextLine().trim());

		return newContact;
	}

	private void replaceContact(Contact contact) {
		System.out.println("현재 이름: " + contact.getName());
		System.out.print("수정할까요? (y/N)");
		if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
			String name = this.inputRequireField(2, "새로운 이름을 입력하세요.", "이름은 두 글자 이상 입력해야 합니다.");
			contact.setName(name);
			contact.setLastName(name.substring(0, 1));
			contact.setFirstName(name.substring(1));
		}

		System.out.println("현재 별명: " + contact.getNickname());
		System.out.print("수정할까요? (y/N)");
		if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
			System.out.print("새로운 별명을 입력하세요.");
			contact.setNickname(this.input.nextLine().trim());
		}

		System.out.println("현재 이메일: " + contact.getEmail());
		System.out.print("수정할까요? (y/N)");
		if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
			System.out.print("새로운 이메일을 입력하세요.");
			contact.setEmail(this.input.nextLine().trim());
		}

		List<Integer> removePhoneIndex = new ArrayList<>();
		int type = 0;
		System.out.println("전화번호");
		for (Phone phone : contact.getPhones()) {
			System.out.println("현재 전화번호: " + phone);
			System.out.print("수정할까요? (y/N)");
			if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
				type = this.inputPhoneType();

				if (type >= 1 && type <= 3) {
					Phone newPhone = this.makeNewPhone(type);
					phone.setPhoneNumber(newPhone.getPhoneNumber());
					phone.setPhoneType(newPhone.getPhoneType());
				} else if (type == 9) {
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} else {
				System.out.print("삭제할까요? (y/N)");
				if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
					removePhoneIndex.add(contact.getPhones().indexOf(phone));
				}
			}
		}

		for (int i = removePhoneIndex.size() - 1; i >= 0; i--) {
			contact.getPhones().remove((int) removePhoneIndex.get(i));
		}

		System.out.print("새로운 전화번호를 추가할까요? (y/N)");
		if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
			while (true) {
				type = this.inputPhoneType();

				if (type >= 1 && type <= 3) {
					contact.getPhones().add(this.makeNewPhone(type));
				} else if (type == 9) {
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			}

		}

		System.out.println("현재 메모: " + contact.getMemo());
		System.out.print("수정할까요? (y/N)");
		if (this.input.nextLine().trim().equalsIgnoreCase("Y")) {
			System.out.print("새로운 메모를 입력하세요.");
			contact.setMemo(this.input.nextLine().trim());
		}
	}

	public Phone makeNewPhone(int type) {
		String phoneNumber = this.inputRequireField(1, "연락처: ", "연락처를 입력하세요!");
		Phone.Type phoneType = null;
		if (type == 1) {
			phoneType = Phone.Type.PERSONAL;
		} else if (type == 2) {
			phoneType = Phone.Type.HOME;
		} else if (type == 3) {
			phoneType = Phone.Type.COMPANY;
		}
		return new Phone(phoneType, phoneNumber);
	}

	public void replaceOrDeleteContact(ContactManager cm) {
		int subMenuNum = 0;
		int contactIndex = 0;

		while (true) {
			System.out.println("=".repeat(40));
			System.out.println("1. 연락처 수정");
			System.out.println("2. 연락처 삭제");
			System.out.println("9. 종료");
			System.out.println("=".repeat(40));
			subMenuNum = this.inputInteger();

			if (subMenuNum == 1) {
				System.out.print("수정할 인덱스를 선택하세요: ");
				contactIndex = this.inputInteger();
				if (contactIndex >= 0 && contactIndex < cm.getContactList().size()) {
					Contact tempContact = cm.getContactList().get(contactIndex);
					this.replaceContact(tempContact);
				} else {
					System.out.println("존재하지 않는 연락처입니다.");
				}
			} else if (subMenuNum == 2) {
				System.out.print("삭제할 인덱스를 선택하세요: ");
				contactIndex = this.inputInteger();
				if (contactIndex >= 0 && contactIndex < cm.getContactList().size()) {
					cm.deleteContact(contactIndex);
				} else {
					System.out.println("존재하지 않는 연락처입니다.");
				}
			} else if (subMenuNum == 9) {
				break;
			} else {
				System.out.println("잘못 선택했습니다.");
			}
		}
	}

}