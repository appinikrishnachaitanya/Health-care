package com.online.healthcare.idgenerator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.online.healthcare.models.AppointmentEntity;

public class AppointmentIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		
		AppointmentEntity appointment = (AppointmentEntity) object;
		System.out.println(appointment.getDate());
		return  appointment.getPatient().getPatientId()+appointment.getDoctor().getDoctorId();
	}

	

}
