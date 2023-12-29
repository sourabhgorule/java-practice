public class Pattern2 {


    /*
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * 
     *  here , we need three for loops 
     *  1 for row
     *  2nd for column space
     *  3rd for column *
     *  1 for loop is outer and remaining both are innter loops of 1st loop
     * 
     */

    public static void main(String[] args) {
        
        for (int row = 0; row < 5; row++) {
            
            for (int space = 5; space > row+1; space--) {
                System.out.print(" ");
            }

            for (int star = 0; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
