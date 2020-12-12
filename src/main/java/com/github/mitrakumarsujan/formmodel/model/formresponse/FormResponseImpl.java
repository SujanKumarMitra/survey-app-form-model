package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonPropertyOrder({ "formId", "timestamp", "responses" })
@Valid
public class FormResponseImpl implements FormResponse {

	private static final long serialVersionUID = 5764503851925687032L;
	@NotNull(message = "formId can't be null")
	@NotBlank(message = "formId can't be blank")
	private String formId;

	@NotNull(message = "responses can't be null")
	@Valid
	private List<Response> responses;

	private LocalDateTime timestamp;

	@Override
	public String getFormId() {
		return formId;
	}

	@Override
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	@Override
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	@Override
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormResponse [formId=");
		builder.append(formId);
		builder.append(", responses=");
		builder.append(responses);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}

}
