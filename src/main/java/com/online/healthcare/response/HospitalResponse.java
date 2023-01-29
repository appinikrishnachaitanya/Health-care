package com.online.healthcare.response;

import java.io.Serializable;
import java.util.List;

import com.online.healthcare.dtos.DoctorDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalResponse implements Serializable {
	
	
	private String hospitalName;

	private String street;
	
	private String landmark;

	private String city;
	
	private String state;
	
	private String country;
	
	private String pincode;
	
	private List<DoctorResponse> doctors; 

}
