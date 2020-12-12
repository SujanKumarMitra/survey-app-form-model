package com.github.mitrakumarsujan.formmodel.model.form;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
@JsonDeserialize(as = OptionFieldImpl.class)
public interface OptionField extends Serializable {

	void setId(String id);

	String getId();

	String getText();

}
