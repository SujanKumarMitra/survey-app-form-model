package com.github.mitrakumarsujan.formmodel.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public class FormResponseAccessRequestImpl implements FormResponseAccessRequest {

	@NotNull(message = "formId can't be null")
	@NotBlank(message = "formId can't be empty")
	private String formId;
	@NotNull(message = "formKey can't be null")
	@NotBlank(message = "formKey can't be empty")
	private String formKey;

	public FormResponseAccessRequestImpl() {
	}

	public FormResponseAccessRequestImpl(String formId, String formKey) {
		this.formId = formId;
		this.formKey = formKey;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

	@Override
	public String getFormId() {
		return formId;
	}

	@Override
	public String getFormKey() {
		return formKey;
	}

}
