package com.github.mitrakumarsujan.formmodel.model.form;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
@JsonPropertyOrder({"id", "type", "question", "required" })
public class TextField extends AbstractFormField implements FormField {

	private static final long serialVersionUID = -3983594967960393598L;

	private TextField() {
		super(null, false);
	}

	public TextField(String question, boolean required) {
		super(question, required);
	}

	@Override
	public String getType() {
		return "text";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TextBoxField [question=");
		builder.append(getQuestion());
		builder.append(", required=");
		builder.append(isRequired());
		builder.append("]");
		return builder.toString();
	}

}
