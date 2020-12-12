package com.github.mitrakumarsujan.formmodel.model.restresponse;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.mitrakumarsujan.formmodel.model.restresponse.success.MutableRestSuccessResponse;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
@JsonPropertyOrder({"status", "code", "message", "data"})
@JsonDeserialize(as = MutableRestSuccessResponse.class)
public interface RestSuccessResponse<T> extends RestResponse, ResponseEntityAdaptor<RestSuccessResponse<T>> {

    T getData();

    @Override
    default ResponseEntity<RestSuccessResponse<T>> toResponseEntity() {
        return new ResponseEntity<>(this, getStatus());
    }

}
