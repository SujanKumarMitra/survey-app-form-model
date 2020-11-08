package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.util.List;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public class FormResponseCollectionImpl implements FormResponseCollection {

	private String formId;
	private List<String> questions;
	private List<List<String>> responses;

	@Override
	public String getFormId() {
		return formId;
	}

	@Override
	public List<String> getQuestions() {
		return questions;
	}

	@Override
	public List<List<String>> getResponses() {
		return responses;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}

	public void setResponses(List<List<String>> responses) {
		this.responses = responses;
	}

}