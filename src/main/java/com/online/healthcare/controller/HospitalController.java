package com.online.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.healthcare.response.HospitalResponse;
import com.online.healthcare.serviceimpl.IHospitalImpl;

@RestController
@RequestMapping("/api/v1/hospital")
public class HospitalController {
	
	@Autowired
	private IHospitalImpl hospitalService;
	
	@GetMapping
	public ResponseEntity<HospitalResponse> getHospitalDetails(@RequestParam(name = "hospitalName",required = true) String hospitalName)
	{
		return new ResponseEntity<HospitalResponse>(hospitalService.getHospitalDetails(hospitalName), HttpStatus.OK);
	}

}
