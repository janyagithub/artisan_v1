package com.artisan.runner;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.artisan.worksheet.entity.Product;
import com.artisan.worksheet.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		HttpMethod[] unsupportedOperations = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };

		config.getExposureConfiguration().forDomainType(Product.class)
				.withItemExposure((media, httpMethods) -> httpMethods.disable(unsupportedOperations))
				.withCollectionExposure((media, httpMethods) -> httpMethods.disable(unsupportedOperations));

		config.getExposureConfiguration().forDomainType(ProductCategory.class)
				.withItemExposure((media, httpMethods) -> httpMethods.disable(unsupportedOperations))
				.withCollectionExposure((media, httpMethods) -> httpMethods.disable(unsupportedOperations));
	}

}
