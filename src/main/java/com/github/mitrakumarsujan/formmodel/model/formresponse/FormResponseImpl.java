package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.time.ZoneId;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonPropertyOrder({ "formUid", "zoneId", "responses" })
@Valid
public class FormResponseImpl implements FormResponse {

	private static final long serialVersionUID = 5764503851925687032L;
	@NotNull(message = "formUid can't be null")
	@NotEmpty(message = "formUid can't be empty")
	@NotBlank(message = "formUid can't be blank")
	private String formUid;
	@NotNull(message = "responses can't be null")
	@Valid
	private List<Response> responses;
	private ZoneId zoneId;

	@Override
	public String getFormUID() {
		return formUid;
	}

	@Override
	public Collection<? extends Response> getResponses() {
		return responses;
	}

	@Override
	public ZoneId getZoneId() {
		return zoneId;
	}

	@JsonAlias(value = { "formUid" })
	public void setFormUID(String formUID) {
		this.formUid = formUID;
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
		builder.append("FormResponse [formUid=");
		builder.append(formUid);
		builder.append(", responses=");
		builder.append(responses);
		builder.append(", zoneId=");
		builder.append(zoneId);
		builder.append("]");
		return builder.toString();
	}

}
