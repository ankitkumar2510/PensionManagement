package com.cts.disbursepension.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Model class for processPensionInput
 * 
 * @author Ankit Barnwal
 *
 */

public class ProcessPensionInput {
	@ApiModelProperty(value = "Aadhaar Number")
	@NotBlank(message = "aadharNumber is needed")
	@Pattern(regexp = "[0-9]{12}")
	private String aadhaarNumber;

	@ApiModelProperty(value = "Pension Amount")
	@NotNull(message = "pensionAmount can not be blank")
	@Range(min = 0, message = "pensionAmount can not be negative")
	private double pensionAmount;

	@ApiModelProperty(value = "Bank Service Charges")
	@NotNull(message = "bankServiceCharge can not be blank")
	@Range(min = 0, message = "bankServiceCharge can not be negative")
	private double bankServiceCharge;

	public ProcessPensionInput() {
		super();
	}

	public ProcessPensionInput(
			@NotBlank(message = "aadharNumber is needed") @Pattern(regexp = "[0-9]{12}") String aadhaarNumber,
			@NotNull(message = "pensionAmount can not be blank") @Range(min = 0, message = "pensionAmount can not be negative") double pensionAmount,
			@NotNull(message = "bankServiceCharge can not be blank") @Range(min = 0, message = "bankServiceCharge can not be negative") double bankServiceCharge) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public double getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

}
