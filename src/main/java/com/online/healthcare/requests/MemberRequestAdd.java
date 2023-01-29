package com.online.healthcare.requests;

import java.io.Serializable;
import java.util.List;

import com.online.healthcare.dtos.PatientDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestAdd implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MemberRequest> members;
	
	private PatientDto patient;
 
}
