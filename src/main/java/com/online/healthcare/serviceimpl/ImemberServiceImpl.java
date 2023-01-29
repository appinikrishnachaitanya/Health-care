package com.online.healthcare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.healthcare.exception.ResourceNotFoundException;
import com.online.healthcare.models.MemberEntity;
import com.online.healthcare.repos.MemberRepository;
import com.online.healthcare.requests.MemberRequest;
import com.online.healthcare.requests.MemberRequestAdd;
import com.online.healthcare.service.IMemberService;
import com.online.healthcare.utils.MemberUtil;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ImemberServiceImpl implements IMemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public String addMembers(MemberRequestAdd mem) {
		
		List<MemberEntity> memRequesttoEntity = MemberUtil.memRequesttoEntity(mem);
		memberRepository.saveAll(memRequesttoEntity);
		
		
		return "Members are Added Successfully !!!!!";
	}

	@Override
	public MemberRequest getTheMember(String memid) {
		
		MemberEntity mem = memberRepository.findById(memid).orElseThrow( ()-> {return new ResourceNotFoundException("Resource not found");});
		MemberRequest memEntitytoDto = MemberUtil.memEntitytoDto(mem);
		return memEntitytoDto;
	}
	
	
	
	
}
