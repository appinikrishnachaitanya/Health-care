package com.online.healthcare.customValidations;

import java.time.LocalDate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ApoointmentDateLogic implements ConstraintValidator<AppointmentDateAnnotation, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		LocalDate nowDate = LocalDate.now();
		nowDate = nowDate.plusDays(15);
		
		if(value.isBefore(nowDate))
		{
			return true;
		}
		
		
		return false;
	}
	
	
	
	
	

}
