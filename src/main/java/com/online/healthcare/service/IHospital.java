package com.online.healthcare.service;

import com.online.healthcare.response.HospitalResponse;

public interface IHospital {
	
	
	public HospitalResponse getHospitalDetails(String hospitalName);
}
