public class Pattern6 {

    /*
     * #    #
     *  #  #
     *   ##
     *    
     */
    // public static void main(String[] args) {
    //     int start = 0,end = 4;
    //     for (int i = 0; i < 5; i++) {

    //         for (int j = 0; j < 5; j++) {
    //             if(start == j || end == j){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
                
    //         }
    //         start++;
    //         end--;
    //         System.out.println();
    //     }

    // }

    public static void main(String[] args) {
        int rows = 7; // Change the number of rows as needed

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows * 2; j++) {
                System.out.println(rows * 2 - i - 1);
                if (j == i || j == rows * 2 - i - 1) {
                    System.out.print("*"); // Print stars at specific positions to form a V
                } else {
                    System.out.print(" "); // Print spaces elsewhere
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
