/**
 * 
 */
package com.ninja.lms.entity;


import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@EnableJpaRepositories
public class TblLmsBatch {
	
	@Id
	 @GeneratedValue (strategy = GenerationType.AUTO)
Integer batchId;
	 String batchName;
	 String batchDescription;
	 String batchStatus;
	 Integer batchProgramId;
	 Integer batchNoOfClasses;
	 LocalDateTime creationTime;
	 LocalDateTime lastModTime;
	public void setCreationTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		this.creationTime = now;
		
	}
	public void setlastModTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		this.lastModTime= now;
		
	}
	public LocalDateTime getCreationTime() {
		// TODO Auto-generated method stub
		
		return this.creationTime;
		
	}
	public LocalDateTime getlastModTime() {
		// TODO Auto-generated method stub
		return this.lastModTime;
		
	}
	 

}
