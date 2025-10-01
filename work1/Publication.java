package work1;

public class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;

    public Publication(String title, BookGenre genre, Date publishDate) {
        this.title = title;
        this.genre = genre;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }
    public BookGenre getGenre() {
        return genre;
    }
    public Date getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void printInfo() {
        System.out.print("Publication: " + title + " (" + genre + ", ");
        publishDate.printInfo();
        System.out.println(")");
    }
}
