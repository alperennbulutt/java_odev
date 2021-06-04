package sample.Data;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;



public class GetData {


    public static void GetCountryPopulation() {

        //Reading XML File//

        String xmlFile = "country_populations.xml";

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();
            System.out.println(root.getNodeName());

            NodeList countryList = root.getElementsByTagName("record");
            System.out.println("============================");
            root.getChildNodes();
            System.out.println("Number of Countries: " + countryList.getLength());

            for (int temp = 0; temp < countryList.getLength(); temp++) {


                Node node = countryList.item(temp);
                System.out.println(" ");
                if (node.getNodeType() == Node.ELEMENT_NODE) {


                    Element eElement = (Element) node;
                    System.out.println("Name : " + eElement.getElementsByTagName("field").item(0).getTextContent());
                    System.out.println("Country : " + eElement.getElementsByTagName("field").item(1).getTextContent());
                    System.out.println("Year : " + eElement.getElementsByTagName("field").item(2).getTextContent());
                    System.out.println("Value : " + eElement.getElementsByTagName("field").item(3).getTextContent());
                    System.out.println("Category : " + eElement.getElementsByTagName("field").item(4).getTextContent());




                }
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }


    }


    public static void GetBrandValue() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("brand_values.txt"))) {

            String line = null;

            String specialCharacter = ",";


            while ((line = bufferedReader.readLine()) != null) {


                String[] brandValues = line.split(specialCharacter);

                BrandValuesParser valuesBrand = new BrandValuesParser();


                if(brandValues.length==5) {
                    String date = valuesBrand.Date(brandValues[0]);
                    String brand = valuesBrand.Brand(brandValues[1]);
                    String country = valuesBrand.Country(brandValues[2]);
                    String value = valuesBrand.Value(brandValues[3]);
                    String department = valuesBrand.Department(brandValues[4]);
                    System.out.println(date + " " + brand + " " + country + " " + value + " " + department);

                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void GetCityPopulations() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("city_populations.txt"))) {

            String line = null;

            String specialCharacter = ",";


            while ((line = bufferedReader.readLine()) != null) {


                String[] cityValues = line.split(specialCharacter);

                CityPopulationsParser populationCity = new CityPopulationsParser();


                if(cityValues.length==5) {
                    String year = populationCity.Year(cityValues[0]);
                    String city = populationCity.City(cityValues[1]);
                    String country = populationCity.Country(cityValues[2]);
                    String population = populationCity.Population(cityValues[3]);
                    String continent = populationCity.Continent(cityValues[4]);
                    System.out.println(year + " " + city + " " + country + " " + population + " " + continent);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
