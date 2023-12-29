import java.util.Scanner;

public class StringPalndrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the String : ");
    String str = sc.next();
    int end = str.length();
    end--;
    boolean flag = true;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(end)) {
        flag = false;
        break;
      }
      end--;
    }
    if (flag) {
      System.out.println("string is palindrome");
    } else {
      System.out.println("string is not palindrome");
    }
  }
}
