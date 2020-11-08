package com.github.mitrakumarsujan.formmodel.model.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author skmitra
 * @since 2020-11-08
 */
@JsonDeserialize(as = FormResponseDownloadRequestImpl.class)
public interface FormResponseDownloadRequest {

	String getFormId();

	String getFormKey();

}
