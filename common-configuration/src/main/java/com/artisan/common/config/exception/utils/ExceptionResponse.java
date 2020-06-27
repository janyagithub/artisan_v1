package com.artisan.common.config.exception.utils;
import java.util.HashMap;
import java.util.Map;

/**
 * ExceptionResponse Custom Exception Response Class
 */
public class ExceptionResponse {
	
	private Map<String, String> data = new HashMap<>();
	private String message;
	
	public ExceptionResponse(String message) {
		super();
		this.message = message;
	}

	public ExceptionResponse(String message, String details) {
		super();
		this.message = message;
		this.data.put("errorDetails", details);
	}

	public Map<String, String> getData() {
		return data;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
