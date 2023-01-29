package com.online.healthcare.requests;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorByEmailorPhoneRequest implements Serializable {
	
	private String emailOrPhone;

	
	
}
