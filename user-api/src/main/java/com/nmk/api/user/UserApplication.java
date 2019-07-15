package com.nmk.api.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EntityScan("com.nmk.ecomm.service.entity")
@ComponentScan(basePackages = "com.nmk.api.user")
@EnableJpaAuditing
  
public class UserApplication {
	private  final static Logger logger = LoggerFactory.getLogger(UserApplication.class);

 	public static void main(String[] args) {
		try {
			
			logger.debug("######## Starting UserApplication : SpringApplication main()  GOT INVOKED ########");

			SpringApplication.run(UserApplication.class, args);
		} catch (Exception e) {
			logger.error("####### Exception in UserApplication : SpringApplication main()  GOT INVOKED #######" +e.getMessage());

			e.printStackTrace();
		}
	}
/*	@Bean
	public FilterRegistrationBean<LoggingFilter> loggingFilter() {
		FilterRegistrationBean registrationBean;

		try {
			logger.debug("######## Starting UserApplication : FilterRegistrationBean ()  GOT INVOKED ########");

			FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();
			registrationBean.setFilter(new LoggingFilter());
			registrationBean.addUrlPatterns("/api/*");
		} catch (Exception e) {
			logger.error("####### Exception in UserApplication : FilterRegistrationBean ()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}
		return registrationBean;
	}*/
}
