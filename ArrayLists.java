import java.util.ArrayList;

public class ArrayLists {

  public static void main(String[] args) {

    Student temika = new Student(1, "Temika", "Something");
    Student leroy = new Student(2, "Leroy", "Jenkins");

    ArrayList<Student> students = new ArrayList<>();

    students.add(temika);

    students.add(new Student(3, "John", "Elway"));

    for (Student student: students){
      System.out.println(student.getFullName());
    }
  }
}
