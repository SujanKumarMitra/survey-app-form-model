package com.github.mitrakumarsujan.formmodel.model.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
@JsonPropertyOrder({ "id", "type", "question", "required", "options" })
public class CheckBoxField extends AbstractFormField implements ChoiceBasedFormField {

	private static final long serialVersionUID = -947459340183554091L;

	@Valid
	@NotNull(message = "options can't be null")
	@Size(min = 1, message = "must have at least one option")
	private List<OptionField> options;
	
	private CheckBoxField() {
		super(null,false);
	}

	public CheckBoxField(String question, boolean required, List<OptionField> options) {
		super(question, required);
		this.options = options;
	}

	public CheckBoxField(String question, boolean required) {
		this(question, required, new ArrayList<>());
	}

	@Override
	public String getType() {
		return "checkbox";
	}

	@Override
	public List<OptionField> getOptions() {
		return options;
	}

	public boolean addOption(OptionField element) {
		return options.add(element);
	}

	public boolean removeOption(OptionField element) {
		return options.remove(element);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckBoxField [question=");
		builder.append(getQuestion());
		builder.append(", options=");
		builder.append(options);
		builder.append(", required=");
		builder.append(isRequired());
		builder.append("]");
		return builder.toString();
	}

}
