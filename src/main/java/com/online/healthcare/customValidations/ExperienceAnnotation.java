package com.online.healthcare.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ExperienceLogic.class)
public @interface ExperienceAnnotation {
	
	String message() default "{Experience should be more than 3 years}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	

}
