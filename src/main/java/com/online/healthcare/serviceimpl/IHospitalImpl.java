package com.online.healthcare.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.healthcare.models.HospitalEntity;
import com.online.healthcare.repos.HospitalRepository;
import com.online.healthcare.response.DoctorResponse;
import com.online.healthcare.response.HospitalResponse;
import com.online.healthcare.service.IHospital;

@Service
public class IHospitalImpl implements IHospital {

	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	
	@Override
	public HospitalResponse getHospitalDetails(String hospitalName) {
		
	 HospitalEntity response = 	hospitalRepository.findByHospitalName(hospitalName);
	 List<DoctorResponse> doctors = response.getDoctors().stream().map((doc)->{
		 
		 DoctorResponse doctor = new DoctorResponse();
		 doctor.setDoctorId(doc.getDoctorId());
		 doctor.setFirstName(doc.getFirstName());
		 doctor.setLastName(doc.getLastName());
		 doctor.setEmailId(doc.getEmailId());
		 doctor.setPhoneNumber(doc.getPhoneNumber());
		 doctor.setExperience(doc.getExperience());
		 doctor.setSpecality(doc.getSpecality());
		 return doctor;
		 
	 }).collect(Collectors.toList());
	 HospitalResponse hospital = new HospitalResponse();
	 hospital.setHospitalName(response.getHospitalName());
	 hospital.setStreet(response.getStreet());
	 hospital.setLandmark(response.getLandmark());
	 hospital.setCity(response.getCity());
	 hospital.setCountry(response.getCountry());
	 hospital.setState(response.getState());
	 hospital.setPincode(response.getPincode());
	 hospital.setDoctors(doctors);
		
		return hospital;
	}
	
	

}
