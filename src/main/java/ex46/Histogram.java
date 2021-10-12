package ex46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Histogram {

    // instance variable

    private Scanner scan;
    private HashMap<String, Integer> map;

    // constructor

    public HashMap<String, Integer> getMap(){

        return map;

    }

    public Histogram() throws FileNotFoundException {


        // read file
        BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex46\\exercise46_input.txt"));

        scan = new Scanner(file);
        map = new HashMap<String,Integer>();

    }


    public void file() {


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