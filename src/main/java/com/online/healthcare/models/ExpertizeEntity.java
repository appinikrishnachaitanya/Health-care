package com.online.healthcare.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="expertize",indexes = {
		
		@Index(columnList = "expertizeName")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExpertizeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	@Column(name="expertizename")
	private String expertizeName;
	
	@ManyToMany(mappedBy = "experts")
	private List<DoctorEntity> doctors;

}
