package lab2;

import lab1.Date;

public class Author {
    private String name;
    private String surname;
    private lab1.Date birthdate;

    public Author(String name, String surname, lab1.Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public lab1.Date getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.print(name + " " + surname + " (born: ");
        birthdate.printInfo();
        System.out.print(")");
    }
}
