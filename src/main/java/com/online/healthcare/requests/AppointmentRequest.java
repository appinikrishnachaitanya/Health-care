package com.online.healthcare.requests;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.online.healthcare.customValidations.AppointmentDateAnnotation;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AppointmentRequest implements Serializable {
	
	@NotEmpty
	private String doctorId;
	@NotEmpty
    private String patientId;
    
    @JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd")
    @AppointmentDateAnnotation
    private LocalDate date;
    @JsonFormat(shape=Shape.STRING,pattern = "HH:MM")
    private LocalTime time;
	@Override
	public String toString() {
		return "AppointmentRequest [doctorId=" + doctorId + ", patientId=" + patientId + ", date=" + date + ", time="
				+ time + "]";
	}
    
    

}
