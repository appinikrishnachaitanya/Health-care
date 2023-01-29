package com.online.healthcare.dtos;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExpertizeDtos implements Serializable {
  
	
	@NotEmpty
	private String expertizeName;

} 
