package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.util.List;

import javax.validation.Valid;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@Valid
public interface MultipleChoiceBasedResponse extends ChoiceBasedResponse {
	
	List<String> getOptionIds();

}
