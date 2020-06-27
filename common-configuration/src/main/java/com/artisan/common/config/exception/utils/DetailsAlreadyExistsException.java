package com.artisan.common.config.exception.utils;

import lombok.Getter;

@Getter
public class DetailsAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String message;
	private final Throwable e;

	public DetailsAlreadyExistsException(String message, Throwable e) {
		super();
		this.message = message;
		this.e = e;
	}

}
