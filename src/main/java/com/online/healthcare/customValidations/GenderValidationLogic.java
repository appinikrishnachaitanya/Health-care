package com.online.healthcare.customValidations;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidationLogic implements ConstraintValidator<GenderValidationAnnotation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		List<String> gender = Arrays.asList("M","F");
		
		if(gender.contains(value))
		{
			return true;
		}
		
		
		return false;
	}
	
	
	
	

}
