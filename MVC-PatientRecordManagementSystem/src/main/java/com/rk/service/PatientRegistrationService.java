package com.rk.service;

import java.util.List;

import com.rk.dto.PatientInfo;

public interface PatientRegistrationService {

	public String doRegistration(PatientInfo info);
	
	public List<PatientInfo> getAllPatientData();
	
	public PatientInfo fetchPatientInfoById(int pId);
	
	
}
