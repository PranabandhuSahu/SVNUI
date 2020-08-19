package com.smartvoicenet.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.smartvoicenet.configuration.SVNCustomGenerator;

@Entity
public class InspectionResultEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @GenericGenerator(
        name = "book_seq", 
        strategy = "org.thoughts.on.java.generators.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = SVNCustomGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = SVNCustomGenerator.VALUE_PREFIX_PARAMETER, value = "SVN_"),
            @Parameter(name = SVNCustomGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String inspectionId;
	
	@Column
	private String phoneNumber;
	@Column
	private String inspectionResult;
	@Column
	private String callStartTime;
	@Column
	private String durationOfCall;
	@Column
	private String callername;
	@Column
	private String callerType;
	@Column
	private String authScore;
	@Column
	private Integer hotspotPhraseCount;
	
	@ElementCollection
    @CollectionTable(name = "hotspot_phrase_mapping", 
      joinColumns = {@JoinColumn(name = "hotspot_phrase_fid", referencedColumnName = "inspectionId")})
    @MapKeyColumn(name = "hotspot_phrase")
	private HashMap<String, Integer> hotspotPhrases;

	@ElementCollection
    @CollectionTable(name = "urgency_phrase_mapping", 
      joinColumns = {@JoinColumn(name = "urgency_phrase_fid", referencedColumnName = "inspectionId")})
    @MapKeyColumn(name = "urgency_phrase")
	private HashMap<String, Integer> urgencyPhrases;
	
	@Column
	private Integer urgencyPhraseCount;
	@Column
	private Integer grammaticalErrorCounts;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="gramm_err_fid", referencedColumnName="inspectionId")
	private List<String> grammaticalErrorPhrases;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SmartProbe_Err_Fid", referencedColumnName="inspectionId")
	private List<String> smartProbeErrorQs;
	@Column
	private Integer smartProbeErrorCounts;
	@Column
	private Integer repeatationCount;
	@Column
	private String language;
	@Column
	private String callerId;
	@Column
	private Integer userThreshold;
	@Column
	private String inspectionMode;
	@Column
	private String filename;
	@Column
	private String inspectionDate;
	@Column
	private String donatedTime;
	@Column
	private String callType;
	@Column
	private String convertedText;
	@Column
	private String protectionAction;
	@Column
	private String callEndTime;
	@Column
	private String protectionActionTime;
	@Column
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
