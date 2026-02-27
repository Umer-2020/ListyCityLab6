package com.example.listycitylab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest
{
    private CityList mockCityList()
    {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }


    private City mockCity()
    {
        return new City("Edmonton", "Alberta");
    }


    @Test
    void testAdd()
    {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(city));
    }


    @Test
    void testAddException()
    {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }


    @Test
    void testHasCity()
    {
        CityList cityList = mockCityList();
        City city = new City("Vancouver", "BC");
        assertFalse(cityList.hasCity(city));
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
    }


    @Test
    void testDelete()
    {
        CityList cityList = mockCityList();
        City city = new City("Calgary", "Alberta");
        cityList.add(city);
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteException()
    {
        CityList cityList = mockCityList();
        City city = new City("Toronto", "Ontario");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

}
