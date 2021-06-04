package sample.Data;

public class BrandValuesParser {

   private String date;
   private String brand;
   private String country;
   private String value;
   private String department;


    public String Date(String date) {
        this.date = date;
        return date;
    }


    public String Brand(String brand) {
        this.brand = brand;
        return brand;
    }


    public String Country(String country) {
        this.country = country;
        return country;
    }


    public String Value(String value) {
        this.value = value;
        return value;
    }



    public String Department(String department) {
        this.department = department;
        return department;
    }
}
