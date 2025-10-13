package lab2;

public class InternationalAuthor extends Author {
    private String nationality;
    private String language;

    public InternationalAuthor(String firstName, String lastName, Date birthDate, String nationality, String language) {
        super(firstName, lastName, birthDate); // вызывает конструктор Author
        this.nationality = nationality;
        this.language = language;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", nationality: %s, language: %s", nationality, language);
    }
}
