package lab2;

public class SelfPublishedAuthor extends Author {
    private String platform;
    private String website;

    public SelfPublishedAuthor(String name, String surname, Date birthdate,
                               String platform, String website) {
        super(name, surname, birthdate);
        this.platform = platform;
        this.website = website;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Platform: " + platform +
                ", Website: " + website;
    }
}
