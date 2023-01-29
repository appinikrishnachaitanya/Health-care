package com.online.healthcare.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.healthcare.dtos.HospitalDto;
import com.online.healthcare.models.HospitalEntity;

public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {
	
	
	public  HospitalEntity  findByHospitalName(String hospitalName);
	
	
	


}
