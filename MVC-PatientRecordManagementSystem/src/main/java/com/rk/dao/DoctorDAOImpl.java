package com.rk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.rk.dto.DoctorInfo;

@Repository(value="doctorDAO")
public class DoctorDAOImpl implements DoctorDAO {
	private SessionFactory sessionFactory;
	
	public DoctorDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	public long insertDoctorInfo(DoctorInfo info) {
         Session session=null;
         long doctorId;
         //obtain a session object.
         session=sessionFactory.getCurrentSession();
         
         //persisting the doctor info
         doctorId=(long)session.save(info);
         
         //returning the doctor id.
		return doctorId;
	}//method

}//class
