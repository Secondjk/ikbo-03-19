package ru.mirea.pr2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.setGender(this.gender);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }

        this.gender = 'U';
    }

    @Override
    public String toString() {
        String gender = this.getGender() == 'F' ? "(ms)" : "(m)";

        return this.getName() + ' ' + gender + ' ' +
                "at " + this.getEmail()
        ;
    }
}
