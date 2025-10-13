package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private BookGenre genre;
    private Author author;
    private List<Publication> publications = new ArrayList<>();

    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public void addPublication(Publication pub) {
        publications.add(pub);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book: ").append(title)
                .append("\nGenre: ").append(genre)
                .append("\n").append(author)
                .append("\nPublications:");

        for (Publication p : publications) {
            sb.append("\n   - ").append(p);
        }

        sb.append("\n");
        return sb.toString();
    }
}
