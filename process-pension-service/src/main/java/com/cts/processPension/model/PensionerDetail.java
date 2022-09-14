package com.cts.processPension.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for pensioner details
 * 
 * @author Ankit Barnwal
 *
 */

public class PensionerDetail {
	private String name;
	private Date dateOfBirth;
	private String pan;
	private double salary;
	private double allowance;
	private String pensionType;
	private Bank bank;
	public PensionerDetail(String name, Date dateOfBirth, String pan, double salary, double allowance,
			String pensionType, Bank bank) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salary = salary;
		this.allowance = allowance;
		this.pensionType = pensionType;
		this.bank = bank;
	}
	public String getName() {
		return name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPan() {
		return pan;
	}
	public double getSalary() {
		return salary;
	}
	public double getAllowance() {
		return allowance;
	}
	public String getPensionType() {
		return pensionType;
	}
	public Bank getBank() {
		return bank;
	}
	
	
}