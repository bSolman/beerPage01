package com.example.demo.repo;

import com.example.demo.model.Beers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface that enables CRUD operations to mongodb collections.
 */
@Repository
public interface BeerRepo extends MongoRepository<Beers, String> {
    /**
     * @param country input country name to collect a list of beers with that origin.
     * @return A list of beers
     */
    List<Beers> findByCountry(String country);
}
