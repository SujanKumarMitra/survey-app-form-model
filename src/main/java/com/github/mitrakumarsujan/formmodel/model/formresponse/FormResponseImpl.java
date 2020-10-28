package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.time.ZoneId;
import java.util.Collection;
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
@JsonPropertyOrder({ "formUid", "zoneId", "responses" })
@Valid
public class FormResponseImpl implements FormResponse {

	private static final long serialVersionUID = 5764503851925687032L;
	@NotNull(message = "formId can't be null")
	@NotEmpty(message = "formId can't be empty")
	@NotBlank(message = "formId can't be blank")
	private String formId;
	@NotNull(message = "responses can't be null")
	@Valid
	private List<Response> responses;
	private ZoneId zoneId;

	@Override
	public String getFormId() {
		return formId;
	}

	@Override
	public Collection<Response> getResponses() {
		return responses;
	}

	@Override
	public ZoneId getZoneId() {
		return zoneId;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public void setZoneId(ZoneId zoneId) {
		this.zoneId = zoneId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormResponse [formId=");
		builder.append(formId);
		builder.append(", responses=");
		builder.append(responses);
		builder.append(", zoneId=");
		builder.append(zoneId);
		builder.append("]");
		return builder.toString();
	}

}
