/**
 * 
 */
package com.ninja.lms.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//import com.ninja.lms.entity.LmsBatchEntity;
import com.ninja.lms.entity.TblLmsProgram;



/**
 * 
 */

@Repository
public interface LmsProgramRepository extends JpaRepository<TblLmsProgram, Integer>{

	
}

