package com.github.mitrakumarsujan.formmodel.util;

import java.net.URI;
import java.util.Map;
import java.util.function.Supplier;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.github.mitrakumarsujan.formmodel.model.restresponse.success.MutableRestSuccessResponse;

/**
 * Extension of {@link RestTemplate} with deserialization feature of generic
 * POJOS
 * 
 * @author Sujan Kumar Mitra
 * @since 2020-10-27
 */
@Component
public class GenericRestTemplateFacade extends RestTemplate {

	public <T> ResponseEntity<T> exchange(RequestEntity<?> entity, Class<? extends T> responseEntityType,
			Class<?>... genericTypes) throws RestClientException {
		
		return exchange(entity, getTypeReference(responseEntityType, genericTypes));
	}

	public <T> ResponseEntity<T> exchange(URI uri, HttpMethod method, HttpEntity<?> requestEntity,
			Class<? extends T> responseEntityType, Class<?>... genericTypes) throws RestClientException {

		return exchange(uri, method, requestEntity, getTypeReference(responseEntityType, genericTypes));
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			Class<? extends T> responseEntityType, Class<?>... genericTypes) throws RestClientException {
		return exchange(url, method, requestEntity, getTypeReference(responseEntityType, genericTypes));
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			Map<String, ?> uriVariables, Class<? extends T> responseEntityType, Class<?>... genericTypes)
			throws RestClientException {
		return exchange(url, method, requestEntity, getTypeReference(responseEntityType, genericTypes), uriVariables);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			Supplier<Object[]> uriVariables, Class<? extends T> responseEntityType, Class<?>... genericTypes)
			throws RestClientException {
		return exchange(url, method, requestEntity, getTypeReference(responseEntityType, genericTypes),
				uriVariables.get());
	}
	
	public <T, R> R getRestSuccessResponseData(URI uri, HttpMethod httpMethod, T requestEntity, Class<? extends R> responseType) throws RestClientException{

		ResponseEntity<MutableRestSuccessResponse<R>> exchange = exchange(uri, httpMethod,
				new HttpEntity<>(requestEntity), MutableRestSuccessResponse.class, responseType);
		return exchange	.getBody()
						.getData();
	}

	private <T> ParameterizedTypeReference<T> getTypeReference(Class<? extends T> responseEntityType,
			Class<?>... genericTypes) {
		ResolvableType resolvableType = ResolvableType.forClassWithGenerics(responseEntityType, genericTypes);
		ParameterizedTypeReference<T> typeReference = ParameterizedTypeReference.forType(resolvableType.getType());
		return typeReference;
	}

}
