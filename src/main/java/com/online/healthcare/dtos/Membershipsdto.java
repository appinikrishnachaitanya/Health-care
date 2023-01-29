package com.online.healthcare.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Membershipsdto {
	
	
     @NotEmpty
	 private String membershipId;
	 @NotEmpty
	 private String membershipName;

}
