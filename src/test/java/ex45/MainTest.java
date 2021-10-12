package ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws IOException {
        Scanner input = new Scanner(System.in);

        //scans for name of output file
        System.out.println("What is the name of the output file?");
        String out=input.next();
        word file= new word(out);

        file.input();


    }
}