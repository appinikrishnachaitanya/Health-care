package com.online.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.healthcare.requests.AppointmentRequest;
import com.online.healthcare.serviceimpl.IAppointmentImpl;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
	
	@Autowired
	private IAppointmentImpl appointment;
	
	public static Logger logger = LoggerFactory.getLogger(AppointmentController.class);
	
	@PostMapping
	public ResponseEntity createAppointment(@RequestBody AppointmentRequest appointmentRequest)
	{
		logger.info(appointmentRequest.toString());
		appointment.CreateAppointment(appointmentRequest);
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
