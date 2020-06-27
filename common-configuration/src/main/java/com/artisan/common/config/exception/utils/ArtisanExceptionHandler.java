package com.artisan.common.config.exception.utils;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ArtisanExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private AdminConstantsPropertyConfig adminConstants;

	@ExceptionHandler(DetailsAlreadyExistsException.class)
	public Object handleDetailsAlreadyExistsException(DetailsAlreadyExistsException ex, WebRequest webRequest) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
				adminConstants.getDetailsExistsAlready());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.EXPECTATION_FAILED);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDate.now());
		body.put("status", status.value());

		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());

		body.put("errors", errors);

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ArtisanNotFoundException.class)
	  public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(ArtisanNotFoundException ex, WebRequest request) {
	    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	  }
}
