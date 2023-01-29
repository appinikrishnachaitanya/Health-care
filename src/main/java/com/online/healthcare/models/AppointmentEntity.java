package com.online.healthcare.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="appointments")
public class AppointmentEntity {
    
	
	@Id
	@GenericGenerator(name = "appointment_pk",strategy = "com.online.healthcare.idgenerator.AppointmentIdGenerator")
	@GeneratedValue(generator = "appointment_pk")
	private String appointmentId;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private DoctorEntity doctor;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private PatientEntity patient;
	private LocalDate date;
	private LocalTime time;
	@CreatedDate
	private LocalDate createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
