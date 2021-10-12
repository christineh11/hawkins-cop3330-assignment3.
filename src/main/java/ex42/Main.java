package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


/* Pseudocode:

Public class data{

//string operation (split) to get the text up to first comma
public static void readinput(string last name, string first name, salary)
String line = "";
String splitBy = ",";
try
{
//parsing a CSV file into BufferedReader class constructor
BufferedReader reader = new BufferedReader(new FileReader("file"));
while ((line = reader.readLine()) != null)
{
String[] table = line.split(splitBy);    // use comma as separator
 table[0] = lastname;
 table[1]= firstname;
 table[2]=salary;
}
}
// create table

public static void print(string lastname, string first name, salary)

System.out.format("%32s%10s%16d", lastname, firstname, salary);

 }

public class main
{

data table= new data();
//call method

table.readinput()



}

 */


import java.io.IOException;


public class Main {

    public static void main (String[]args) throws IOException

    {

        data table= new data();

        System.out.println("                            Last        First       Salary");
        System.out.println("                            --------------------------------");

        table.readinput();


    }
}

