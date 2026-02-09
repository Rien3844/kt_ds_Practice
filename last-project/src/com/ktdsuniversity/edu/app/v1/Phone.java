package com.ktdsuniversity.edu.app.v1;

public class Phone {

	public static enum Type {
		PERSONAL, HOME, COMPANY
	}

	private Phone.Type phoneType;
	private String phoneNumber;

	public Phone(Phone.Type phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone.Type getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();
		buffer.append("전화번호 유형: ");
		if (this.phoneType == Phone.Type.PERSONAL) {
			buffer.append("개인");
		} else if (this.phoneType == Phone.Type.HOME) {
			buffer.append("집");
		} else if (this.phoneType == Phone.Type.COMPANY) {
			buffer.append("회사");
		}
		buffer.append(", ");
		buffer.append("전화번호: " + this.phoneNumber);
		return buffer.toString();
	}

}
