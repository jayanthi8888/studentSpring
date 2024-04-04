package com.totfd.studentAdmin.exception;

public class InvalidCredentialsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Invalid Email or Password";
	}

	
}
