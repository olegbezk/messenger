package com.rest.tutorial.messenger.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8580910706668355756L;
	
	public DataNotFoundException(String message) {
		super(message);
	}

}
