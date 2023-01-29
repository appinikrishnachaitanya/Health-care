package com.online.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.healthcare.dtos.DoctorDto;
import com.online.healthcare.requests.DoctorByEmailorPhoneRequest;
import com.online.healthcare.serviceimpl.IDoctorImpl;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
	
	@Autowired
	private IDoctorImpl doctorService;
	
	
	@PostMapping
	public ResponseEntity<DoctorDto> createDoctor(@RequestBody DoctorDto doctordto)
	
	{  
		System.out.println(doctordto.getHospital().getHospitalName());

		return new ResponseEntity<DoctorDto>(doctorService.createDoctor(doctordto), HttpStatus.OK);
	}
	
	
	@GetMapping("/{docid}")
	public ResponseEntity<DoctorDto> doctorgetById(@PathVariable("docid") String docid)
	{
		return new ResponseEntity<DoctorDto>(doctorService.getDoctorById(docid), HttpStatus.OK);
	}
	
	@PostMapping("/findByEmailorPhone")
	public ResponseEntity<DoctorDto> findDoctorByEmailOrPhone(@RequestBody DoctorByEmailorPhoneRequest doctorrequest)
	{
		return new ResponseEntity<DoctorDto>(doctorService.getDoctorByEmailPhone(doctorrequest.getEmailOrPhone()), HttpStatus.OK);
	}
	
	@GetMapping("{id}/status")
	public ResponseEntity<String> getApplicationStatus(@PathVariable("id") String docid)
	{
		return new ResponseEntity<String>(this.doctorService.getDoctorApplicationStatus(docid), HttpStatus.OK);
	}
	
	@GetMapping("/specality/{sp}")
	public ResponseEntity<List<DoctorDto>> getAllDoctorsBySpecality(@PathVariable("sp") String specality)
	{
		return new ResponseEntity<List<DoctorDto>>(this.doctorService.findDoctorsBySpecality(specality), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
