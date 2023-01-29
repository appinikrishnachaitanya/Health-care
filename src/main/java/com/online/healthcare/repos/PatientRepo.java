package com.online.healthcare.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.healthcare.models.PatientEntity;

public interface PatientRepo extends JpaRepository<PatientEntity, String> {
	
	
	
	@Query("select p from PatientEntity p where bloodGroup =:bloodGroup")
	public List<PatientEntity> findPatientByBloodGroup(String bloodGroup);
	
	public List<PatientEntity> findByEmailIdOrPhoneNumber(String emaild , String phoneNumber);
	
	
	
	

}
