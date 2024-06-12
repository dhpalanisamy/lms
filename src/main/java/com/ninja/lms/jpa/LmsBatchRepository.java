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
import com.ninja.lms.entity.TblLmsBatch;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 
 */
@Repository
public interface LmsBatchRepository extends JpaRepository<TblLmsBatch, Integer>{

	
}
