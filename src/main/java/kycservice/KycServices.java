package kycservice;

import java.time.LocalDate;

public class KycServices {
	
	@Override
	public String toString() {
		return "KycServices [name=" + name + ", dob=" + dob + ", aadharCardNumber=" + aadharCardNumber + ", address="
				+ address + ", panCardNumber=" + panCardNumber + "]";
	}

	private String name;
	private LocalDate dob;
	private long aadharCardNumber;
	private String address;
	private String panCardNumber;
	public String getRationCardNumber() {
		return rationCardNumber;
	}

	public void setRationCardNumber(String rationCardNumber) {
		this.rationCardNumber = rationCardNumber;
	}

	private String rationCardNumber;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}



	public KycServices(long aadharCardNumber, String name, LocalDate dob, String address) {
		super();
		this.aadharCardNumber = aadharCardNumber;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public KycServices(String panCardNumber, String name, LocalDate dob) {
		this.panCardNumber = panCardNumber;
		this.name = name;
		this.dob = dob;
		
	}
	
	public KycServices(String rationCardNumber, LocalDate dob,String name ) {
		this.rationCardNumber = rationCardNumber;
		this.name = name;
		this.dob = dob;
		
	}

	public KycServices(long aadharCardNumber, String name, LocalDate dob) {
		this.aadharCardNumber = aadharCardNumber;
		this.name = name;
		this.dob = dob;

	}

	public KycServices(String string) {
		// TODO Auto-generated constructor stub
	}

	public KycServices() {
		// TODO Auto-generated constructor stub
	}

}
