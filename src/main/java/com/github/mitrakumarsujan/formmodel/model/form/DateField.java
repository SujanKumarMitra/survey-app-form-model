package com.github.mitrakumarsujan.formmodel.model.form;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@JsonPropertyOrder({"id", "type", "question", "required", "pattern" })
public class DateField extends AbstractFormField implements PatternBasedFormField {

	private static final String DEFAULT_PATTERN = "^([0-9]{4})(-)(1[0-2]|0[1-9])\\2(3[01]|0[1-9]|[12][0-9])$";

	private static final long serialVersionUID = 2450510899943300177L;

	private String pattern;

	@SuppressWarnings({"unused"})
	private DateField() {
		this(null, false,DEFAULT_PATTERN);
	}

	public DateField(String question, boolean required, String pattern) {
		super(question, required);
		this.pattern = pattern;
	}

	@Override
	public String getType() {
		return "date";
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
		builder.append("DateField [question=");
		builder.append(getQuestion());
		builder.append(", pattern=");
		builder.append(getPattern());
		builder.append(", required=");
		builder.append(isRequired());
		builder.append("]");
		return builder.toString();
	}

}
