package com.online.healthcare.idgenerator;

import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.util.IdGenerator;

public class MemberIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Random random = new Random();
		int number = random.nextInt(99999, 999999);
		
		
		return "MEM"+number;
	}
	
	

}
