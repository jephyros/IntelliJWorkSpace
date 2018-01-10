package com.krchis.bootjsp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableJpaRepositories(basePackages = {"com.krchis.bootjsp.repository"})
public class WebMvcConfig extends WebMvcConfigurerAdapter {





}
