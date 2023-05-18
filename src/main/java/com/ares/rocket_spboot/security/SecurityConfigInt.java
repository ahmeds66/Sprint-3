package com.ares.rocket_spboot.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfigInt {
    void configure(AuthenticationManagerBuilder auth)throws Exception;

    void configure(HttpSecurity http)throws Exception;
}
