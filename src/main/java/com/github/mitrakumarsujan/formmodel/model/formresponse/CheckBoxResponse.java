package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-28
 */
@Valid
@JsonPropertyOrder({ "type", "questionUid", "answer", "optionUids" })
public class CheckBoxResponse extends AbstractResponse implements MultipleChoiceBasedResponse {

	private static final long serialVersionUID = 1762854138320006313L;

	@NotNull(message = "optionUid can't be null")
	private List<String> optionUids;

	public void setOptionUids(List<String> optionUids) {
		this.optionUids = optionUids;
	}

	public List<String> getOptionUids() {
		return optionUids;
	}

	@Override
	@JsonGetter("optionUids")
	public Collection<String> getOptionUIDs() {
		return getOptionUids();
	}

	@Override
	public String getType() {
		return "checkbox";
	}

}
