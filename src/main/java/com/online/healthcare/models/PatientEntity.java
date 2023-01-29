package com.online.healthcare.models;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.online.healthcare.dtos.LanguageDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="patients",indexes = {
		@Index(columnList = "emailId")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8062663018615164983L;
	@Id
	@GenericGenerator(strategy = "com.online.healthcare.idgenerator.PatientIdGenerator",name = "patient_pk")
	@GeneratedValue(generator = "patient_pk")
	@Column(name="patientid")
	private String patientId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="emailid")
	private String emailId;
	@Column(name="phoneNumber")
	private String phoneNumber;
	@Column(name="bloodgroup")
	private String bloodGroup;
	@Column(name="weight")
	private double weight;
	@Column(name="height")
	private double height;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@OneToOne
	@JoinColumn(name="p_id")
	private PhotoEntity photo;
	
	@ManyToMany
	@JoinTable(name = "pat_lang",joinColumns = @JoinColumn(name="pat_id"),inverseJoinColumns = @JoinColumn(name="lang_id"))
	private List<LanguagueEntity> langauges;
	
	
	@OneToMany(mappedBy = "patient")
	List<AppointmentEntity> appointments;
	
	@OneToMany(mappedBy = "patient")
	List<MemberEntity> members;
	
	
	

}
