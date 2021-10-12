package ex45;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class word {

    private String out;

    public word(String out) {
        this.out = out;

    }

    public void input() throws IOException {

        // reads in file
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex45\\exercise45_input.txt"));

        //creates variables
        String line = "", oldtext = "";

        //reads from input file
        while((line = reader.readLine()) != null) {
            oldtext += line + "\r\n";
        }
        reader.close();

        //replaces the words
         String replacedtext  = oldtext.replaceAll("utilize", "use");

         //writes to new file with name of file entered
        FileWriter writer = new FileWriter("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex45\\"+out+".txt");
        writer.write(replacedtext);
        writer.close();

    }

}
