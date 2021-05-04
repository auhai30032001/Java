package Javabtl;

import java.sql.Date;

public class Customer {

	private String CMND;
	private String nameCustomer;
	private Date birthDay;
	private Boolean sex;
	private String phoneNumber;
	private String address;
	
	
	
	public Customer(String CMND, String nameCustomer, Date birthDay, Boolean sex, String phoneNumber, String address) {
		super();
		CMND = CMND;
		this.nameCustomer = nameCustomer;
		this.birthDay = birthDay;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
}
