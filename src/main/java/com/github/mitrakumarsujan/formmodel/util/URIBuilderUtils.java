package com.github.mitrakumarsujan.formmodel.util;

import java.net.URI;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-31
 */
@Component
public class URIBuilderUtils {
	public URI getURI(String baseUrl, String... path) {
			return UriComponentsBuilder	.fromHttpUrl(baseUrl)
										.pathSegment(path)
										.build()
										.toUri();
		}
}

