package com.online.healthcare.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hospitals",indexes = {
		@Index(columnList = "hospitalName")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "hospitalname",unique = true)
	private String hospitalName;

	private String street;

	private String landmark;

	private String city;

	private String state;

	private String country;

	private String pincode;
	
	@OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
	private List<DoctorEntity> doctors;
	
	
	
	

}
