public class Ops {

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    return x*y;
  }

  public static int power(int x, int y) {
    int sol = 1;
    for (int i = 0; i < y; i++) {
      sol = sol * x;
    }
    return sol;
  }

  public static void main(String [] args) {
    System.out.println( sum(1,2) );
    System.out.println( multiply(3,5) );
    // Power method(base, exp)
    System.out.println( power(2, 5) );
  }
}
