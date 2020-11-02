package com.github.mitrakumarsujan.formmodel.model.form;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
@JsonPropertyOrder({"id", "type", "question", "required", "pattern" })
public class TimeField extends AbstractFormField implements PatternBasedFormField {

	/**
	 * 
	 */
	private static final String DEFAULT_PATTERN = "^(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])$";

	private static final long serialVersionUID = -8875415602189929487L;

	private String pattern;

	@SuppressWarnings({"unused"})
	private TimeField() {
		this(null, false,DEFAULT_PATTERN);
	}

	public TimeField(String question, boolean required, String pattern) {
		super(question, required);
		this.pattern = pattern;
	}

	@Override
	public String getType() {
		return "time";
	}

	@Override
	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		if (pattern == null)
			this.pattern = DEFAULT_PATTERN;
		else
			this.pattern = pattern;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TimeField [pattern=");
		builder.append(pattern);
		builder.append(", required=");
		builder.append(isRequired());
		builder.append(", question=");
		builder.append(getQuestion());
		builder.append("]");
		return builder.toString();
	}

}
