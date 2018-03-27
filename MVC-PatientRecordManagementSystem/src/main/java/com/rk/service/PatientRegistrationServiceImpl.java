package com.rk.service;

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

}//class