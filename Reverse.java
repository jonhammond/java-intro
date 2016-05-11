public class Reverse {

  public static String reverseString(String word) {
    String reversedWord = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reversedWord += word.charAt(i);
    }
    return reversedWord;
  }

  public static void main(String [] args) {
    String word = args[0];
    System.out.println(reverseString(word));
  }

}
