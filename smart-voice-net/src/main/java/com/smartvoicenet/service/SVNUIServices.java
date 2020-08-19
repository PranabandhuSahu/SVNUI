package com.smartvoicenet.service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultEntity;
import com.smartvoicenet.model.InspectionResultModel;

public interface SVNUIServices {
	public ExplainResult getExplainResult(String inspectionId);

	public InspectionResultEntity updateInspectionResult(String inspectionId);

	public InspectionResultModel saveInspectionResult(InspectionResultModel resultEntity);
}
