package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.io.Serializable;

import javax.validation.Valid;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonDeserialize(as = ResponseDTO.class)
@Valid
public interface Response extends Serializable {
	String getQuestionUID();

	String getAnswer();
}
