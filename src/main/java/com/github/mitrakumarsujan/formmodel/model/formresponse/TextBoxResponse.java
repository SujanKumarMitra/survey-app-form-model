package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-28
 */
@JsonPropertyOrder({ "type", "questionUid", "answer" })
@Valid
public class TextBoxResponse extends AbstractResponse implements Response {

	private static final long serialVersionUID = -3630301511818657051L;

	@Override
	public String getType() {
		return "textbox";
	}
}
