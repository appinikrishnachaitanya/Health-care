package com.online.healthcare.models;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.online.healthcare.enums.EnumStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctor" , indexes = {
		
		@Index(columnList = "emailId")
})
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorEntity implements Serializable {
	
	@Id
	@GenericGenerator(name = "docid",strategy = "com.online.healthcare.idgenerator.DoctorIdGenerator")
	@GeneratedValue(generator = "docid")
	@Column(name = "doctorid",updatable = false)
	private String doctorId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="specality")
	private String specality;
	@Column(name="experience")
	private double experience;
	@Column(name="emailid",unique = true)
	private String emailId;
	@Column(name = "phonenumber",unique = true)
	private String phoneNumber;
	@Column(name="pricepersession")
	private double pricePerSession;
	private boolean weekdays=false;
	@Column(name="medicalid")
	private String medicalId;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="p_id")
	private PhotoEntity photo;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="doc_lang",joinColumns = @JoinColumn(name="doctor_id"),inverseJoinColumns = @JoinColumn(name="lang_id"))
	private List<LanguagueEntity> languages;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "expertize_doc",joinColumns = @JoinColumn(name="doc_id"),inverseJoinColumns = @JoinColumn(name="exp_id"))
	private List<ExpertizeEntity> experts;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "doc_membership",joinColumns = @JoinColumn(name="doc_id"),inverseJoinColumns = @JoinColumn(name="mem_id"))
	private List<MembershipsEntity> memberships;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hospital_id")
	private HospitalEntity hospital;
	@OneToMany(mappedBy = "doctor")
	List<AppointmentEntity> appointments;
	@Enumerated(EnumType.STRING)
	private EnumStatus status=EnumStatus.OPEN;
	
	

}
