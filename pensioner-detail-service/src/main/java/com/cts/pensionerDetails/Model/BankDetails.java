package com.cts.pensionerDetails.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ankit Barnwal
 * 
 * This is BankDetail class which contains the Bank
 *         details like bankName, bankType, accountNumber
 *
 */


public class BankDetails {

	private String bankName;
	private long accountNumber;
	private String bankType;

	public BankDetails() {
		super();
	}

	public BankDetails(String bankName, long accountNumber, String bankType) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

}
