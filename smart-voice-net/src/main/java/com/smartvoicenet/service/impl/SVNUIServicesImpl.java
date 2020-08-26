package com.smartvoicenet.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.GetByDateModel;
import com.smartvoicenet.model.InspectionResultEntity;
import com.smartvoicenet.model.InspectionResultModel;
import com.smartvoicenet.model.UpdateResultModel;
import com.smartvoicenet.processor.DateProcesser;
import com.smartvoicenet.processor.ExplainResultProcessor;
import com.smartvoicenet.processor.InspectionResultProcessor;
import com.smartvoicenet.repository.SVNRecordRepo;
import com.smartvoicenet.service.SVNUIServices;

@Service
public class SVNUIServicesImpl implements SVNUIServices {

	@Autowired
	private SVNRecordRepo repository;

	@Autowired
	private ExplainResultProcessor explainResultProcessor;

	@Autowired
	private InspectionResultProcessor inspectionProcessor;

	private InspectionResultEntity getInspectionResultEntity(String inspectionId) {
		// fetching data from DB
		Optional<InspectionResultEntity> optionalResultEntity = repository.findByInspectionId(inspectionId);
		return optionalResultEntity.get();
	}

	@Override
	public ExplainResult getExplainResult(String inspectionId) {
		return explainResultProcessor.processExplainResultDetails(getInspectionResultEntity(inspectionId));

	}

	@Override
	public List<InspectionResultModel> saveInspectionResultList(List<InspectionResultModel> modelList) {
		List<InspectionResultModel> savedModel = new ArrayList<InspectionResultModel>();
		modelList.forEach(model -> savedModel.add(saveInspectionResult(model)));
		return savedModel;
	}

	private InspectionResultModel saveInspectionResult(InspectionResultModel resultModel) {
		InspectionResultEntity entity = inspectionProcessor.processInspectionResultModelToEntity(resultModel);
		return inspectionProcessor.processInspectionResultEntityToModel(repository.save(entity));
	}

	@Override
	public String updateResult(UpdateResultModel model) {
		// TODO Auto-generated method stub
		/*
		 * InspectionResultEntity
		 * entity=repository.updateInspectionResultEntity(model.getInspectionId(),
		 * model.getInspectionResultUpdate());
		 * 
		 */
		repository.updateInspectionResultEntity(model.getInspectionId(), model.getInspectionResultUpdate());
		InspectionResultEntity updatedEntity = getInspectionResultEntity(model.getInspectionId());
		if (!updatedEntity.getInspectionResultUpdate().equalsIgnoreCase(model.getInspectionResultUpdate())) {
			System.err.println(updatedEntity.getInspectionResultUpdate());
			return "Update failed";
		} else {
			System.err.println(updatedEntity.getInspectionResultUpdate());
			return "Update Success";
		}
	}
	/*
	 * @Override public InspectionResultEntity updateInspectionResult(String
	 * inspectionId) { // TODO Auto-generated method stub return null; }
	 */

	public List<InspectionResultModel> getResultbyDate(String startDate,String endDate) {
		List<LocalDateTime> datesToDb= new ArrayList<>() ;
		List<InspectionResultModel> returnModel = new ArrayList<InspectionResultModel>();
		DateProcesser dateProcessor=new DateProcesser();
		
		LocalDateTime processedStartDate=dateProcessor.processDate(startDate);
		LocalDateTime processedEndDate=dateProcessor.processDate(endDate);
		
		datesToDb.add(processedStartDate);
		datesToDb.add(processedEndDate);
		
		List<InspectionResultEntity> resultEntity= repository.getResultByDate(datesToDb);
		for (InspectionResultEntity entity : resultEntity) {
			returnModel.add(inspectionProcessor.processInspectionResultEntityToModel(entity));
		}
		return returnModel;
	}

	/*
	 * private InspectionResultEntity processAnEntityForDemo() {
	 * InspectionResultEntity entity = new InspectionResultEntity();
	 * entity.setAuthScore("60"); entity.setCallEndTime("12/20/2019  12:23:00 PM");
	 * entity.setCallerId("101"); entity.setCallername("JIO");
	 * entity.setCallerType("Org");
	 * entity.setCallStartTime("12/20/2019  12:19:00 PM");
	 * entity.setCallType("Incoming"); entity.setConvertedText(null);
	 * entity.setDonatedTime("12/20/2019  12:29:00 PM");
	 * entity.setDurationOfCall("4"); entity.setFilename("recording112.mp3");
	 * entity.setGrammaticalErrorCounts(1); entity.setHotspotPhraseCount(3);
	 * entity.setInspectionDate("12/20/2019  12:19:00 PM");
	 * entity.setInspectionId("i101"); entity.setInspectionMode("Recorded Audio");
	 * entity.setInspectionResult("Spam"); entity.setInspectionResultUpdate("");
	 * entity.setLanguage("EN_US"); entity.setPhoneNumber("+914448137300");
	 * entity.setProtectionAction("Disconnect");
	 * entity.setProtectionActionTime("12/20/2019  12:22:00 PM");
	 * entity.setRepeatationCount(6); entity.setSmartProbeErrorCounts(3);
	 * entity.setUrgencyPhraseCount(3); entity.setUserThreshold(40);
	 * 
	 * HashMap<String, Integer> hotspotPhraseMap = new HashMap<String, Integer>();
	 * 
	 * hotspotPhraseMap.put("cvv", 3); hotspotPhraseMap.put("passcode", 1);
	 * hotspotPhraseMap.put("OTP", 2);
	 * 
	 * HashMap<String, Integer> urgencyPhraseMap = new HashMap<String, Integer>();
	 * urgencyPhraseMap.put("immediately", 3); urgencyPhraseMap.put("on hold", 1);
	 * urgencyPhraseMap.put("expiring", 2);
	 * 
	 * List<String> probeQs = new ArrayList<String>();
	 * probeQs.add("Why do need my card number?");
	 * probeQs.add("From which bank are you calling?");
	 * probeQs.add("What is the name of your branch");
	 * 
	 * List<String> grammaticalErrorPhrases = new ArrayList<String>();
	 * grammaticalErrorPhrases.add("When did you got your card?");
	 * 
	 * entity.setHotspotPhrases(hotspotPhraseMap);
	 * entity.setUrgencyPhrases(urgencyPhraseMap);
	 * entity.setSmartProbeErrorQs(probeQs);
	 * entity.setGrammaticalErrorPhrases(grammaticalErrorPhrases); return entity;
	 * 
	 * }
	 */
}
