package com.smartvoicenet.model;

import java.util.HashMap;
import java.util.List;

//@Entity
public class InspectionResultEntity {
	// @Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "INSPECTION_SEQ")
	// @SequenceGenerator(sequenceName = "inspection_id_seq", allocationSize = 1,
	// name = "INSPECTION_SEQ")
	private String inspectionId;
	private String phoneNumber;
	private String inspectionResult;
	private String callStartTime;
	private String durationOfCall;
	private String callername;
	private String callerType;
	private String authScore;

	private Integer hotspotPhraseCount;
	private HashMap<String, Integer> hotspotPhrases;

	private Integer urgencyPhraseCount;
	private HashMap<String, Integer> urgencyPhrases;

	private Integer grammaticalErrorCounts;
	private List<String> grammaticalErrorPhrases;

	private Integer smartProbeErrorCounts;
	private List<String> smartProbeErrorQs;

	private Integer repeatationCount;

	private String language;
	private String callerId;
	private Integer userThreshold;
	private String inspectionMode;
	private String filename;
	private String inspectionDate;
	private String donatedTime;
	private String callType;
	private String convertedText;
	private String protectionAction;
	private String callEndTime;
	private String protectionActionTime;
	private String inspectionResultUpdate;

	public String getInspectionId() {
		return inspectionId;
	}

	public void setInspectionId(String inspectionId) {
		this.inspectionId = inspectionId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInspectionResult() {
		return inspectionResult;
	}

	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

	public String getCallStartTime() {
		return callStartTime;
	}

	public void setCallStartTime(String callStartTime) {
		this.callStartTime = callStartTime;
	}

	public String getDurationOfCall() {
		return durationOfCall;
	}

	public void setDurationOfCall(String durationOfCall) {
		this.durationOfCall = durationOfCall;
	}

	public String getCallername() {
		return callername;
	}

	public void setCallername(String callername) {
		this.callername = callername;
	}

	public String getCallerType() {
		return callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
	}

	public String getAuthScore() {
		return authScore;
	}

	public void setAuthScore(String authScore) {
		this.authScore = authScore;
	}

	public Integer getHotspotPhraseCount() {
		return hotspotPhraseCount;
	}

	public void setHotspotPhraseCount(Integer hotspotPhraseCount) {
		this.hotspotPhraseCount = hotspotPhraseCount;
	}

	public HashMap<String, Integer> getHotspotPhrases() {
		return hotspotPhrases;
	}

	public void setHotspotPhrases(HashMap<String, Integer> hotspotPhrases) {
		this.hotspotPhrases = hotspotPhrases;
	}

	public Integer getUrgencyPhraseCount() {
		return urgencyPhraseCount;
	}

	public void setUrgencyPhraseCount(Integer urgencyPhraseCount) {
		this.urgencyPhraseCount = urgencyPhraseCount;
	}

	public HashMap<String, Integer> getUrgencyPhrases() {
		return urgencyPhrases;
	}

	public void setUrgencyPhrases(HashMap<String, Integer> urgencyPhrases) {
		this.urgencyPhrases = urgencyPhrases;
	}

	public Integer getGrammaticalErrorCounts() {
		return grammaticalErrorCounts;
	}

	public void setGrammaticalErrorCounts(Integer grammaticalErrorCounts) {
		this.grammaticalErrorCounts = grammaticalErrorCounts;
	}

	public List<String> getGrammaticalErrorPhrases() {
		return grammaticalErrorPhrases;
	}

	public void setGrammaticalErrorPhrases(List<String> grammaticalErrorPhrases) {
		this.grammaticalErrorPhrases = grammaticalErrorPhrases;
	}

	public Integer getSmartProbeErrorCounts() {
		return smartProbeErrorCounts;
	}

	public void setSmartProbeErrorCounts(Integer smartProbeErrorCounts) {
		this.smartProbeErrorCounts = smartProbeErrorCounts;
	}

	public List<String> getSmartProbeErrorQs() {
		return smartProbeErrorQs;
	}

	public void setSmartProbeErrorQs(List<String> smartProbeErrorQs) {
		this.smartProbeErrorQs = smartProbeErrorQs;
	}

	public Integer getRepeatationCount() {
		return repeatationCount;
	}

	public void setRepeatationCount(Integer repeatationCount) {
		this.repeatationCount = repeatationCount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCallerId() {
		return callerId;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}

	public Integer getUserThreshold() {
		return userThreshold;
	}

	public void setUserThreshold(Integer userThreshold) {
		this.userThreshold = userThreshold;
	}

	public String getInspectionMode() {
		return inspectionMode;
	}

	public void setInspectionMode(String inspectionMode) {
		this.inspectionMode = inspectionMode;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getDonatedTime() {
		return donatedTime;
	}

	public void setDonatedTime(String donatedTime) {
		this.donatedTime = donatedTime;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getConvertedText() {
		return convertedText;
	}

	public void setConvertedText(String convertedText) {
		this.convertedText = convertedText;
	}

	public String getProtectionAction() {
		return protectionAction;
	}

	public void setProtectionAction(String protectionAction) {
		this.protectionAction = protectionAction;
	}

	public String getCallEndTime() {
		return callEndTime;
	}

	public void setCallEndTime(String callEndTime) {
		this.callEndTime = callEndTime;
	}

	public String getProtectionActionTime() {
		return protectionActionTime;
	}

	public void setProtectionActionTime(String protectionActionTime) {
		this.protectionActionTime = protectionActionTime;
	}

	public String getInspectionResultUpdate() {
		return inspectionResultUpdate;
	}

	public void setInspectionResultUpdate(String inspectionResultUpdate) {
		this.inspectionResultUpdate = inspectionResultUpdate;
	}

}
