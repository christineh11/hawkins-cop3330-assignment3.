package ex41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class Files {

    public static void readname( ArrayList<String> name) throws IOException {
        {
            // reads in data from input file
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex41\\exercise41_input.txt"));
            String line = "";

            while ((line = reader.readLine()) != null) {
                //add each line from input to the list of names in output
                name.add(line);
            }

            // close reader
            if (reader !=null)
            reader.close();

            // sort the names
            Collections.sort(name);

        }
    }

    public static void output( ArrayList<String> name) throws IOException {
        {

            //creates writer to output file
            FileWriter writer = new FileWriter("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex41\\exercise41_output.txt");


            writer.write("Total of "+name.size()+" names:\n");
            writer.write("--------------------------\n");

            for (String s : name) {
                writer.write(s);
                writer.write("\r\n");
            }


            // close writer
            if (writer !=null)
            writer.close();

        }
    }
}