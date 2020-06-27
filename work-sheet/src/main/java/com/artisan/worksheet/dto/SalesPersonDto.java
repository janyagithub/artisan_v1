package com.artisan.worksheet.dto;

import java.io.Serializable;

public class SalesPersonDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String firstName;

	private String lastName;

	private String emailAddesss;

	private Integer salesVolume;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddesss() {
		return emailAddesss;
	}

	public void setEmailAddesss(String emailAddesss) {
		this.emailAddesss = emailAddesss;
	}

	public Integer getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Integer salesVolume) {
		this.salesVolume = salesVolume;
	}

}
