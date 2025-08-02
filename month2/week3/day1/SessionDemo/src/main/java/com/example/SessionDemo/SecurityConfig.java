package com.example.SessionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http
        .authorizeHttpRequests(
            auth -> auth.requestMatchers("/login", "/css/**", "/js/**").permitAll().anyRequest().authenticated()
        )
        .formLogin(
            form -> form.loginPage("/login").defaultSuccessUrl("/dashboard", true).permitAll()
        )
        .logout(
            logout -> logout.permitAll());

        return http.build();
    }   

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    }


    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        // ساخت کاربر به صورت دستی بدون Builder
        UserDetails user = new User(
                "admin", 
                encoder.encode("12345"), 
                java.util.Collections.singletonList(() -> "ROLE_USER")
        );

        return username -> {
            if (username.equals(user.getUsername())) {
                return user;
            } else {
                throw new UsernameNotFoundException("User not found");
            }
        };
    }
}
