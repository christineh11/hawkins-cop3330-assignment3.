package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


/* Pseudocode:

Public class histogram
{
    private Scanner scan
    private HashMap<String, Integer> map

    public read
    {
        bufferreader= newfile(file)

          try {

            while (scan.hasNext())
                String input = scan.nextLine();
                String arr[] = input.split(" ")

                 for ( i = 0; i < length; i++) {

                    String key = arr[i];

                    if map.contains (key)
                    counter++
    `               }


            } catch
            print invalid
    }

}

public class histogramitem
{
 private HashMap<String, Integer> map

    String keys[] = new String
    Integer counter[] = new Integer

        // iterate map

        for (Map.Entry<String, Integer> ) {

            keys[k] = entry.getKey()

            counter[k++] = entry.getValue()

        }

        int storecounter[] = new int

        String storekeys[] = new String


 //sort
        for(int i=0; i<map.size();i++) {

            int value = counter[i];

            for(int j=0; j<storecounter.length;j++) {

                if(value == storecounter[j]) {

                    tkeys[i] = keys[j]

                }

            }

        }

        // print histogram

        for(int i=0;i<map.size();i++) {

            int value = storekeys[i]


            for(int j=0; j<value; j++) {
              print("*")

            }

}

 public static void Main()

    {
      Historgram obj= new histogram()
        HashMap<String, Integer> map = getMap()

      obj.readfile

        HistogramItem items= new HistogramItem(map)

        itemps.printresults


}

 */






import java.io.*;
import java.util.*;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        Histogram pr = new Histogram();
        HashMap<String, Integer> map = pr.getMap();

        //read file
        pr.file();

        HistogramItem items= new HistogramItem(map);

        // print results
        items.print();

    }

}