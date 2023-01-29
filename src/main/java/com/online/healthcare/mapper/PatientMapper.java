package com.online.healthcare.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PatientMapper {

	
	public static String JsonMapper(Object obj) throws RuntimeException
	{
		try {
			
			ObjectMapper Mapper = new ObjectMapper();
			return Mapper.writeValueAsString(obj);
			
		} catch (Exception e) {
			
			throw new RuntimeException("Coversion is failed");
			
		}
	}

}
