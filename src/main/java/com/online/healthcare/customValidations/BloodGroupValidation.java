package com.online.healthcare.customValidations;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BloodGroupValidation implements ConstraintValidator<BloodGroupAnnotation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		List<String> bloodgroups = Arrays.asList("AB+","AB-","O+","O-","A+","A-","B+","B-");
		
		
		return bloodgroups.contains(value);
	}

}
