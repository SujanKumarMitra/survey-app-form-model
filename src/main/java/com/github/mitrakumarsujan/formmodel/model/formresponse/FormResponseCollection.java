package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.util.List;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public interface FormResponseCollection {

	String getFormId();

	List<String> getQuestions();

	List<List<String>> getResponses();
}
