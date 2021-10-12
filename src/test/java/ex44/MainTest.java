package ex44;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Scanner input = new Scanner(System.in);


        // continues asking product name till name matches json file

        while (true) {

            try {
                System.out.print("What is the product name? ");
                String name = input.next();

                //creates new object for class
                product files= new product(name);
                files.jsonfile();


            }
            //if name is not in file it catches invalid name
            catch(Exception e)
            {
                System.out.println("Sorry, that product was not found in our inventory");
            }
        }

    }
}





