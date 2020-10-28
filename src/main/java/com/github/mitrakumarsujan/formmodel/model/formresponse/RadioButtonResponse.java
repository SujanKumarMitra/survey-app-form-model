package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-28
 */
@JsonPropertyOrder({ "type", "questionUid", "answer", "optionUid" })
@Valid
public class RadioButtonResponse extends AbstractResponse implements SingleChoiceBasedResponse {

	private static final long serialVersionUID = 4444681611793250506L;

	@NotNull(message = "optionUid can't be null")
	@NotBlank(message = "optionUid can't be blank")
	private String optionUid;

	public String getOptionUid() {
		return optionUid;
	}

	@Override
	@JsonGetter("optionUid")
	public String getOptionUID() {
		return getOptionUid();
	}

	@JsonAlias("optionUid")
	public void setOptionUID(String optionUid) {
		this.optionUid = optionUid;
	}

	@Override
	public String getType() {
		return "radio";
	}

}
