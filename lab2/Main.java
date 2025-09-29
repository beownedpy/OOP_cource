package lab2;

import lab1.*;
import lab1.Publication;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell", new Date(25, 6, 1903));
        Book book1 = new Book("1984", BookGenre.FICTION, author1);

        lab1.Publication pub1 = new lab1.Publication("First Edition", BookGenre.FICTION, new Date(8, 6, 1949));
        lab1.Publication pub2 = new Publication("Anniversary Edition", BookGenre.FICTION, new Date(8, 6, 1999));

        book1.addPublication(pub1);
        book1.addPublication(pub2);

        book1.printInfo();
        System.out.println();

        book1.printShortInfo();

        author1.setName("Eric");
        author1.setSurname("Blair");
        System.out.println();
        book1.printShortInfo();
    }
}