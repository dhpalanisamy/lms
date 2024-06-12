/**
 * 
 */
package com.ninja.lms.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ninja.lms.entity.LmsBatchEntity;
import com.ninja.lms.entity.TblLmsBatch;
import com.ninja.lms.entity.TblLmsProgram;
import com.ninja.lms.jpa.LmsBatchRepository;
import com.ninja.lms.jpa.LmsProgramRepository;


/**
 * 
 */
@RestController
@RequestMapping("/")
public class LmsController {
	
	@Autowired
	LmsBatchRepository lmsBatchRepository;
	@Autowired
	LmsProgramRepository lmsProgramRepository;
	
	List<Entity> entityList = new ArrayList<>();
	// Update batch Information
	
	// PUT
		 @PutMapping("/updating the existing resource/ batch/")
		 TblLmsBatch updateBatch (@RequestBody TblLmsBatch updatedBatch) {
			 updatedBatch.setlastModTime(LocalDateTime.now());
			 updatedBatch.setCreationTime(LocalDateTime.now());
			 System.out.println("%%%%%%%%TIMEEEEEEE CHECK@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + updatedBatch.getCreationTime());
			 System.out.println("%%%%%%%%updatedBatch data@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + updatedBatch.toString());
			 	 return lmsBatchRepository.save(updatedBatch);
		 }
		 
		// GET
			// Get Single Batch
			 @GetMapping("/Batch{id}")
			 Optional <TblLmsBatch> findBatch(@PathVariable Integer id){
			 return lmsBatchRepository.findById(id);
		 }
		 
		// POST
			// Create New program
			 @PostMapping("/Creating new resource/ program")
			 TblLmsProgram createNewProgram(@RequestBody TblLmsProgram newLmsProgram ) {
				 newLmsProgram.setCreationTime(LocalDateTime.now());
				 newLmsProgram.setlastModTime(LocalDateTime.now());
				return lmsProgramRepository.save(newLmsProgram);
			 }
		// DELETE
			 
			// Delete Single program
			 @DeleteMapping ("/deleting the existing resource/ program/{id}")
			 void deleteProgramEntry(@PathVariable Integer id){
				 lmsProgramRepository.deleteById(id);
			 }
			 @GetMapping("/GetAllBatchesWithProgramId{id}")
					 List<TblLmsBatch> findBatches(@PathVariable Integer id){
				 return lmsBatchRepository.findAll();
						 
					 }
}
