package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import org.springframework.stereotype.Component;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
@Component
public class RestErrorResponseBuilderFactoryImpl implements RestErrorResponseBuilderFactory {
	
	@Override
	public RestErrorResponseBuilder getErrorBuilder() {
		return new RestErrorResponseBuilder();
	}
}
