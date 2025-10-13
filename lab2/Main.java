package lab2;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(25, 6, 1903);
        Date d2 = new Date(15, 3, 1975);
        Date d3 = new Date(1, 2, 1990);

        Author a1 = new Author("George", "Orwell", d1);
        Author a2 = new InternationalAuthor("Haruki", "Murakami", d2, "Japanese", "Japanese");
        Author a3 = new SelfPublishedAuthor("John", "Doe", d3, "Amazon Kindle", "www.johndoe.com");

        Book b1 = new Book("1984", BookGenre.FICTION, a1);
        Book b2 = new Book("Kafka on the Shore", BookGenre.FICTION, a2);
        Book b3 = new Book("My Indie Journey", BookGenre.NON_FICTION, a3);

        b1.addPublication(new Publication("First Edition", BookGenre.FICTION, new Date(8, 6, 1949)));
        b2.addPublication(new Publication("English Edition", BookGenre.FICTION, new Date(12, 9, 2005)));
        b3.addPublication(new Publication("Digital Release", BookGenre.NON_FICTION, new Date(1, 1, 2020)));

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
