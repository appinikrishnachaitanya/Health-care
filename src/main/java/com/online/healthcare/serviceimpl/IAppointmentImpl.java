package com.online.healthcare.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.healthcare.models.AppointmentEntity;
import com.online.healthcare.models.DoctorEntity;
import com.online.healthcare.models.PatientEntity;
import com.online.healthcare.repos.AppointmentRepository;
import com.online.healthcare.requests.AppointmentRequest;
import com.online.healthcare.service.IAppointment;

@Service
public class IAppointmentImpl implements IAppointment {

	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@Override
	public void CreateAppointment(AppointmentRequest appointmentRequest) {
		
		AppointmentEntity appointment = new AppointmentEntity();
		appointment.setDate(appointmentRequest.getDate());
		appointment.setTime(appointmentRequest.getTime());
		PatientEntity patient = new PatientEntity();
		patient.setPatientId(appointmentRequest.getPatientId());
		DoctorEntity doctor = new DoctorEntity();
		doctor.setDoctorId(appointmentRequest.getDoctorId());
		appointment.setDoctor(doctor);
		appointment.setPatient(patient);
		
		appointmentRepo.save(appointment);
		
	}
	

}
