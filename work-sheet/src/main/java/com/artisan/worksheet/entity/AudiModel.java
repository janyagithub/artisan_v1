package com.artisan.worksheet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
@Getter
@Setter
public abstract class AudiModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@CreatedDate
	@Column(name = "date_created")
	private Date dateCreated;
	@LastModifiedDate
	@Column(name = "last_updated")
	private Date lastUpdated;
	@CreatedBy
	private String generatedBy;
	@LastModifiedBy
	private String updatedBy;

	private String ipAddress;

}
