package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.io.Serializable;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
//@formatter:off
@JsonTypeInfo(
		property = "type", 
		include = As.EXISTING_PROPERTY, 
		use = Id.NAME
)
@JsonSubTypes({
	@Type(name = "checkbox",value = CheckBoxResponse.class),
	@Type(name = "date",value = DateResponse.class),
	@Type(name = "radio",value = RadioResponse.class),
	@Type(name = "time",value = TimeResponse.class),
	@Type(name = "text",value = TextFieldResponse.class),
})// @formatter:on
@Valid
public interface Response extends Serializable {
	
	String getType();
	
	String getQuestionId();

	String getAnswer();
	
	void setAnswer(String answer);
}
