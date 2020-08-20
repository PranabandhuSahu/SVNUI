package com.smartvoicenet.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultModel;
import com.smartvoicenet.service.SVNUIServices;

@RestController
@RequestMapping("/svn")
public class SmartVoiceNetResources {
	
	@Autowired
	private SVNUIServices service;
	
	@GetMapping("/explain/{recordId}")
	public ExplainResult getExplainResultDetails(@PathVariable("recordId")String recordId) {
		return service.getExplainResult(recordId);
	}
	
	@PostMapping("/save")
	public List<InspectionResultModel> saveInspectionResult(@RequestBody List<InspectionResultModel> modelList) {
		
		return service.saveInspectionResultList(modelList);
		
	}
}
