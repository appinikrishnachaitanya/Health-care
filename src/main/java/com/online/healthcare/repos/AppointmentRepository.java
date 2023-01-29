package com.online.healthcare.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.healthcare.models.AppointmentEntity;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, String> {
	
	

}
