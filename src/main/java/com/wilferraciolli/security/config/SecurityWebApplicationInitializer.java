package com.wilferraciolli.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * The type Security web application initializer. In Java based configuration,
 * you need to register the spring springSecurityFilterChain which is responsible for all security
 * (protecting the application URLs, validating submitted username and passwords, redirecting to the log in form, etc) within your application.
 You can register the spring springSecurityFilterChain using the base class AbstractSecurityWebApplicationInitializer
 */
public class SecurityWebApplicationInitializer  extends AbstractSecurityWebApplicationInitializer {
}
