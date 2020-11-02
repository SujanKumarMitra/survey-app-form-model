package com.github.mitrakumarsujan.formmodel.model.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@Valid
@JsonPropertyOrder({ "name", "description", "fields" })
public class FormTemplateImpl implements FormTemplate {

	private static final long serialVersionUID = -1543425988940790751L;

	private String name;
	private String description;

	@NotNull(message = "must contain at least one field")
	@Size(min = 1)
	@Valid
	private List<FormField> fields;

	public FormTemplateImpl() {
		this.name = "Unnamed";
		this.description = "No description";
	}

	@Override
	public List<FormField> getFields() {
		return fields;
	}

	public void setFields(List<FormField> fields) {
		this.fields = fields;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description != null)
			this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormTemplate [fields=");
		builder.append(fields);
		builder.append("]");
		return builder.toString();
	}

}
