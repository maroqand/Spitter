package com.nsarvar.controller;

import com.nsarvar.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nsarvar on 12/25/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    private SpittleRepository spittleRepository;


    @RequestMapping(method= RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20));

        return "spittles";
    }
}
