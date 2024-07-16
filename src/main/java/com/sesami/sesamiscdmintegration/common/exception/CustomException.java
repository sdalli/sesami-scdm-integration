package com.sesami.sesamiscdmintegration.common.exception;

public  class CustomException extends RuntimeException {

	private static final long serialVersionUID = -7775985197475209933L;

	public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

