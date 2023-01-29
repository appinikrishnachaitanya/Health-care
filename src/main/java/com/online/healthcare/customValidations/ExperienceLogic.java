package com.online.healthcare.customValidations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExperienceLogic implements ConstraintValidator<ExperienceAnnotation, Double> {

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
	   
		 if(value >= 3.0)
		 {
			 return true;
		 }
		
		
		return false;
	}
	
	

}
