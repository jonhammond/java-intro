public class Rect {
  //Instance variables to be used anywhere in class
  public int width;
  public int length;

  //Constructor method
  public Rect(int width, int length) {
    this.width = width;
    this.length = length;
  }

  //Area method
  public int area () {
    return this.width*this.length;
  }

  //Main method
  public static void main(String [] args) {
    Rect first = new Rect(100, 200);
    first.area();

    System.out.println("Rectangle area: " + first.area());
  }
}
