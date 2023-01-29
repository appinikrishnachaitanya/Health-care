package com.online.healthcare.dtos;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDto {

	private String hospitalName;
	@NotEmpty(message = "it should be valid")
	@Size(min=3,max=10,message = "it should be between the 3 and 10")
	private String street;
	@NotEmpty(message = "it should be valid")
	@Size(min=3,max=10,message = "it should be between the 3 and 10")
	private String landmark;
	@NotEmpty(message = "it should be valid")
	@Size(min=3,max=10,message = "it should be between the 3 and 10")
	private String city;
	@NotEmpty(message = "it should be valid")
	@Size(min=3,max=10,message = "it should be between the 3 and 10")
	private String state;
	@NotEmpty(message = "it should be valid")
	@Size(min=3,max=10,message = "it should be between the 3 and 10")
	private String country;
	@NotEmpty(message = "it should be valid")
	@Size(min=6,max=6)
	private String pincode;
	

}
