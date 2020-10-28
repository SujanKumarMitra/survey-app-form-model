package com.github.mitrakumarsujan.formmodel.model.formresponse;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@Valid
public abstract class AbstractResponse implements Response {

	private static final long serialVersionUID = 1760596082049155077L;

	@NotNull(message = "questionUid can't be null")
	@NotEmpty(message = "formUid can't be null")
	@NotBlank(message = "formUid can't be null")
	private String questionUid;
	@NotNull(message = "answerUid can't be null")
	private String answer;

	@Override
	@JsonGetter("questionUid")
	public String getQuestionUID() {
		return questionUid;
	}
	
	@JsonAlias({"questionUid"})
	public void setQuestionUID(String questionUid) {
		this.questionUid = questionUid;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
