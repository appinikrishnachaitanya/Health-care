package com.online.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.healthcare.customValidations.BloodGroupAnnotation;
import com.online.healthcare.dtos.PatientDto;
import com.online.healthcare.serviceimpl.Patientimpl;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/api/v1/patient")
@Validated
public class PatientController {
	
	@Autowired
	private Patientimpl patientService;
	
	@PostMapping
	public ResponseEntity<PatientDto> createPatient(@RequestBody @Valid PatientDto patientdto)
	{
		return new ResponseEntity<PatientDto>(patientService.createPatient(patientdto), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PatientDto> getPatientById(@PathVariable("id") String id)
	{
		
		return new ResponseEntity<PatientDto>(patientService.getPatientById(id.trim()), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<PatientDto>> getPatientsByBloodGroup(@RequestParam(name = "bloodgroup" , required = true) @BloodGroupAnnotation  String bloodgroupSearch)
	{   
		System.out.println(bloodgroupSearch);
		
		
		return new ResponseEntity<>(patientService.getPatientsByBloodGroup(bloodgroupSearch.trim()),HttpStatus.OK);
	}
	
    
	@GetMapping(path="/findPatient" )
	public ResponseEntity<List<PatientDto>> getAllPatientsByEmailOrPhone(@RequestParam(name = "findId",required = true) @NotEmpty String emailOrPhone)
	{  
		System.out.println(emailOrPhone);
		
		return new ResponseEntity<List<PatientDto>>(patientService.getPatientByEmaildOrPhoneNumber( emailOrPhone.trim() ), HttpStatus.OK);
	}

}
