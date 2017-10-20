package com.wilferraciolli.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

/**
 * The type Web config. Create a web @Configuration class annotated with @EnableWebMvc and @ComponentScan.
 * The ViewControllerRegistry can be used to forward the request straight through to a view (such as a JSP) without writing a controller class.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.wilferraciolli.spring.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * Configure view resolvers.
     *
     * @param registry the registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
    }

    /**
     * Add view controllers.
     *
     * @param registry the registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}
