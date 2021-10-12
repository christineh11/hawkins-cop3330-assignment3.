package ex43;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Website {
    //create variables
    private String name;
    private String author;
    private String js;
    private String css;

    //constructors
    public Website(String name, String author, String css, String js) {
        this.name = name;
        this.author = author;
        this.css = css;
        this.js = js;
    }

    public void htmlfiles() throws IOException {

        //get the data to ask the questions then write the html files and create folders
        // write files

        //creates writer to output file
        FileWriter writer = new FileWriter("C:\\Users\\chris\\Assignment 3(41-46)\\src\\main\\java\\ex43\\index.html");

        //html file template
        writer.write("<html>\n" +
                "<head>\n" +
                "<" + author + " http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8>\n" +
                "<" + name + ">" + "$title" + "<" + name + ">\n" +
                "</head>\n" +
                "<body>$body\n" +
                "</body>\n" +
                "</html>");

        writer.close();
    }

        public void output() {


            //outputs file names
        System.out.println("Created ./website/" + name);
        System.out.println("Created ./website/" + name + "/index.html");

        // create css file
       if (css.equalsIgnoreCase("y")) {
          System.out.println("Created ./website/" + name + "/" + "css" + "/");
        }

       // create js file
        if (js.equalsIgnoreCase("y")) {
          System.out.println("Created ./website/" + name + "/" + "js" + "/");
       }

    }
}