package com.nsarvar.controller;

import com.nsarvar.model.Spittle;
import com.nsarvar.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

/**
 * Created by nsarvar on 12/25/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {


    @Autowired
    private SpittleRepository spittleRepository;

//    @Autowired
//    public SpittleController(SpittleRepository spittleRepository) {
//        this.spittleRepository = spittleRepository;
//    }

    public SpittleController() {
    }

    @RequestMapping(method= RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute("spittles",
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20));

        return "spittles";
    }

    @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
    public String spittle(@PathVariable long spittleId, Model model){
        Spittle spittle = spittleRepository.findOne(spittleId);
//        if(spittle == null)
//            throw new NullPointerException("Item not found");

        model.addAttribute("spittle", spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
