package com.online.healthcare.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity) throws Exception
	{    
		 httpsecurity.csrf().disable().authorizeHttpRequests((authorize)->{authorize.anyRequest().authenticated();}).httpBasic(Customizer.withDefaults());
		
		return httpsecurity.build();
	}

}
