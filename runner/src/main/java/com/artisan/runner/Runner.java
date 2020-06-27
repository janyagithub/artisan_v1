package com.artisan.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.artisan.common.config.exception.utils.AdminConstantsPropertyConfig;

@EnableConfigurationProperties(AdminConstantsPropertyConfig.class)
@EntityScan(basePackages = "com.artisan")
@EnableJpaRepositories(basePackages = "com.artisan")
@EnableJpaAuditing
@ComponentScan("com.artisan")
@SpringBootApplication
public class Runner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
		LOGGER.debug("SLF 4 J");
	}
}