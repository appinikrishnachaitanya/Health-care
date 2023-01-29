package com.online.healthcare.requests;

import java.io.Serializable;

import com.online.healthcare.customValidations.BloodGroupAnnotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BloodGroupSearchRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@BloodGroupAnnotation
	private String BloodGroup;

}
