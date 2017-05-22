package com.shawn.configProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertyBean")
public class ConfigProperty {

	@Value("#{propertyConfigurer[driverClassName]}")
	private String driverClassName;

	@Value("#{propertyConfigurer[validationQuery]}")
	private String validationQuery;

	@Value("#{propertyConfigurer[jdbc_url]}")
	private String jdbc_url;

	@Value("#{propertyConfigurer[jdbc_username]}")
	private String jdbc_username;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getValidationQuery() {
		return validationQuery;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	public String getJdbc_url() {
		return jdbc_url;
	}

	public void setJdbc_url(String jdbc_url) {
		this.jdbc_url = jdbc_url;
	}

	public String getJdbc_username() {
		return jdbc_username;
	}

	public void setJdbc_username(String jdbc_username) {
		this.jdbc_username = jdbc_username;
	}

	
	
}
