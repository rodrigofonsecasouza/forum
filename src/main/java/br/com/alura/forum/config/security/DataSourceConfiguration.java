package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfiguration {
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/alura-forum");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DriverManagerDataSource ds) {
		return new JdbcTemplate(ds);
	}
}
