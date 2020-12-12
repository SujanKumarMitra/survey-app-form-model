package com.github.mitrakumarsujan.formmodel.model.dto;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.mitrakumarsujan.formmodel.model.formresponse.FormResponseCollection;
import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityList;
import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityListImpl;

/**
 * @author skmitra
 * @since 2020-11-08
 */
@Service
public class FormResponseCollectionDtoConverter
		implements DtoConverter<FormResponseCollection, FormResponseCollectionDto> {

	@Override
	public FormResponseCollectionDto convert(FormResponseCollection data) {

		String formId = data.getFormId();
		List<String> questions = data.getQuestions();
		List<List<String>> responses = data.getResponses();

		EntityList<String> questionsList = new EntityListImpl<>(questions, 0);
		EntityList<List<String>> responsesList = new EntityListImpl<>(responses, 0);

		return new FormResponseCollectionDto(formId, questionsList, responsesList);
	}

}
