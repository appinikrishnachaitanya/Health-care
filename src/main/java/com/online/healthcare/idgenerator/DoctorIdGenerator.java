package com.online.healthcare.idgenerator;

import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DoctorIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		Random random = new Random();
		int number = random.nextInt(1000, 100000);

		return "DOC" + number;
	}

}
