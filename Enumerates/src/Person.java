
public class Person {

  String role;
  String name;

  public Person(String name, String role) {
    this.name = name;
    this.role = role;
  }

  @Override
  public String toString() {
    return this.name + " (" + this.role + ')';
  }
}
