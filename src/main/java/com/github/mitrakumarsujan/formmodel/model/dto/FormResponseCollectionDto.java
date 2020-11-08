package com.github.mitrakumarsujan.formmodel.model.dto;

import java.util.List;

import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityList;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public class FormResponseCollectionDto {

	private final String formId;
	private final EntityList<String> questions;
	private final EntityList<List<String>> responses;

	public FormResponseCollectionDto(String formId, EntityList<String> questions, EntityList<List<String>> responses) {
		this.formId = formId;
		this.questions = questions;
		this.responses = responses;
	}

	public String getFormId() {
		return formId;
	}

	public EntityList<String> getQuestions() {
		return questions;
	}

	public EntityList<List<String>> getResponses() {
		return responses;
	}

}
