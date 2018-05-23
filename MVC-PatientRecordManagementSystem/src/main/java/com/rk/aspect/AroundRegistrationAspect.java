package com.rk.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundRegistrationAspect {

	private Logger logger;
	
	public AroundRegistrationAspect() {
        logger=Logger.getLogger(AroundRegistrationAspect.class);
	}
	
	
	@Around(value="execution(* com.rk.service.DoctorServiceImpl.appointDoctor(..))")
	public Object aroundRegistration(ProceedingJoinPoint pjp) throws Throwable {
		String regdStatus=null;
		logger.debug("  "+pjp.getSignature());
		System.out.println(pjp.getSignature());
		logger.debug("Controll going into the "+pjp.getTarget());
		
		regdStatus=(String)pjp.proceed();
		
		logger.info(regdStatus);
		
		logger.debug("Controll came outside of the "+pjp.getStaticPart());
		
		return regdStatus;
	}
	
}
