package com.cts.disbursepension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for bank details
 * 
 * @author Ankit Barnwal
 *
 */

public class BankDetails {
	private String bankName;
	private long accountNumber;
	private String bankType;

	public BankDetails(String bankName, long accountNumber, String bankType) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}

	public String getBankName() {
		return bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getBankType() {
		return bankType;
	}

}
