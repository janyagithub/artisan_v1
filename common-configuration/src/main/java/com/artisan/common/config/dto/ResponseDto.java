package com.artisan.common.config.dto;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {

	private HttpStatus httpStatusCode; // http code whether 200 or 500
	private String statusMessage; // detailed message whether success or failed
	private Status statusEnum; // success or failed
	private Collection<T> content; // response content on GET api call
	private PageImpl<T> pageable; // page informataion
	private Map<String, List<String>> errorDetailsMap;
}
