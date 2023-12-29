import java.util.Scanner;

public class Armstrong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number : ");
    int num = sc.nextInt();
    int rem;
    int backup = num;
    int armstrong = 0;
    while (num > 0) {
      rem = num % 10;
      //   armstrong = (int) (armstrong + (Math.pow((double) 3, (double) rem)));
      armstrong = armstrong + (rem * rem * rem);
      num = num / 10;
    }

    if (armstrong == backup) {
      System.out.println("given number is armstrong");
    } else {
      System.out.println("given number is not an armstrong");
    }
    // System.out.println(armstrong);
  }
}
