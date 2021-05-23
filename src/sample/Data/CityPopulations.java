package sample.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityPopulations {

    public void GetDataCityPopulation() throws IOException {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("brand_values.txt"))) {

            String specialCharacter = ",";

            List<BrandValuesParser> brandValues = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                //System.out.println(line);

                String[] values = line.split(specialCharacter);


                BrandValuesParser valuesBrand = new BrandValuesParser();

                // valuesBrand.setValue(Integer.parseInt(values[3]));

                //valuesBrand.setDate(Integer.parseInt(values[0]));
                //valuesBrand.setBrand((values[1]));
                //valuesBrand.setCountry((values[2]));
                //valuesBrand.setValue(Integer.parseInt(values[3]));
                //valuesBrand.setDepartment((values[4]));

                String date = valuesBrand.setDate(values[0]);
                String brand = valuesBrand.setBrand(values[1]);
                String country = valuesBrand.setCountry(values[2]);
                String value = valuesBrand.setBrand(values[3]);
                String department = valuesBrand.setDepartment(values[4]);
                System.out.println(brand);


            }


        }
    }
}
