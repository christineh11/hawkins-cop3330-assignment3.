package ex42;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static void main (String[]args) throws IOException

    {

        data table= new data();

        System.out.println("                            Last        First       Salary");
        System.out.println("                            --------------------------------");

        table.readinput();


    }
}



