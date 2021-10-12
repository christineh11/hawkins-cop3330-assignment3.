package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class productTest {
    public String name;




    @Test
    void jsonfile()  throws Exception {
            JSONParser parser = new JSONParser();

            //Read json file using parser
            Object obj = parser.parse(new FileReader("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex44\\exercise44_input.json"));

            //read in values
            JSONObject jsonObject = (JSONObject) obj;

            //Reading products array from  the file
            JSONArray subjects = (JSONArray) jsonObject.get("products");

            //Flag is used whether given string is present or not
            int flag = 0;


            for (Object subject : subjects) {
                //Create another json
                JSONObject json = (JSONObject) subject;
                //Get the name value to compare
                String file = (String) json.get("name");

                if (name.equalsIgnoreCase(file)) {

                    System.out.println("Name: " + file);
                    System.out.println("Price: " + json.get("price"));
                    System.out.println("Quantity: " + json.get("quantity"));
                    flag = 1;
                    break;

                }


            }
            //If flag value is zero, then value is not found
            if (flag == 0) {
                System.out.println("Sorry, that product was not found in our inventory");
            }
        }
    }

