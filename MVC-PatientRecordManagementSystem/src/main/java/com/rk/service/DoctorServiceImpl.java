package com.rk.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dao.DoctorDAO;
import com.rk.dto.DoctorInfo;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

	private DoctorDAO doctorDAO;

	public DoctorServiceImpl(DoctorDAO doctorDAO) {
		super();
		this.doctorDAO = doctorDAO;
	}

	@Override
	@Transactional(transactionManager = "hbTxn", propagation = Propagation.REQUIRED)
	public String appointDoctor(DoctorInfo info) {
		String doctorId;

		doctorId = String.valueOf(doctorDAO.insertDoctorInfo(info));

		return "New Doctor appointed successfully and id is " + doctorId;
	}//method

}
