package com.mailblackbox.auth;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by cypri on 14.03.2017.
 * @see https://spring.io/guides/tutorials/spring-boot-oauth2/
 */
@EnableAuthorizationServer
public class AuthApplication extends WebSecurityConfigurerAdapter {
}
