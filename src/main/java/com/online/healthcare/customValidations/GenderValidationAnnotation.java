package com.online.healthcare.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.Payload;


@Target({ ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Validated(GenderValidationLogic.class)
public @interface GenderValidationAnnotation {
	
	String message() default "{Should be a valid gender}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
