package com.myhome.email_sender.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.myhome.email_sender.common.exceptions.CustomException;
import com.myhome.email_sender.common.exceptions.ExceptionInterface;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiResponse<T>(
        int status,
        T data,
        Error error
) {
    private record Error(
            String errorCode,
            String message
    ){
        private static Error create(String errorCode, String message){
            return new Error(errorCode,message);
        }
        private static Error create(ExceptionInterface exceptionInterface){
            return create(exceptionInterface.getCode(),exceptionInterface.getMessage());
        }
        private static Error create(CustomException customException){
            return create(customException.getCode(), customException.getMessage());
        }
    }

    public static <T> ApiResponse<T> ok(){
        return new ApiResponse<>(HttpStatus.OK.value(),null,null);
    }
    public static <T> ApiResponse<T> created(){
        return new ApiResponse<>(HttpStatus.CREATED.value(),null,null);
    }
    public static <T> ApiResponse<T> ok(T data){
        return new ApiResponse<>(HttpStatus.OK.value(), data,null);
    }
    public static <T> ApiResponse<T> created(T data){
        return new ApiResponse<>(HttpStatus.CREATED.value(), data,null);
    }

    public static <T> ApiResponse<T> fail(HttpStatus httpStatus, String errorCode, String message){
        return new ApiResponse<>(httpStatus.value(),null,new Error(errorCode,message));
    }

    public static <T> ApiResponse<T> fail(CustomException e){
        return new ApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), null,Error.create(e));
    }
}
