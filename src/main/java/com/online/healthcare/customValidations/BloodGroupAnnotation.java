package com.online.healthcare.customValidations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = BloodGroupValidation.class)
public @interface BloodGroupAnnotation {
	//add the groups
	
	String message() default "it should be valid blood group";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	
}
