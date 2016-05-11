public class Student {
  // private properties are declared
  private int id;
  private String firstName;
  private String lastName;

  // constructor
  public Student (int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // getter and setter for id and firstName. The same would be written for all the properties. IDEs will usually do this for you.
  public int getId () {
    return this.id;
  }

  public void setId (int id) {
    this.id = id;
  }

  public String getFirstName () {
    return this.firstName;
  }

  public void setFirstName (String firstName) {
    this.firstName = firstName;
  }

  public String getLastName () {
    return this.lastName;
  }

  public void setLastName (String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

}
