import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number : ");
    int num = sc.nextInt();
    Boolean flag = true;
    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        flag = false;
      }
    }

    if (flag) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
  }
}
