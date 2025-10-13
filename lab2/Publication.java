package lab2;

public class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;

    public Publication(String title, BookGenre genre, Date publishDate) {
        this.title = title;
        this.genre = genre;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Publication: " + title + " (" + genre + ", " + publishDate + ")";
    }
}
