package com.github.mitrakumarsujan.formmodel.model.form;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
public class OptionFieldImpl implements OptionField {

	private static final long serialVersionUID = 8528535349493451965L;

	private String id;

	@NotNull(message = "text cannot be null")
	@NotEmpty(message = "text cannot be empty")
	@NotBlank(message = "text cannot be blank")
	private String text;

	@SuppressWarnings("unused")
	private OptionFieldImpl() {
	}

	public OptionFieldImpl(String id, String text) {
		this.id = id;
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OptionField [text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}
}
