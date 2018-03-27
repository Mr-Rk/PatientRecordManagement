package com.rk.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InsuranceDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String insuranceCompany;//nsuranceCompany
	private long policyNumber;
	
	@Column(length=18)
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	
	@Column(length=13)
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	@Override
	public String toString() {
		return "InsuranceDetails [insuranceCompany=" + insuranceCompany + ", policyNumber=" + policyNumber + "]";
	}
	
	
}
