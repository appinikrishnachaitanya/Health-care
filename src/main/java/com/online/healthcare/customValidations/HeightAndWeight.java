package com.online.healthcare.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = HeightAndWeightLogic.class )
public @interface HeightAndWeight {
	
	public String message() default "{it must be greater than the zero}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
