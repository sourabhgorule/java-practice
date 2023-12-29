import java.util.Scanner;

public class SwapNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter first the number : ");
    int num1 = sc.nextInt();
    System.out.println("please enter second the number : ");
    int num2 = sc.nextInt();

    usingThirdVar(num1, num2);
    withoutUsingThirdVar(num1, num2);
  }

  public static void usingThirdVar(int num1, int num2) {
    int num3;

    System.out.println("prev " + "num1: " + num1 + " and num2: " + num2);

    num3 = num1;
    num1 = num2;
    num2 = num3;

    System.out.println("after " + "num1: " + num1 + " and num2: " + num2);
  }

  public static void withoutUsingThirdVar(int num1, int num2) {
    System.out.println("prev " + "num1: " + num1 + " and num2: " + num2);

    num1 = num1 * num2;
    num2 = num1 / num2;
    num1 = num1 / num2;

    System.out.println("after " + "num1: " + num1 + " and num2: " + num2);
  }
}
