package ex43;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

class WebsiteTest {
    //create variables
    private String name;
    private String author;
    private String js;
    private String css;

    //constructors
    public void Website(String name, String author, String css, String js) {
        this.name = name;
        this.author = author;
        this.css = css;
        this.js = js;
    }

    @Test
    void htmlfiles() throws IOException {
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
    @Test
    void output() {

        //outputs file names
        System.out.println("Created ./website/" + name);
        System.out.println("Created ./website/" + name + "/index.html");


    }
}