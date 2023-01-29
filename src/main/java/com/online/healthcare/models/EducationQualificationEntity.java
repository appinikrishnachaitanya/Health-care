package com.online.healthcare.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="educational")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EducationQualificationEntity implements Serializable {
	
	
	
	@Id
	@Column(name="collegerollno")
	private String collegeRollNo;
	
	@Column(name="collegname")
	private String collegeName;
	@Column(name="studyoffield")
	private String studyOfField;

}
