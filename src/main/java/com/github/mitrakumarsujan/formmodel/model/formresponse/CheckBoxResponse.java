package com.github.mitrakumarsujan.formmodel.model.formresponse;

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
@JsonPropertyOrder({ "type", "questionId", "answer", "optionIds" })
public class CheckBoxResponse extends AbstractResponse implements MultipleChoiceBasedResponse {

	private static final long serialVersionUID = 1762854138320006313L;

	@NotNull(message = "optionIds can't be null")
	private List<String> optionIds;

	@Override
	@JsonGetter("optionIds")
	public List<String> getOptionIds() {
		return optionIds;
	}

	public void setOptionIds(List<String> optionIds) {
		this.optionIds = optionIds;
	}

	@Override
	public String getType() {
		return "checkbox";
	}

}
