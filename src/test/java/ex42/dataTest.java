package ex42;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class dataTest {

    @Test
    void data() {
    }

    @Test
    void readinput() {
        String line = "";
        String splitBy = ",";

        try {
            //reads input file
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex42\\exercise42_input.txt"));
            while ((line = reader.readLine()) != null) {// splits at comma
                String[] table = line.split(splitBy);

                System.out.format("%32s%10s%16s\n", table[0], table[1], table[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
