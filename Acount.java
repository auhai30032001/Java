package Javabtl;

import java.sql.Date;

public class Acount {

	private String acountNumber;
	private String user;
	private String password;
	private String cardNumber;
	private double balance;
	private Date dateSingup;
	
	
	
	public Acount(String acountNumber, String user, String password, String cardNumber, double balance,
			Date dateSingup) {
		super();
		this.acountNumber = acountNumber;
		this.user = user;
		this.password = password;
		this.cardNumber = cardNumber;
		this.balance = balance;
		this.dateSingup = dateSingup;
	}
	
	
	
}
