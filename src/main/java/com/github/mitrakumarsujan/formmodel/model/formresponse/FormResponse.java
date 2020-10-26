package com.github.mitrakumarsujan.formmodel.model.formresponse;

import java.io.Serializable;
import java.time.ZoneId;
import java.util.Collection;

import javax.validation.Valid;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonDeserialize(as = FormResponseImpl.class)
@Valid
public interface FormResponse extends Serializable {
	String getFormUID();

	Collection<? extends Response> getResponses();

	ZoneId getZoneId();
	
	void setZoneId(ZoneId zoneId);
}
