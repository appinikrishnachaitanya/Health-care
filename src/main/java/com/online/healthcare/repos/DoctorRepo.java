package com.online.healthcare.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.healthcare.dtos.DoctorDto;
import com.online.healthcare.models.DoctorEntity;

public interface DoctorRepo extends JpaRepository<DoctorEntity, String> {
	
	
	DoctorEntity findByEmailIdOrPhoneNumber(String emailId,String phoneNumber);
	
	@Query("select d from DoctorEntity d where specality =?1")
	List<DoctorEntity> findAllDoctorsBySpecality(String specality);

}
