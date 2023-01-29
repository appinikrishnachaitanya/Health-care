package com.online.healthcare.requests;

import java.io.Serializable;

import com.online.healthcare.customValidations.BloodGroupAnnotation;
import com.online.healthcare.customValidations.GenderValidationAnnotation;
import com.online.healthcare.customValidations.HeightAndWeight;
import com.online.healthcare.dtos.PatientDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotNull
	private int age;
	
	@GenderValidationAnnotation
	private String gender;

	@HeightAndWeight
	private double weigth;

	@HeightAndWeight
	private double height;

	@BloodGroupAnnotation
	private String bloodGroup;

}
