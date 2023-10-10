package com.practice2.response;

import com.practice2.enums.RestApiResponseStatus;
import com.practice2.validation.ValidationFailure;

import java.util.Collections;
import java.util.List;

public class ValidationFailureResponse extends ApiResponse{
    private List<ValidationFailure> validationFailures;

    public ValidationFailureResponse(String message,String code){
        super(RestApiResponseStatus.VALIDATION_FAILURE);
        ValidationFailure validationFailure = new ValidationFailure(message,code);
        this.validationFailures = Collections.singletonList(validationFailure);
    }
}
