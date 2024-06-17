/**
 * 
 */
package com.ninja.lms.jpa;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//import com.ninja.lms.entity.LmsBatchEntity;
import com.ninja.lms.entity.TblLmsBatch;

/**
 * 
 */
@Repository
public interface LmsBatchRepository extends JpaRepository<TblLmsBatch, Integer>{

	@Query(value = "SELECT * FROM public.tbl_lms_batch where tbl_lms_batch.batch_program_id=?1",
            nativeQuery = true)
	List<TblLmsBatch> findBatchByProgId(Integer Id);
}
