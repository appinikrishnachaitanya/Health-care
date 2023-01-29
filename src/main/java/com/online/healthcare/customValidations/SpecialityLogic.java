package com.online.healthcare.customValidations;

import java.util.Arrays;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SpecialityLogic implements ConstraintValidator<SpecalityAnnotation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		return Arrays.asList("LUNGS","SKIN","HAIR","HEART","BRAIN").contains(value);
	}
	
	

}
