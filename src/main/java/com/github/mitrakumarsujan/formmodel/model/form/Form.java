package com.github.mitrakumarsujan.formmodel.model.form;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
@JsonDeserialize(as = MutableForm.class)
public interface Form extends Serializable {

	String getId();

	String getKey();

	FormTemplate getTemplate();
}
