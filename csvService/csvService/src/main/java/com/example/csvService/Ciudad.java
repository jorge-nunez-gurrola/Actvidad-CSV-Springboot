package com.example.csvService;

public class Ciudad {
    private String city;
    private double lat;
    private double lng;
    private String country;
    private String iso2;
    private String adminName;
    private String capital;
    private long population;
    private long populationProper;

    // Constructor vacío
    public Ciudad() {
    }

    // Constructor con todos los parámetros
    public Ciudad(String city, double lat, double lng, String country, String iso2, String adminName, String capital, long population, long populationProper) {
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.adminName = adminName;
        this.capital = capital;
        this.population = population;
        this.populationProper = populationProper;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getCountry() {
        return country;
    }

    public String getIso2() {
        return iso2;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public long getPopulationProper() {
        return populationProper;
    }

    // Setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setPopulationProper(long populationProper) {
        this.populationProper = populationProper;
    }
}
