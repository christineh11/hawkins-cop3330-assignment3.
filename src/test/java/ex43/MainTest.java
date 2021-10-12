package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws IOException {//input all the data
        Scanner input = new Scanner(System.in);


        System.out.print("Site name: ");
        String name= input.nextLine();

        System.out.print("Author: ");
        String author= input.nextLine();

        System.out.print("Do you want a folder for CSS: ");
        String css= input.next();

        System.out.print("Do you want a folder for JavaScript: ");
        String js= input.next();

        Website files= new Website(name,author,css,js);

        files.htmlfiles();
        files.output();


    }
}
