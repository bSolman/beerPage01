package com.example.demo.service;

import com.example.demo.model.Beers;
import com.example.demo.repo.BeerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer connected to BeerRepo interface. Provides some actions that can be performed on the database.
 */
@Service
public class BeerService {
    private BeerRepo beerRepo;

    /**
     * @param beerRepo current beerRepo interface object.
     */
    @Autowired
    public BeerService(BeerRepo beerRepo){
        this.beerRepo = beerRepo;
    }

    /**
     * @return A list of all beers in the database.
     */
    public List<Beers> getAllBeers(){
        return beerRepo.findAll();
    }

    /**
     * @param country String representation of the desired country to be displayed
     * @return a list of Beer objects.
     */
    // Note: Not used I now. But left for my own future reference. A little how to.
    public List<Beers> getAllBeersFromCountry(String country){
        return beerRepo.findByCountry(country);
    }

    /**
     * @param id of a beer.
     * @return one Beer object.
     */
    public Beers findBeerById(String id){
        return beerRepo.findById(id).get();
    }
}
