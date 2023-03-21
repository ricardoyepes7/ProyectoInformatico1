package com.innovasoft.PO2Academy.configuration;

import com.innovasoft.PO2Academy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {
    @Autowired
    private UserService userService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/static/**","/css/**","/images/**","/js/**")
                .permitAll()
                .anyRequest().authenticated();
        http
                .formLogin()
                .loginProcessingUrl("/singin")
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/home")
                .usernameParameter("username")
                .passwordParameter("password");

        return http.build();

    }

    @SuppressWarnings("deprecation")
    @Bean
    public NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
