package com.nmk.api.user.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				// HTTP Basic authentication
				.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET, "/api/v1/user/**").hasRole("USER")
				
				  .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
				 .antMatchers(HttpMethod.PUT, "/books/**").hasRole("ADMIN")
				 .antMatchers(HttpMethod.PATCH, "/books/**").hasRole("ADMIN")
				  .antMatchers(HttpMethod.DELETE, "/books/**").hasRole("ADMIN")
				 
				.and().csrf().disable().formLogin().disable();
				

	}*/

	  @Override
	   protected void configure(HttpSecurity http) throws Exception
	   {
	       http.httpBasic()
	           .and()
	           .authorizeRequests()
	           .anyRequest().authenticated() ;
	   }
/*	
	  @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 throws Exception { auth.inMemoryAuthentication()
	  .withUser("kumar").password(passwordEncoder().encode("password")).roles(
	 "USER") .and()
	  .withUser("admin").password(passwordEncoder().encode("password")).roles(
	  "USER", "ADMIN"); }*/
	  
	  
	  
	 
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.authoritiesByUsernameQuery("select uid, ROLE from ecomm_user where uid=?")
				.usersByUsernameQuery("select uid, pwd, 1 as enabled  from ecomm_user where uid=?");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
