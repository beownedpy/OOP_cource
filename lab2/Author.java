package lab2;

public class Author {
    private String name;
    private String surname;
    private Date birthdate;

    public Author(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Author: " + getFullName() + " (born: " + birthdate + ")";
    }
}
