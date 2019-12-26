package com.company;

import java.util.StringTokenizer;

public class Address {
    String country, region, city, street, house, building, apartment;
    Address(String address)
    {
        StringTokenizer st = new StringTokenizer(address, ",.;-");
        country = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        building = st.nextToken();
        apartment = st.nextToken();
    }

    @Override
    public String toString()
    {
        return "Country: " + country + "\nRegion: " + region +
                "\nCity: " + city + "\nStreet: " + street +
                "\nHouse: " + house + "\nBuilding: " + building + "\nApartment: " + apartment;
    }
}
