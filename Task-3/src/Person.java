public class Person {

    private String name;
    private String phone;
    private String email;

    public Person(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public Person(String name, String email) {
        this(name);
        this.email = email;
    }

    public Person(String name, String email, String phone) {
        this(name, email);
        this.phone = phone;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%s  %s  %s", name, (email == null ? "" : email), (phone == null ? "" : phone));
    }
}
