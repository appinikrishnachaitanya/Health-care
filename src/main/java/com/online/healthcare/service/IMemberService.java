package com.online.healthcare.service;

import com.online.healthcare.requests.MemberRequest;
import com.online.healthcare.requests.MemberRequestAdd;

public interface IMemberService {
	
	public String addMembers(MemberRequestAdd mem);
	
	public MemberRequest getTheMember(String memid); 

}
