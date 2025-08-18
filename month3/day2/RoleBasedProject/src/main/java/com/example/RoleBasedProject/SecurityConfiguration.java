package com.example.RoleBasedProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration {
    

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http
            .authorizeHttpRequests(auth -> auth
            .requestMatchers("/", "/login", "/register", "/css/**", "/js/**").permitAll().anyRequest().authenticated()
            )
            .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/", true).permitAll()
            )
            .logout(logout -> logout.permitAll());
            
        return http.build();
    }
}
