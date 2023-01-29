package com.online.healthcare.service;

import java.util.List;

import com.online.healthcare.dtos.DoctorDto;

public interface IDoctor {
	
	public DoctorDto createDoctor(DoctorDto doctordto);
	public DoctorDto getDoctorById(String docid);
	public DoctorDto updateDoctorById(String docid , DoctorDto doctordto);
	public void deleteDoctorById(String docid);
	
	public DoctorDto getDoctorByEmailPhone(String emailOrPhone);
	
	public String getDoctorApplicationStatus(String docid);
	
	public List<DoctorDto> findDoctorsBySpecality(String specality);

	

}
