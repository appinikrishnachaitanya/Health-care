package com.online.healthcare.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.online.healthcare.dtos.PatientDto;
import com.online.healthcare.models.MemberEntity;
import com.online.healthcare.models.PatientEntity;
import com.online.healthcare.requests.MemberRequest;
import com.online.healthcare.requests.MemberRequestAdd;

public class MemberUtil {
	
	public static List<MemberEntity> memRequesttoEntity(MemberRequestAdd mem)
	{
	       List<MemberEntity> members = new ArrayList<>();
	       PatientEntity p = new PatientEntity();
	       PatientDto  pdto = mem.getPatient();
	       p.setPatientId(pdto.getPatientId());
	       members= mem.getMembers().stream().map((m)->{
	    	   
	    	   MemberEntity member = new MemberEntity();
	    	   BeanUtils.copyProperties(m, member);
	    	   member.setPatient(p);
	    	   return member;
	    	   
	       }).toList();
	       
	       return members;
	}
	
	public static MemberRequest memEntitytoDto(MemberEntity memberEntity)
	{
		MemberRequest mem= new MemberRequest();
		BeanUtils.copyProperties(memberEntity, mem);
		return mem;
	}

}
