package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@Valid
public abstract class AbstractResponse implements Response {

	private static final long serialVersionUID = 1760596082049155077L;

	@NotNull(message = "questionId can't be null")
	@NotBlank(message = "questionId can't be blank")
	private String questionId;

	private String answer;

	@Override
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
