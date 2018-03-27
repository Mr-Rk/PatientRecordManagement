package com.rk.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PatientAddress {
	
	private String street;
	private String cityName;
	private String stateName;
	private String country;
	
	@Column(length=18)
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(length=18)
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Column(length=16)
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Column(length=14)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "PatientAddress [street=" + street + ", cityName=" + cityName + ", stateName=" + stateName + ", country="
				+ country + "]";
	}	
}
