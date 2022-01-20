package com.example.demo.controller;

import com.example.demo.model.Beers;
import com.example.demo.repo.BeerRepo;
import com.example.demo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class that is used to populate beer data collection.
 */
@RestController
@RequestMapping("/beers")
public class AddBeerController {

    @Autowired
    private BeerRepo beerRepo;

    @PostMapping("/addBeers")
    public List<Beers> addBeers(@RequestBody List<Beers> beerList){
        return beerRepo.saveAll(beerList);
    }

}
