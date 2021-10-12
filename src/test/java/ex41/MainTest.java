package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws IOException {
        //Create an ArrayList object to hold the lines of input file
        ArrayList<String> name = new ArrayList<String>();

        Files sortnames= new Files();

        sortnames.readname(name);
        sortnames.output(name);

    }
}