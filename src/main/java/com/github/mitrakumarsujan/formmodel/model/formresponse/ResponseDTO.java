package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.util.Optional;

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
@JsonPropertyOrder({ "questionUid", "answerUid", "optionUid" })
@Valid
public class ResponseDTO implements Response, ChoiceBasedResponse {

	private static final long serialVersionUID = -8752674592300631649L;

	@NotNull(message = "questionUid can't be null")
	@NotEmpty(message = "formUid can't be null")
	@NotBlank(message = "formUid can't be null")
	private String questionUid;
	@NotNull(message = "answerUid can't be null")
	private String answer;
	private Optional<String> optionUid;

	public ResponseDTO() {
		this.optionUid = Optional.empty();
	}

	@Override
	public String getQuestionUID() {
		return questionUid;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	@Override
	public String getOptionUID() {
		return optionUid.orElse(null);
	}

	@JsonAlias({ "optionUid" })
	public void setOptionUID(String optionUID) {
		this.optionUid = Optional.ofNullable(optionUID);
	}

	@JsonAlias({ "questionUid" })
	public void setQuestionUID(String questionUID) {
		this.questionUid = questionUID;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
