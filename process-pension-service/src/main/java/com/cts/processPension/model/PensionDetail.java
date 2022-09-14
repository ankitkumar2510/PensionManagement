package com.cts.processPension.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for pension details
 * 
 * @author Ankit Barnwal
 *
 */

public class PensionDetail {

	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	private String pan;
	private String pensionType;
	private double pensionAmount;

	public PensionDetail(String name, Date dateOfBirth, String pan, String pensionType, double pensionAmount) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.pensionType = pensionType;
		this.pensionAmount = pensionAmount;
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

	public String getPensionType() {
		return pensionType;
	}

	public double getPensionAmount() {
		return pensionAmount;
	}

}