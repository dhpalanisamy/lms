/**
 * 
 */
package com.ninja.lms.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class TblLmsProgram {

	@Id
	 @GeneratedValue (strategy = GenerationType.AUTO)
	 Integer programId;
	 String programName;
	 String programDescription;
	 String programStatus;
	 LocalDateTime creationTime;
	 LocalDateTime lastModTime;
	 
		public void setCreationTime(LocalDateTime timeNow) {
			// TODO Auto-generated method stub
			this.creationTime = timeNow;
			
		}
		public void setlastModTime(LocalDateTime timeNow) {
			// TODO Auto-generated method stub
			this.lastModTime= timeNow;
			
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
