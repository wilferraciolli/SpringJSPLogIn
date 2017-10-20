package com.wilferraciolli.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The type Mvc web application initializer.
 * Create a MvcWebApplicationInitializer class, which will replace our traditional web.xml, to initialize the Servlet container.
 * Load the WebSecurityConfig and WebConfig classes using the getRootConfigClasses() and getServletConfigClasses() methods as follows.
 */
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebSecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
