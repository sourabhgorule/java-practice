import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number : ");
    int num = sc.nextInt();
    int temp = num;
    int sum = 0, rem;
    while (num > 0) {
      rem = num % 10;
      sum = (sum * 10) + rem;
      num = num / 10;
    }

    if (sum == temp) {
      System.out.println("number is palindrome");
    }
  }
}
