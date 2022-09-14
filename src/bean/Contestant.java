package bean;

public class Contestant extends Person{

    private String username;

    public Contestant() {
    }

    public Contestant(String username, String name, String surname, int age) {
        super(name, surname, age);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return getUsername() + " " + getName() + " " + getSurname() +
                " " + getAge();
    }

}
