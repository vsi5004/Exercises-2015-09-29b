
public class Person {

    public enum Role {

        TEACHER, STUDENT

    }

    Role role;
    String name;

    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        String roleValue = this.role.name();
        return this.name + " (" + roleValue.toLowerCase() + ')';
    }
}
