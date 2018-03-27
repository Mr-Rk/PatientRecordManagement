package com.rk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rk.dto.PatientInfo;

public class PatientRegistrationDAOImpl implements PatientRegistrationDAO {

	private SessionFactory factory;
	
	public PatientRegistrationDAOImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public int insertPatientInfo(PatientInfo info) {
        Session session=null;
        int generatedPatientId=0;
		//get  a session object.
		session=factory.getCurrentSession();
		//persisting the patient information.
		generatedPatientId=(int)session.save(info);
		
		//returning the generated patient id.
		return generatedPatientId;
	}//method

	@Override
	public List<PatientInfo> getAllPatients() {

		Session session=null;
		Criteria patientCriteria=null;
		List<PatientInfo>  patientList=null;
		
		
		//getting a session object from the sessionfactory.
		session=factory.getCurrentSession();
		
		//preparing the Criteria object.
		patientCriteria=session.createCriteria(PatientInfo.class);
		
		patientList=patientCriteria.list();
		
		
		return patientList;
	}//method

}//class
