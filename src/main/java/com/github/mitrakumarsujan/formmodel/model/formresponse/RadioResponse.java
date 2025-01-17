package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-28
 */
@JsonPropertyOrder({ "type", "questionId", "answer", "optionId" })
@Valid
public class RadioResponse extends AbstractResponse implements SingleChoiceBasedResponse {

	private static final long serialVersionUID = 4444681611793250506L;

	@NotNull(message = "optionId can't be null")
	@NotEmpty(message = "optionId can't be empty")
	private String optionId;

	@Override
	public String getOptionId() {
		return optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	@Override
	public String getType() {
		return "radio";
	}

}
