package com.github.mitrakumarsujan.formmodel.util;

import static java.util.stream.Collectors.toMap;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.github.mitrakumarsujan.formmodel.exception.DuplicateKeyException;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-29
 */
@Component
public class CollectorUtils {

	public <K, V> Map<K, V> toIdentityMap(Collection<? extends V> collection,
			Function<? super V, ? extends K> keyMapper) {

		try {
			return collection	.parallelStream()
								.collect(toMap(keyMapper, Function.identity()));
		} catch (IllegalStateException e) {
			throw new DuplicateKeyException(e.getLocalizedMessage());
		}
	}
}
