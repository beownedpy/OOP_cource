package lab2;

import lab1.Author;
import lab1.BookGenre;
import lab1.Publication;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private lab1.BookGenre genre;
    private Author author;
    private final List<lab1.Publication> publications = new ArrayList<>();

    public Book(String title, lab1.BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public void addPublication(lab1.Publication publication) {
        publications.add(publication);
    }

    public void printInfo() {
        System.out.println("Book: " + title);
        System.out.println("Genre: " + genre);
        System.out.print("Author: ");
        author.printInfo();
        System.out.println();
        System.out.println("Publications:");
        for (lab1.Publication p : publications) {
            System.out.print("   - ");
            p.printInfo();
        }
    }

    public void printShortInfo() {
        System.out.print("Book: " + title + ", Author: "
                + author.getName() + " " + author.getSurname()
                + ", Publications: " + publications.size());
        System.out.println();
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public lab1.BookGenre getGenre() {
        return genre;
    }
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Publication> getPublications() {
        return publications;
    }
}
