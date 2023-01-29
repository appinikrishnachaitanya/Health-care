package com.online.healthcare.idgenerator;

import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PatientIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int range = random.nextInt(1000, 1000000);
	
		return "PAT"+range  ;
	}
	
	

}
