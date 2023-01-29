package com.online.healthcare.models;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "members",indexes = {
		@Index(columnList = "firstName")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
	
	
	@Id
	@GenericGenerator(name = "mem_pk",strategy = "com.online.healthcare.idgenerator.MemberIdGenerator")
	@GeneratedValue(generator = "mem_pk")
	private String MemberId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="height")
	private String Height;
	@Column(name="weight")
	private String weight;
	@Column(name="bloodgroup")
	private String bloodGroup;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private PatientEntity patient;

}
