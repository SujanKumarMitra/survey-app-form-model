package com.github.mitrakumarsujan.formmodel.model.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author skmitra
 * @since 2020-11-08
 */
@JsonDeserialize(as = FormResponseAccessRequestImpl.class)
public interface FormResponseAccessRequest {

	String getFormId();

	String getFormKey();

}
