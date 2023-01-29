package com.online.healthcare.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.online.healthcare.dtos.DoctorDto;
import com.online.healthcare.dtos.ExpertizeDtos;
import com.online.healthcare.dtos.HospitalDto;
import com.online.healthcare.dtos.LanguageDto;
import com.online.healthcare.dtos.Membershipsdto;
import com.online.healthcare.dtos.PhtotoDto;
import com.online.healthcare.models.DoctorEntity;
import com.online.healthcare.models.ExpertizeEntity;
import com.online.healthcare.models.HospitalEntity;
import com.online.healthcare.models.LanguagueEntity;
import com.online.healthcare.models.MembershipsEntity;
import com.online.healthcare.models.PhotoEntity;

public class DoctorUtil {
	
	
	public static DoctorDto convertEntityToDoctor(DoctorEntity doctorentity)
	{
		DoctorDto doctordto = new DoctorDto();
		HospitalDto hospitaldto = new HospitalDto();
		HospitalEntity hospitalEntity = doctorentity.getHospital();
		List<MembershipsEntity> members = doctorentity.getMemberships();
		List<Membershipsdto> memberdtos = new ArrayList<>();
		List<ExpertizeDtos> expertize = new ArrayList<>();
		List<ExpertizeEntity> expertizeEntities = doctorentity.getExperts();
		List<LanguageDto> langaugeDtos = new ArrayList<>();
		List<LanguagueEntity> languages = doctorentity.getLanguages();
		PhtotoDto photodto = new PhtotoDto();
		PhotoEntity photo = doctorentity.getPhoto();
		photodto.setUrl(photo.getUrl());
		doctordto.setPhoto(photodto);
		hospitaldto.setHospitalName(hospitalEntity.getHospitalName());
		hospitaldto.setStreet(hospitalEntity.getStreet());
		hospitaldto.setLandmark(hospitalEntity.getLandmark());
		hospitaldto.setCity(hospitalEntity.getCity());
		hospitaldto.setState(hospitalEntity.getState());
		hospitaldto.setCountry(hospitalEntity.getCountry());
		hospitaldto.setPincode(hospitalEntity.getPincode());
		BeanUtils.copyProperties(doctorentity, doctordto);
	    doctordto.setHospital(hospitaldto);
	    memberdtos = members.stream().map((mem)->{
	    	
	    	Membershipsdto m = new Membershipsdto();
	    	m.setMembershipName(mem.getMembershipName());
	    	m.setMembershipId(mem.getMembershipId());
	    	return m;
	    }).collect(Collectors.toList());
	    expertize= expertizeEntities.stream().map((e)->{
	        
	    	 ExpertizeDtos exp = new ExpertizeDtos();
	    	 exp.setExpertizeName(e.getExpertizeName());
	    	 return exp;
	    }).collect(Collectors.toList());
	    langaugeDtos=  languages.stream().map((l)->{
	    	LanguageDto lang = new LanguageDto();
	    	lang.setLanguage(l.getLanguage());
	    	return lang;
	    }).toList();
	    doctordto.setLanguages(langaugeDtos);
		doctordto.setMemberships(memberdtos);
		doctordto.setExperts(expertize);
		return doctordto;
		
	
	}
	
	
	public static DoctorEntity covertDtoToEntity(DoctorDto doctordto)
	{
		DoctorEntity doctorEntity = new DoctorEntity();
		HospitalEntity hospital = new HospitalEntity();
		List<MembershipsEntity> members =  new ArrayList<>();
		List<Membershipsdto> memberdtos = doctordto.getMemberships();
		HospitalDto hospitaldto = doctordto.getHospital();
		List<ExpertizeDtos> expertize = doctordto.getExperts();
		List<ExpertizeEntity> expertizeEntities = new ArrayList<>();
		List<LanguageDto> langaugeDtos = doctordto.getLanguages();
		List<LanguagueEntity> languages = new ArrayList<>();
		PhtotoDto photodto = doctordto.getPhoto();
		PhotoEntity photo = new PhotoEntity();
		photo.setId(photodto.getUrl());
		doctorEntity.setPhoto(photo);
		
		hospital.setHospitalName(hospitaldto.getHospitalName());
		hospital.setStreet(hospitaldto.getStreet());
		hospital.setLandmark(hospitaldto.getLandmark());
		hospital.setCity(hospitaldto.getCity());
		hospital.setState(hospitaldto.getState());
		hospital.setCountry(hospitaldto.getCountry());
		hospital.setPincode(hospitaldto.getPincode());
		BeanUtils.copyProperties(doctordto, doctorEntity);
		doctorEntity.setHospital(hospital);
        members = memberdtos.stream().map((mem)->{
	    	
	    	MembershipsEntity m = new MembershipsEntity();
	    	m.setMembershipName(mem.getMembershipName());
	    	m.setMembershipId(mem.getMembershipId());
	    	return m;
	    }).collect(Collectors.toList());
        expertizeEntities= expertize.stream().map((e)->{
	        
	    	 ExpertizeEntity exp = new ExpertizeEntity();
	    	 exp.setExpertizeName(e.getExpertizeName());
	    	 return exp;
	    }).collect(Collectors.toList());
        
        languages=  langaugeDtos.stream().map((l)->{
	    	LanguagueEntity lang = new LanguagueEntity();
	    	lang.setLanguage(l.getLanguage());
	    	return lang;
	    }).toList();
        
        doctorEntity.setLanguages(languages);
        doctorEntity.setMemberships(members);
        doctorEntity.setExperts(expertizeEntities);
        

		return doctorEntity;
	}

}
