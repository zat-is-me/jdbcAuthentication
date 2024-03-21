package com.tatek.jdbcAuthentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityFilterConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/notice",
                                "/api/v1/contact",
                                "/api/v1/register")
                        .permitAll()
                        .requestMatchers("/api/v1/myAccount",
                                "/api/v1/myCards",
                                "/api/v1/myBalance",
                                "/api/v1/myLoans")
                        .authenticated()
                )
                .httpBasic(withDefaults());
        return httpSecurity.build();
    }
}




















