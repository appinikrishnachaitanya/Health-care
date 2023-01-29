package com.online.healthcare.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponse implements Serializable {

	private String doctorId;

	private String firstName;

	private String lastName;

	private String specality;

	private double experience;

	private String emailId;

	private String phoneNumber;

}
