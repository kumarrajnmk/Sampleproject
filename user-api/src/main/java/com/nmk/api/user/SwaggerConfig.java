package com.nmk.api.user;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("private-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return (regex("/api/v1/user.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("User API")
				.description("User API reference for developers")
				.termsOfServiceUrl("http://javainuse.com")
				.contact("satishnmkglobal@gmail.com").license("User License")
				.licenseUrl("satishnmkglobal@gmail.com").version("1.0").build();
	}
}
