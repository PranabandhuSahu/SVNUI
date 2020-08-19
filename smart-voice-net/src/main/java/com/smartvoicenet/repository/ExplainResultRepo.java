package com.smartvoicenet.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smartvoicenet.model.InspectionResultEntity;

@Repository
public interface ExplainResultRepo extends CrudRepository<InspectionResultEntity, String>{
	
}
