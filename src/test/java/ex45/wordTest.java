package ex45;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class wordTest {
   public String out;
    @Test


    void input() throws IOException {


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
