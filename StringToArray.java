import java.util.Scanner;

public class StringToArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the String : ");
    String str = sc.next();
    char[] charArray = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      charArray[i] = str.charAt(i);
    }
    String str2 = charArray.toString();
    System.out.println(str2);
  }
}
