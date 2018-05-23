package com.rk.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rk.dto.DoctorInfo;
import com.rk.service.DoctorService;

@Controller
public class DoctorController {
	
	DoctorService doctorService;
	
	public DoctorController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@InitBinder
	public void bindDate(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		//register the customDateEditor object.
		binder.registerCustomEditor(Date.class, "dob",new CustomDateEditor(sdf, false));
	}

	//assinging the docotor specialists designations.
	@ModelAttribute(name="specialistTypes")
	public List<String> assignDoctorSpecilists(Model data) {
		List<String> specialistList=new ArrayList();
		
		//add specialists
		specialistList.add("Phycologist");
		specialistList.add("Dentist");
		specialistList.add("Orthoacid");
		
		 return  specialistList;
	}//method
	
	@RequestMapping(value="/lunch-doctor-signup-form.htm",method=RequestMethod.GET)
	public String doctorSignUpLunch(Model data) {
		data.addAttribute("doctorData", new DoctorInfo());
		return "register-doctor";
	}
	
	@RequestMapping(value="doctorRegistration.htm",
			                        method=RequestMethod.POST)
	public String registerDoctor(@ModelAttribute("doctorData") DoctorInfo doctorInfo,
			                             Model status) {
		
		//invoking the service layer method.
		status.addAttribute("status", doctorService.appointDoctor(doctorInfo));
		
		
		return "doctor_regd_success";
	}
	

}
