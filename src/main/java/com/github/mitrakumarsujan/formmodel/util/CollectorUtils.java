package com.github.mitrakumarsujan.formmodel.util;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-29
 */
@Component
public class CollectorUtils {

	public <K, V> Map<K, V> toIdentityMap(Collection<? extends V> collection,
			Function<? super V, ? extends K> keyMapper) {

		return collection	.parallelStream()
							.collect(Collectors.toUnmodifiableMap(keyMapper, Function.identity()));
	}
}
