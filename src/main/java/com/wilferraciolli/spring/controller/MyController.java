package com.wilferraciolli.spring.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type My controller.
 */
@Controller
public class MyController {

    /**
     * Index string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/")
    public String index(Model model){

    //Get authenticated user name from Security Context
    SecurityContext context = SecurityContextHolder.getContext();

    model.addAttribute("message", "You are logged in as " + context.getAuthentication().getName());
    return "index";
    }

}
