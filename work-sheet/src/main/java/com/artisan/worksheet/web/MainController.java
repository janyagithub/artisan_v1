package com.artisan.worksheet.web;

import java.util.Collection;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artisan.worksheet.dto.SalesPersonDto;
import com.artisan.worksheet.entity.SalesPerson;
import com.artisan.worksheet.repo.SalesPersonRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/spring-angular")
public class MainController {

	@Autowired
	private SalesPersonRepository salesPersonRepository;

	@PostMapping
	public ResponseEntity<SalesPerson> addNewUser(@RequestBody SalesPersonDto salesPersonDto) {

		SalesPerson entity = new SalesPerson();
		BeanUtils.copyProperties(salesPersonDto, entity);
		
		return new ResponseEntity<>(salesPersonRepository.save(entity), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<Collection<SalesPerson>> getAllUsers() {

		return new ResponseEntity<Collection<SalesPerson>>(salesPersonRepository.findAll(), HttpStatus.OK);
	}
}
