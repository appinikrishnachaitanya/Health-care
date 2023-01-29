package com.online.healthcare.service;

import java.util.List;

import com.online.healthcare.dtos.PatientDto;

public interface IPatient {
	
	
	public  PatientDto createPatient(PatientDto patientdto);
	
	public PatientDto getPatientById(String id);
	
	public PatientDto updatePatientById(String id,PatientDto patientdto);
	
	public String deleteById(String id);
	
	public List<PatientDto> getPatientsByBloodGroup(String bloodgroup);
	
	public List<PatientDto> getPatientByEmaildOrPhoneNumber(String EmailOrPhoneNumber );

}
