package mirea_lab1;
import java.lang.*;
public class Book {
    private String Title;
    private String author;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);

    }
    public void setTitle(String title) { this.Title = title; }
    public void setAuthor(String author) { this.author = author; }

    public String getBookTitle() {return this.Title;}
    public String getBookAuthor() {return this.author;}
    public String toString() {
        return "Book Title: " + "\nBall Author: " + this.author + "\n";
    }

}
