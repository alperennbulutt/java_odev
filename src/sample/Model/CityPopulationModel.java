package sample.Model;

import javafx.beans.property.SimpleStringProperty;

public class CityPopulationModel {
    private SimpleStringProperty id;
    private SimpleStringProperty city;
    private SimpleStringProperty country;
    private SimpleStringProperty countryNumber;
    private  SimpleStringProperty continent;

    public CityPopulationModel(String id,String city, String country,String countryNumber,String continent ) {
        this.id= new SimpleStringProperty(id);
        this.country = new SimpleStringProperty(country);
        this.city=new SimpleStringProperty(city);
        this.countryNumber=new SimpleStringProperty(countryNumber);
        this.continent=new SimpleStringProperty(continent);

    }

    public void setId(String id) {
        this.id.set(id);
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public void setCountryNumber(String countryNumber) {
        this.countryNumber.set(countryNumber);
    }

    public void setContinent(String continent) {
        this.continent.set(continent);
    }


    public String getId(){
        return id.get();
    }
    public String getCity(){
        return city.get();
    }
    public String getCountry(){
        return country.get();
    }
    public String getCountryNumber(){
        return countryNumber.get();
    }
    public String getContinent(){
        return continent.get();
    }
}
