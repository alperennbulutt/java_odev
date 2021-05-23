package sample.Model;


import javafx.beans.property.SimpleStringProperty;

public class BrandValuesModel {

        private SimpleStringProperty date;
        private SimpleStringProperty company;
        private SimpleStringProperty country;
        private SimpleStringProperty companyNumber;
        private  SimpleStringProperty category;
        public BrandValuesModel(String date,String company,String country,String companyNumber,String category){
            this.date=new SimpleStringProperty(date);
            this.company=new SimpleStringProperty(company);
            this.country=new SimpleStringProperty(country);
            this.companyNumber=new SimpleStringProperty(companyNumber);
            this.category=new SimpleStringProperty(category);
        }

    public void setDate(String date) {
        this.date.set(date);
    }

    public void setCompany(String company) {
        this.company.set(company);
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber.set(companyNumber);
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public String getDate() {
        return date.get();
    }

    public String getCompany() {
        return company.get();
    }

    public String getCountry() {
        return country.get();
    }

    public String getCompanyNumber() {
        return companyNumber.get();
    }

    public String getCategory() {
        return category.get();
    }

}
