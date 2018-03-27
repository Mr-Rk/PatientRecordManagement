package com.rk.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

@Entity
@Table(name="PATIENT_INFO")
public class PatientInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int patientId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date admisionDate;
	private InsuranceDetails insuranceDetails;
	private String physicianName;
	private long phNo;
	private String careTackerName;
	private String relationship;
	private PatientAddress addrs;
	
	@Id
	@GenericGenerator(name="sequence",
	                  strategy="sequence",
	                  parameters= {@Parameter(name = "sequence_name", value="patient_id"),
	                		       @Parameter(name="initial_value" , value="60000"),
	                		       @Parameter(name="increment_size", value="1")}) 
	@GeneratedValue(generator="sequence")
    @Column(length=16)
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	@Column(length=16)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(length=16)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(length=8)
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
    @Type(type="date")	
	public Date getAdmisionDate() {
		return admisionDate;
	}
	public void setAdmisionDate(Date admisionDate) {
		this.admisionDate = admisionDate;
	}
	@Embedded
	public InsuranceDetails getInsuranceDetails() {
		return insuranceDetails;
	}
	public void setInsuranceDetails(InsuranceDetails insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
	@Column(length=26)
	public String getPhysicianName() {
		return physicianName;
	}
	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}
	@Column(length=12)
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	@Column(length=18)
	public String getCareTackerName() {
		return careTackerName;
	}
	public void setCareTackerName(String careTackerName) {
		this.careTackerName = careTackerName;
	}
	
	@Column(length=26)
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	@Embedded
	public PatientAddress getAddrs() {
		return addrs;
	}
	public void setAddrs(PatientAddress addrs) {
		this.addrs = addrs;
	}
	
	
	@Override
	public String toString() {
		return "PatientInfo [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", addmisionDate=" + admisionDate + ", insuranceDetails=" + insuranceDetails + ", physicianName="
				+ physicianName + ", phNo=" + phNo + ", careTackerName=" + careTackerName + ", relationship="
				+ relationship + ", addrs=" + addrs + "]";
	}
}
