package com.vince.utils;

/**
 * Created by vince on 2019/7/19.
 */
public class BusinessException extends RuntimeException {

    public BusinessException(){
        super();
    }

    public BusinessException(String errorMessage){
        super(errorMessage);
    }
}
