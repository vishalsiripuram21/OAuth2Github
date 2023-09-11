package com.Security.OAuth20.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecureConfig {

  @Bean
  SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception{
    http.authorizeHttpRequests(request -> request.anyRequest().authenticated()).oauth2Login(Customizer.withDefaults());
    return http.build();
  }
}
