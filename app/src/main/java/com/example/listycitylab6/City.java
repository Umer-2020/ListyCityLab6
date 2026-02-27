package com.example.listycitylab6;


/**
 * This class represents a City with a name and province.
 */
public class City implements Comparable<City>
{
    private String city;
    private String province;


    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }


    /**
     * This returns the name of the city
     * @return
     * Return the name
     */
    public String getCity() {
        return city;
    }


    /**
     * This returns the province of the city
     * @return
     * Return the province
     */
    public String getProvince() {
        return province;
    }


     /**
     * Compares city names lexicographically
     * @param city The other city object
     * @return 0 if names are equal, non-zero otherwise
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCity());
    }
}
