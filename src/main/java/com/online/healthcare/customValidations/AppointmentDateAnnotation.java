package com.online.healthcare.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ApoointmentDateLogic.class)
public @interface AppointmentDateAnnotation {
	
	
	String message() default "The date should be within 15 days from today";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	
	

}
