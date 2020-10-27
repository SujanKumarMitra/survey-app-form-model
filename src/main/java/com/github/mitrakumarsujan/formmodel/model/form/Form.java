package com.github.mitrakumarsujan.formmodel.model.form;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
@JsonPropertyOrder({ "uid", "key", "template" })
@JsonDeserialize(as = MutableForm.class)
public interface Form extends Serializable {

	String getUID();

	String getKey();

	FormTemplate getTemplate();
}
