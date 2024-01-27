package com.leaning.soap.learningsoap.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;

import jakarta.annotation.PostConstruct;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
    	 Country spain = new Country();
         spain.setName("Spain");
         spain.setCapital("Madrid");
         spain.setCurrency(Currency.EUR);
         spain.setPopulation(46704314);

         countries.put(spain.getName(), spain);

         Country poland = new Country();
         poland.setName("Poland");
         poland.setCapital("Warsaw");
         poland.setCurrency(Currency.PLN);
         poland.setPopulation(38186860);

         countries.put(poland.getName(), poland);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}