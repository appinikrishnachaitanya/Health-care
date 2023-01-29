package com.online.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.healthcare.requests.MemberRequest;
import com.online.healthcare.requests.MemberRequestAdd;
import com.online.healthcare.serviceimpl.ImemberServiceImpl;

@RestController
@RequestMapping("/api/members/v1")
public class MemberController {
	
	@Autowired
	private ImemberServiceImpl memberservice;
	
	@PostMapping
	public ResponseEntity<String> addMembers(@RequestBody MemberRequestAdd mem)
	{
		return new ResponseEntity<String>(memberservice.addMembers(mem), HttpStatus.OK);
	}
	
	@GetMapping("/{memid}")
	public ResponseEntity<MemberRequest> getMember(@PathVariable("memid") String memid)
	{
		return new ResponseEntity<MemberRequest>(memberservice.getTheMember(memid), HttpStatus.OK);
	}
	
   

}
