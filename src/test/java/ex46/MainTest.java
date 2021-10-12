package ex46;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws FileNotFoundException {

        Histogram pr = new Histogram();
        HashMap<String, Integer> map = pr.getMap();

        //read file
        pr.file();

        HistogramItem items= new HistogramItem(map);

        // print results
        items.print();
    }
}