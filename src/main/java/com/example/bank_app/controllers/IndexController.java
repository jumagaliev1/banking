package com.example.bank_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView getIndex(){
        ModelAndView getIndexPage = new ModelAndView("index");
        getIndexPage.addObject("PageTitle", "Home");
        System.out.println("In Index Page Controller");

        return getIndexPage;
    }

    @GetMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView getLoginPage = new ModelAndView("login");
        System.out.println("In login Page Controller");
        getLoginPage.addObject("PageTitle", "Login");

        return getLoginPage;
    }

    @GetMapping("/register")
    public ModelAndView getRegister() {
        ModelAndView getLoginPage = new ModelAndView("register");
        System.out.println("In register Page Controller");
        getLoginPage.addObject("PageTitle", "Register");

        return getLoginPage;
    }
}
