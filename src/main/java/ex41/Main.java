package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.io.*;
import java.util.*;
import org.junit.Test;

/* Pseudocode:

Public class Files{

    method readname(scanner input, arraylist name)
    {
    declare
    BufferedReader reader = new BufferedReader
    //add each line from input to the list of names in output
        while ((line = reader.readLine()) != null) {
                //add each line from input to the list of names in output
                name.add(line);
            }

        then close reader
    }

    sort function
    Collections.sort(sort)

    method outputname(arrayList)
    {

        create Writer object to write to output file
        FileWriter writer = new FileWriter

        write sorted list to output file
        for (String s : name) {

                writer.write(s);
                writer.write("\r\n");
            }

        then closer writer
    }

    Class Main
    {

        call class
        Files sortname= new Files();

        call methods in order

    }


}

 */

public class Main {

    public static void main (String[]args) throws IOException {

        //Create an ArrayList object to hold the lines of input file
        ArrayList<String> name = new ArrayList<String>();

        Files sortnames= new Files();

        sortnames.readname(name);
        sortnames.output(name);
        
    }


}
