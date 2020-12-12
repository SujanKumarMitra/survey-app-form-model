package com.github.mitrakumarsujan.formmodel.model.restresponse;

public class SuccessMessage {

    private final String message;

    public SuccessMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
