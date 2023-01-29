package com.online.healthcare.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.healthcare.dtos.PatientDto;
import com.online.healthcare.exception.ResourceNotFoundException;
import com.online.healthcare.models.PatientEntity;
import com.online.healthcare.repos.PatientRepo;
import com.online.healthcare.requests.BloodGroupSearchRequest;
import com.online.healthcare.service.IPatient;
import com.online.healthcare.utils.PatientUtil;

@Service
public class Patientimpl implements IPatient {
	
	
	@Autowired
	private PatientRepo patientCrud;

	@Override
	public PatientDto createPatient(PatientDto patientdto) {
		
		PatientEntity request = PatientUtil.convertDtoToEntity(patientdto);
		PatientEntity reponse = patientCrud.save(request);
		
	
		return PatientUtil.convertEntitytoDto(reponse);
	}

	@Override
	public PatientDto getPatientById(String id) throws ResourceNotFoundException {
		
		PatientEntity response = patientCrud.findById(id).orElseThrow(()->{return new ResourceNotFoundException("Resouce not Found");});
		
		return PatientUtil.convertEntitytoDto(response);
	
	}

	@Override
	public PatientDto updatePatientById(String id, PatientDto patientdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(String id) {
		
		
		
		
		return null;
	}

	@Override
	public List<PatientDto> getPatientsByBloodGroup(String bloodgroup) {
		List<PatientEntity> responses = patientCrud.findPatientByBloodGroup(bloodgroup);
		List<PatientDto> patients = responses.stream().map(PatientUtil::convertEntitytoDto).collect(Collectors.toList());
		return patients;
	}

	@Override
	public List<PatientDto> getPatientByEmaildOrPhoneNumber(String EmailOrPhoneNumber) {
		
		List<PatientEntity> responses = patientCrud.findByEmailIdOrPhoneNumber(EmailOrPhoneNumber,EmailOrPhoneNumber);
		List<PatientDto> patients = responses.stream().map(PatientUtil::convertEntitytoDto).collect(Collectors.toList());
		return patients;
	}
	
	
	

}
