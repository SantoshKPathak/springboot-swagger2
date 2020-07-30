package com.santoshpathak.learnings.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.ant("/api/**")) //select the API path you want to show in Swagger UI removing all other defaults. ** means all the child paths too.
				.apis(RequestHandlerSelectors.basePackage("com.santoshpathak.learnings")) //select the package which would be shown on swagger UI instead of default Spring packages like Model, ModelAndView etc
				.build();
	}
	
	@Bean
	  public ApiInfo apiInfo() {
	    final ApiInfoBuilder builder = new ApiInfoBuilder();
	    builder
	    	.title("Swagger SpringBoot Demo API")
	    	.version("2.0")
	    	.license("Free to Use")
	    	.licenseUrl("pathaksa@us.ibm.com")
	        .description("The API provides a platform to add contact details")
	        .contact(new Contact("Santosh Pathak", "www.ibm.com", "pathaksa@us.ibm.com"));

	    return builder.build();
	  }
	

}
