package com.ares.rocket_spboot.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration implements SecurityConfigInt {
    @Override
    public void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN","USER");
        auth.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
        auth.inMemoryAuthentication().withUser("manager").password("1234").roles("AGENT","USER");
    }
    @Override
    public void configure(HttpSecurity http)throws Exception{
        http.authorizeRequests().anyRequest().authenticated();
        http.formLogin();
    }
}
