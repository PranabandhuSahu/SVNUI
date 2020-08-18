package com.smartvoicenet.service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultEntity;

public interface SVNUIServices {
	public ExplainResult getExplainResult(String recordID);

	public String updateInspectionResult(String recordID);

	public String saveRecord(InspectionResultEntity recordObj);
}
