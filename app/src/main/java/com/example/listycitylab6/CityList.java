package com.example.listycitylab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps a list of city objects
 */
public class CityList
{
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    /**
     * Checks if a city belongs in the list.
     * @param city The city to find
     * @return boolean True if found
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }


    /**
     * Deletes a city or throws exception if not found.
     * @param city City to remove
     * @throws IllegalArgumentException if city is missing
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not in list");
        }
        cities.remove(city);
    }


    /**
     * Counts total cities in the list.
     * @return int total count
     */
    public int countCities() {
        return cities.size();
    }
}
