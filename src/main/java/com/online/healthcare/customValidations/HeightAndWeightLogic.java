package com.online.healthcare.customValidations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HeightAndWeightLogic implements ConstraintValidator<HeightAndWeight, Double> {

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		
		
		if(value > 0.0)
		{
			return true;
		}
		
		
		return false;
	}

}
