package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonDeserialize(as = FormResponseImpl.class)
@Valid
public interface FormResponse extends Serializable {
	String getFormId();

	List<Response> getResponses();

	LocalDateTime getTimestamp();

	void setTimestamp(LocalDateTime timestamp);
}
