package Classes_Objects;

import java.util.Scanner;

/**
 * BookBase
 */

/*
 * •	Create a class called "Book" with properties such as "title", "author", and "publisher".
 *       Implement the necessary getter and setter methods for each property.
 */
 class Book {
    private String title;
    private String author;
    private String publisher;

    Book(String title,String author, String publisher){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
    }
    private void setTitle(String title) {
        this.title = title;
    }
    private void setAuthor(String author) {
        this.author = author;
    }
    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    private String getAuthor() {
        return author;
    }
    private String getPublisher() {
        return publisher;
    }
    private String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Title: "+ this.getTitle() +", Author: "+ this.getAuthor()+", Publisher :"+ this.getPublisher();
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the book Title: ");
        String book = in.nextLine();
        System.out.println("Enter the Author name :");
        String  author = in.nextLine();
        System.out.println("Enter the publisher name: ");
        String publisher = in.nextLine();

        Book bk= new Book(book, author, publisher);
        System.out.println(
            bk.toString()
        );
        in.close();
    }
}
