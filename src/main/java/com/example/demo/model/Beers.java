package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;


/**
 * This is the model-class that is used to collect data from the mongoDB-collection that is used.
 */
@Repository
@Getter @Setter @NoArgsConstructor
@Document(collection = "beers")
public class Beers {
    @Id
    private String id;

    @Field
    private String country;

    @Field
    private String type;

    @Field
    private String name;

    @Field
    private String description;

    @Field
    private String path;

    /**
     * @param country String The country of origin for the beer.
     * @param type String The type of beer.
     * @param name String name of Beer.
     * @param description String description of beer.
     * @param path String path to img connected to beer.
     */
    public Beers(String country, String type, String name, String description, String path) {
        this.country = country;
        this.type = type;
        this.name = name;
        this.description = description;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
