package com.example.demo.controller;

import com.example.demo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The controller used to pass data to the webpage. There are two models passed to the templates. "index" and "beers"
 */
@Controller
@RequestMapping("/web")
public class BeerWebController {

    @Autowired
    BeerService beerService;

    /**
     * @param model *-*
     * @return a model of all beers. Passed to the webpage "index".
     */
    //Metoden som webTemplaten kopplar emot. Viktigt att String-värdet som returneras kan
    //matchas mot namnet på html-filen (templaten).
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("index", beerService.getAllBeers());
        return "index";
    }

    /**
     * @param id beer id is the requested value.
     * @param model *-*
     * @return a model of the requested beer. Passed to the webpage "beers".
     */
    @GetMapping("/oneBeer")
    public String getOneBeer(@RequestParam(value = "id", required = true) String id, Model model){
        model.addAttribute("beers", beerService.findBeerById(id));
        return "beers";
    }
}
