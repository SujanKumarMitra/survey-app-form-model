package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-28
 */
@JsonPropertyOrder({ "type", "questionId", "answer" })
@Valid
public class DateResponse extends AbstractResponse implements Response {

	private static final long serialVersionUID = 1060577277671312316L;

	@Override
	public String getType() {
		return "date";
	}

}
