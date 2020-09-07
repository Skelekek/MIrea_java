package mirea_lab1;
import java.lang.*;
public class Book_Test {
    public static void main(String[] args) {
    Book Book1 = new Book("The Master and Margarita", " Mikhail Bulgakov");
    System.out.println("Book Title: " + Book1.getBookTitle());
    System.out.println("Book Author: " + Book1.getBookAuthor() + "\n");
    }
}
