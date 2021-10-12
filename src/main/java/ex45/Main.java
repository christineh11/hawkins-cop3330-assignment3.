package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


/* Pseudocode:

Public class word
{

    public void input( out (from scanner in main) ) {

        bufferreader= new file("")

        //read all strings
         String line = "", oldtext = ""
        while((line = reader.readLine()) != null)
            oldtext += line
          reader close

        text=old.replaceall(old,new)

        filewriter write= newfile(+outputname+"txt)
        writer.write(text)
        writer close


}

 public static void Main()

    {
       Scanner input

        print name of output file
        outputname=input.next

        word file= new word()

        file.input(outputname)



}

 */






import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        //scans for name of output file
        System.out.println("What is the name of the output file?");
        String out=input.next();
        word file= new word(out);

        file.input();


    }
}






