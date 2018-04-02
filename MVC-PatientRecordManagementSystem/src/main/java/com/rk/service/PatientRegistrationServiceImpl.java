package com.rk.service;

import java.util.List;

import com.rk.dao.PatientRegistrationDAO;
import com.rk.dto.PatientInfo;

public class PatientRegistrationServiceImpl implements PatientRegistrationService {

	private PatientRegistrationDAO patientRegistrationDAO;
	
	public PatientRegistrationServiceImpl(PatientRegistrationDAO patientRegistrationDAO) {
		this.patientRegistrationDAO = patientRegistrationDAO;
	}

	@Override
	public String doRegistration(PatientInfo info) {
		int patientId=0;
		
		//invoking the persist method.
		patientId=patientRegistrationDAO.insertPatientInfo(info);
		
		return "The patient info registred successfull and patient id is "+patientId;
	}//method

	@Override
	public List<PatientInfo> getAllPatientData() {
		return patientRegistrationDAO.getAllPatients();
	}

	@Override
	public PatientInfo fetchPatientInfoById(int pId) {
		
		return patientRegistrationDAO.getPatientInfoById(pId);
	}//method

}//class
