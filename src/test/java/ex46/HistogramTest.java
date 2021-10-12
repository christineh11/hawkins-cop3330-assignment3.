package ex46;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {
    private Scanner scan;
    private HashMap<String, Integer> map;


    @Test
    void file() {
        try {

            while (scan.hasNext()) {

                String input = scan.nextLine();

                // split read by space

                String arr[] = input.split(" ");

                //loop through arr length
                for (int i = 0; i < arr.length; i++) {

                    String key = arr[i];

                    // if key is already in map then

                    if (map.containsKey(key)) {

                        // add 1 to counter

                        int counter = map.get(key);

                        counter++;

                        map.put(key, counter);

                    }

                    // if not, put it in the map

                    else {

                        map.put(key, 1);

                    }

                }

            }   scan.close();
        }catch(Exception e)
        {
            System.out.println("invalid");
        }


    }

}