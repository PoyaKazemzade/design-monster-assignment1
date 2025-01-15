public class EmployeeTest {
    public static void main(String[] args) {
        // Initial Roles
        Role engineer = new Role("Engineer");
        Role manager = new Role("Manager");

        // Create employees
        Employee employee1 = new Employee("Poya", "IT", engineer);
        Employee employee2 = new Employee("Jeremy", "HR", engineer);

        // Add roles
        employee1.addRole(manager);

        System.out.println(employee1);
        System.out.println(employee2);

        // Remove roles
        employee1.removeRole(manager);
        System.out.println(employee1);
    }
}
