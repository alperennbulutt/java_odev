package sample;

public class BrandValuesParser {

   private String date;
   private String brand;
   private String country;
   private int value;
   private String department;

    public String getDate() {
        return date;
    }

    public String setDate(String date) {
        this.date = date;
        return date.toString();
    }

    public String getBrand(String value) {
        return brand;
    }

    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public String getCountry() {
        return country;
    }

    public String setCountry(String country) {
        this.country = country;
        return country;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDepartment() {
        return department;
    }

    public String setDepartment(String department) {
        this.department = department;

        return department;
    }

    public BrandValuesParser() {

    }

}
