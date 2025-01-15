import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Storage.fetchPersons();

        if (persons == null || persons.isEmpty()) {
            System.out.println("No persons found.");
        } else {
            System.out.println(persons);
        }
    }
}
