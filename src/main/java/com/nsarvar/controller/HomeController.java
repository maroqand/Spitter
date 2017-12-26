package com.nsarvar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nsarvar on 12/25/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

}
