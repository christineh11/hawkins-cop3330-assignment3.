package ex43;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


/* Pseudocode:

Public class website
{
//create variables
    private String name;
    private String author;
    private String js;
    private String css;

//constructors
    public void PaymentCalculator( string name, string author, string css, string js)
    {
        this.name=name;
        this.author=author;
        this.css=css;
        this.js=js;
    }

    public void htmlfiles( string name, string author, string css, string js ) {

    //get the data to ask the questions then write the html files and create folders
    //most of this can be hard coded
    // write files

    //creates writer to output file
            FileWriter writer = new FileWriter("output"");

     write("Created ./website/+"name");
     write("Created ./website/+"name"+"index.html");

     writer.close()

     public output(){

     if(css.equals(y))
     {
        print("Created ./website/+"name"+"/"+"css"+"/");
     }
      if(js.equals(y))
     {
        print("Created ./website/+"name"+"/"+"js"+"/");
     }


}
}
 public static void Main()

    {
       //read in strings
       Scanner input = new Scanner(System.in)

        System.out.print("Site name: ");
        String name= input.next();

         System.out.print("Author: ");
        String author= input.next();

        System.out.print("Do you want a folder for JavaScript? ");
        String js= input.next();

        System.out.print("Do you want a folder for CSS? ");
        String css= input.next();

        website file = new website(name...)

}

}

 */


import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main (String[]args) throws IOException

    {

        //input all the data
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


