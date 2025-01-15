import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void addRole(Role role) {
        if (!roles.contains(role)) {
            roles.add(role);
        }
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }

    @Override
    public String toString() {
        return String.format("%s at %s with roles: %s", name, department, roles);
    }
}