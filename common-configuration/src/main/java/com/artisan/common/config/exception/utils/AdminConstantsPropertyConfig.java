package com.artisan.common.config.exception.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "exp")
@Getter
@Setter
public class AdminConstantsPropertyConfig {

	private String detailsExistsAlready;

}
