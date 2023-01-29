package com.online.healthcare.dtos;

import java.io.Serializable;
import java.util.List;

import com.online.healthcare.customValidations.BloodGroupAnnotation;
import com.online.healthcare.customValidations.GenderValidationAnnotation;
import com.online.healthcare.customValidations.HeightAndWeight;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto implements Serializable {

	private String patientId;

	@NotEmpty(message = "it is required field")
	@Size(min = 5, max = 20, message = "it should between 5 and 20")
	private String firstName;

	@NotEmpty(message = "it is required field")
	@Size(min = 5, max = 20, message = "it should between 5 and 20")
	private String lastName;

	@Email(message = "it is requried field")
	private String emailId;

	@NotEmpty
	@Size(min = 10, max = 10, message = "it should be between min and max")
	private String phoneNumber;

	@BloodGroupAnnotation
	private String bloodGroup;
	@HeightAndWeight
	private double weight;
	@HeightAndWeight
	private double height;

	@NotNull
	private int age;

	@GenderValidationAnnotation
	private String gender;

	private PhtotoDto photo;

	private List<LanguageDto> languages;
}
