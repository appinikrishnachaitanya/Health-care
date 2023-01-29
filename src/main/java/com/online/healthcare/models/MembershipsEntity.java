package com.online.healthcare.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Indexed;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="memberships",indexes = {
		@Index(columnList = "membershipName")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MembershipsEntity implements Serializable {


     @Id
	 @Column(name="membershipid",unique = true)
	 private String membershipId;
	 @Column(name="membershipname")
	 private String membershipName;
	 
	 @ManyToMany(mappedBy = "memberships")
	 private  List<DoctorEntity> doctors; 
}