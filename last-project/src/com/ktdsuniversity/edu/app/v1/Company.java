package com.ktdsuniversity.edu.app.v1;

public class Company {

	/**
	 * 근무중인 회사의 이름
	 */
	private String companyName;

	/**
	 * 직급(사원, 대리, 과장, 차장, 부장, 이사, 대표)
	 */
	private String job;

	private String address;

	public Company(String companyName, String job, String address) {
		this.companyName = companyName;
		this.job = job;
		this.address = address;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "회사이름: " + this.companyName + ", 직급: " + this.job + ", 주소: " + this.address;
	}

}
