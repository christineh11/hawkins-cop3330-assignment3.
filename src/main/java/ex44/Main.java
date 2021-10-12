package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


/* Pseudocode:

Public class product
{
//create variables
    private name
    private price
    private quantity

//constructors
    public void product( name, price, quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }

    public void jsonfile( name (from scanner in main) ) {


      JSONparer= parser
      Object obj= parser.parse(Filereader("")

     //get array from json file
      JSONArray subjects =  jsonObject.get("products");



    for(subjects)

     String file = (String) json.get("name");
     if (name=file)
     print name, price quantity
     flag=1
     break

     if (flag=0)

     print product not found

}

 public static void Main()

    {
       Scanner inout

       while (true)
       {
        try{

        print "what product"
        name= input.next

        product file = new file
        files.jsonfile(name)

        }catch
        print "product not found"

       }



}

 */




import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args)  {
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





