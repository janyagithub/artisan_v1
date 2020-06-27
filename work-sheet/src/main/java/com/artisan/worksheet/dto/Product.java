package com.artisan.worksheet.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.artisan.worksheet.entity.ProductCategory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private ProductCategory category;

	private String sku;

	private String name;

	private String description;

	private BigDecimal unitPrice;

	private String imageUrl;

	private boolean active;

	private int unitsInStock;

}
