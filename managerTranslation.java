package Javabtl;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public class managerTranslation {

	private String numberReceive;
	private Date dateTranslation;
	private double amount;
	private String note;
	private List<Translation> trans = new ArrayList<>();
	
	
	public managerTranslation(String numberReceive, Date dateTranslation, double amount, String note) {
		super();
		this.numberReceive = numberReceive;
		this.dateTranslation = dateTranslation;
		this.amount = amount;
		this.note = note;
	}
	
	public void addTranslatin(Translation tran)
	{
		this.trans.add(tran);
	}
	
	
	
}
