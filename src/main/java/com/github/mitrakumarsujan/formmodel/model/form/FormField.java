package com.github.mitrakumarsujan.formmodel.model.form;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

// @formatter:off
@JsonTypeInfo(
		property = "type", 
		include = As.EXISTING_PROPERTY, 
		use = Id.NAME
)
@JsonSubTypes({
	@Type(name = "checkbox",value = CheckBoxField.class),
	@Type(name = "date",value = DateField.class),
	@Type(name = "radio",value = RadioField.class),
	@Type(name = "time",value = TimeField.class),
	@Type(name = "text",value = TextField.class),
})// @formatter:on
/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
public interface FormField extends Serializable {
	
	String getId();
	
	void setId(String id);

	String getQuestion();

	boolean isRequired();

	String getType();

}
