package com.github.mitrakumarsujan.formmodel.model.form;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
public abstract class AbstractFormField implements FormField {

	private static final long serialVersionUID = 5980074893003836601L;

	private String id;

	@NotNull(message = "question cannot be null")
	@NotEmpty(message = "question cannot be empty")
	@NotBlank(message = "question cannot be blank")
	private String question;
	private boolean required;

	@SuppressWarnings("unused")
	private AbstractFormField() {
	}

	public AbstractFormField(String question, boolean required) {
		this(null, question, required);
	}

	public AbstractFormField(String id, String question, boolean required) {
		this.id = id;
		this.question = question;
		this.required = required;
	}

	@Override
	public boolean isRequired() {
		return required;
	}

	@Override
	public String getQuestion() {
		return question;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	@JsonGetter("id")
	public String getId() {
		return id;
	}

	@Override
	@JsonSetter("id")
	public void setId(String id) {
		this.id = id;
	}

}
