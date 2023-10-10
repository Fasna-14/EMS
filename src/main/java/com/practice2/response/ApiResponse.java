package com.practice2.response;

import com.practice2.enums.RestApiResponseStatus;

public class ApiResponse {
    private static final ApiResponse OK = new ApiResponse(RestApiResponseStatus.OK);
     private String status;
     private Integer statusCode;

     public ApiResponse(RestApiResponseStatus restApiResponseStatus){
         this.status = restApiResponseStatus.getStatus();
         this.statusCode = restApiResponseStatus.getCode();
     }

}
