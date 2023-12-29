public class Pattern7 {

  /*
        0 1 1 2 3 5 8 13 ...
    */
  public static void main(String[] args) {
    int prev = 0;
    int next = 1;
    int temp;
    System.out.print(prev + " " + next);
    for (int i = 2; i < 10; i++) {
      temp = prev + next;
      System.out.print(" " + temp);

      prev = next;
      next = temp;
    }
  }
}
