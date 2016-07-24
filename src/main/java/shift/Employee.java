package shift;

import org.springframework.data.annotation.Id;

public class Employee {

  @Id
  private String id;

  private String firstName;
  private String lastName;

  public Employee() {}

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName  = lastName;
  }

  public String getId(){
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
      "Employee[id=%s, firstName='%s', lastName='%s']",
      id, firstName, lastName);
  }

}
