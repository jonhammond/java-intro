public class Person {
  //Instance level variables
  // to be used anywhere in the class
  public String first;
  public String last;

  //Constructor method
  public Person(String first, String last) {
    this.first = first;
    this.last = last;
  }

  //Fullname method
  public String fullName() {
    return this.first + " " + this.last;
  }

  public static void main(String [] args) {
    Person goat = new Person("John", "Elway");

    goat.fullName();
    System.out.println(goat.fullName());
  }

}
