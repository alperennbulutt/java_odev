package sample.Data;

public class CityPopulationsParser {

    private String year;
    private String city;
    private String country;
    private String population;
    private String continent;


    public String Year(String year) {
        this.year = year;
        return year;
    }


    public String City(String city) {
        this.city = city;
        return city;
    }


    public String Country(String country) {
        this.country = country;
        return country;
    }

    public String Population(String population) {
       this.population = population;
       return population;
    }


    public String Continent(String continent) {
        this.continent = continent;
        return continent;
    }


}
