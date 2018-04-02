package com.rk.dao;

import java.util.List;

import com.rk.dto.PatientInfo;

public interface PatientRegistrationDAO {
	
	
	public int insertPatientInfo(PatientInfo info);
	
	public List<PatientInfo> getAllPatients();
	
	public PatientInfo getPatientInfoById(int pId);

}
