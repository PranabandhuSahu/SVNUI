package com.smartvoicenet.resource;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ExplainResult getExplainResultDetails(@PathParam("/recordId")String recordId) {
		return service.getExplainResult(recordId);
	}
	
	@PostMapping("/save")
	public InspectionResultModel saveInspectionResult(@RequestBody InspectionResultModel model) {
		//requestBody is list..need to parse
		return service.saveInspectionResult(model);
	}
}
