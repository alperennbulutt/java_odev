package sample.Data;

public class BrandValuesParser {

   private String date;
   private String brand;
   private String country;
   private int value;
   private String department;


    public BrandValuesParser(String date, String brand , String country ,int value , String department) {
        this.date = date;
        this.brand = brand;
        this.country = country;
        this.value = value;
        this.department = department;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public void setDepartment(String department) {
        this.department = department;
    }
}
