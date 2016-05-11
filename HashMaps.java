import java.util.HashMap;

public class HashMaps {

  public static void main(String[] args) {

    HashMap<Integer, String> students = new HashMap<>();

    students.put(1, "Karan Withrow");
    students.put(2, "Tonja Fitting");
    students.put(3, "April Fronk");
    students.put(4, "Jon Hammond");
    students.put(5, "Shaquille O'Neal");

    System.out.println("----Student HashMap----");
    for(Integer id : students.keySet()) {
      System.out.println(id + " " + students.get(id));
    };

    // students.remove("Jon Hammond");
    //
    // System.out.println("----After Removal of (String) Jon Hammond----");
    // for(String student : students.values()) {
    //   System.out.println(student);
    // };

  }
}
