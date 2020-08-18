package com.smartvoicenet.model;

import java.util.HashMap;
import java.util.List;

public class PhraseCounter {

	private List<String> phrases;
	private HashMap<String, Integer> phraseRptCount;
	private Integer phraseCount;

	public List<String> getPhrases() {
		return phrases;
	}

	public void setPhrases(List<String> phrases) {
		this.phrases = phrases;
	}

	public HashMap<String, Integer> getPhraseRptCount() {
		return phraseRptCount;
	}

	public void setPhraseRptCount(HashMap<String, Integer> phraseRptCount) {
		this.phraseRptCount = phraseRptCount;
	}

	public Integer getPhraseCount() {
		return phraseCount;
	}

	public void setPhraseCount(Integer phraseCount) {
		this.phraseCount = phraseCount;
	}

}
