package com.rk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk.dto.PatientInfo;
import com.rk.service.PatientRegistrationService;

@Controller
public class PatientController {
	
	private PatientRegistrationService patientService;
	
	public PatientController(PatientRegistrationService patientService) {
		super();
		this.patientService = patientService;
	}


	@InitBinder
	public void bindData(WebDataBinder dataBinder) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy");
		dataBinder.registerCustomEditor(Date.class, "admisionDate", 
				new CustomDateEditor(dateFormat, false));
		
		
		
	}
	
	
	@RequestMapping(value="/home.htm")
	public String lunchPatientInfoForm() {
		return "patient-register";
	}
	
	@RequestMapping(value="doRegistration.htm")
	public String doPatientRegistration(@ModelAttribute PatientInfo patientInfo,
			                                            Model model,HttpServletRequest request) {
		if(patientInfo!=null) {
			String ptientRegdStatus = patientService.doRegistration(patientInfo);
			
		model.addAttribute("regdStatus", ptientRegdStatus);
		}//if
		else {
			model.addAttribute("regdFail", "Patient information registration failed.Try again.");
		}
		
		return "result";
	}//method

}
