package com.online.healthcare.utils;

import org.springframework.beans.BeanUtils;

import com.online.healthcare.dtos.PatientDto;
import com.online.healthcare.models.PatientEntity;

public class PatientUtil {
	
	
	public  static PatientDto convertEntitytoDto(PatientEntity patientEntity)
	{
		PatientDto patientdto = new PatientDto();
		BeanUtils.copyProperties(patientEntity, patientdto);
		return patientdto;
	}
	
	public static PatientEntity convertDtoToEntity(PatientDto patientdto)
	{
		PatientEntity patientEntity = new PatientEntity();
		BeanUtils.copyProperties(patientdto, patientEntity);
		return patientEntity;
	}

}
