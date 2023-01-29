package com.online.healthcare.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.healthcare.dtos.DoctorDto;
import com.online.healthcare.exception.ResourceNotFoundException;
import com.online.healthcare.models.DoctorEntity;
import com.online.healthcare.repos.DoctorRepo;
import com.online.healthcare.service.IDoctor;
import com.online.healthcare.utils.DoctorUtil;

import jakarta.annotation.PostConstruct;

@Service
public class IDoctorImpl implements IDoctor {
	
	
	@Autowired
	private DoctorRepo doctorrepo;
	
	public static Logger logger = LoggerFactory.getLogger(IDoctorImpl.class);
	
	
	
	

	@Override
	public DoctorDto createDoctor(DoctorDto doctordto) {
		System.out.println(doctordto.getHospital().getHospitalName());
		DoctorEntity request = DoctorUtil.covertDtoToEntity(doctordto);
		//request.setHospital(doctordto.getHospital());
		System.out.println(request.getHospital().getHospitalName());
		DoctorEntity response = doctorrepo.save(request);
	
		return DoctorUtil.convertEntityToDoctor(response);
	}

	@Override
	public DoctorDto getDoctorById(String docid) throws ResourceNotFoundException {
		
		DoctorEntity response = doctorrepo.findById(docid).orElseThrow(()->{ return new ResourceNotFoundException("Unable to find, try later");});		
		
		return DoctorUtil.convertEntityToDoctor(response);
	}

	@Override
	public DoctorDto updateDoctorById(String docid, DoctorDto doctordto) {
	
		return null;
	}

	@Override
	public void deleteDoctorById(String docid) {
		
		
	}

	@Override
	public DoctorDto getDoctorByEmailPhone(String emailOrPhone) {
		
		DoctorEntity doctor = this.doctorrepo.findByEmailIdOrPhoneNumber(emailOrPhone, emailOrPhone);
		DoctorDto response = DoctorUtil.convertEntityToDoctor(doctor);
		return response;
	}

	@Override
	public String getDoctorApplicationStatus(String docid) {
		
		DoctorEntity response = this.doctorrepo.findById(docid).orElseThrow(()->{return new ResourceNotFoundException("Unable to find, try later");});
		String status = response.getStatus().toString();
		return status  ;
	}

	@Override
	public List<DoctorDto> findDoctorsBySpecality(String specality) {
		
		List<DoctorEntity> doctors = this.doctorrepo.findAllDoctorsBySpecality(specality);
		List<DoctorDto> responses =  doctors.stream().map(DoctorUtil::convertEntityToDoctor).toList();
		
		return responses;
	}
	
	

}
