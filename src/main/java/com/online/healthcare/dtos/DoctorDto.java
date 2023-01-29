package com.online.healthcare.dtos;

import java.io.Serializable;
import java.util.List;

import com.online.healthcare.customValidations.ExperienceAnnotation;
import com.online.healthcare.customValidations.GenderValidationAnnotation;
import com.online.healthcare.customValidations.SpecalityAnnotation;
import com.online.healthcare.models.MembershipsEntity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto implements Serializable {

	private String doctorId;

	@NotEmpty(message = "it is required field")
	@Size(min = 3, max = 20)
	private String firstName;

	@NotEmpty(message = "it is required field")
	@Size(min = 3, max = 20)
	private String lastName;

	@SpecalityAnnotation
	private String specality;

	@ExperienceAnnotation
	private double experience;

	@Email
	private String emailId;

	@NotEmpty(message = "it is required field annotation")
	@Size(min = 10, max = 10, message = "it should be valid phone number")
	private String phoneNumber;
	
	@GenderValidationAnnotation
	private String gender;
	
	private double pricePerSession;
	
	private boolean weekdays ;
	
	@NotEmpty(message="it is manadatory field")
	private String medicalId;

	@NotNull
	private int age;
	
	
	private HospitalDto hospital;

	private List<Membershipsdto> memberships;
	
	private List<ExpertizeDtos> experts;
	
	private List<LanguageDto> languages;
	
	private PhtotoDto photo;

}
