package com.rk.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="doctor_info")
public class DoctorInfo {

	private long doctorId;
	private String doctorName;
	private int expr;
	private Date dob;
	private long phno;
	private String specialist;
	
	@Id
	@SequenceGenerator(name="doctor_id",
	                   allocationSize=1,
	                   initialValue=5,
	                   sequenceName="doctor_id"
	                   )
	@GeneratedValue(generator="doctor_id")
	@Column(length=38)
	@Type(type="long")
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	
	@Column(length=22)
	@Type(type="string")
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	@Column(length=10)
	@Type(type="int")
	public int getExpr() {
		return expr;
	}
	public void setExpr(int expr) {
		this.expr = expr;
	}
	
	@Type(type="date")
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(length=22)
	@Type(type="long")
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	@Column(length=19)
	@Type(type="string")
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	
	@Override
	public String toString() {
		return "DoctorInfo [doctorId=" + doctorId + ", doctorName=" + doctorName + ", expr=" + expr + ", dob=" + dob
				+ ", phno=" + phno + ", specialist=" + specialist + "]";
	}

}
