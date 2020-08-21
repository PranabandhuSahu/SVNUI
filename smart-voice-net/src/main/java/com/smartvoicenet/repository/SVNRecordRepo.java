package com.smartvoicenet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smartvoicenet.model.InspectionResultEntity;

@Repository
public interface SVNRecordRepo extends CrudRepository<InspectionResultEntity, String> {

	Optional<InspectionResultEntity> findByInspectionId(String inspectionId);

	InspectionResultEntity save(InspectionResultEntity entity);
	
	@Transactional
	@Modifying
	@Query("update InspectionResultEntity entity set entity.inspectionResultUpdate =:inspectionResultUpdate where entity.inspectionId =:inspectionId")
	void updateInspectionResultEntity(@Param("inspectionId") String inspectionId,
			@Param("inspectionResultUpdate") String inspectionResultUpdate);
}
