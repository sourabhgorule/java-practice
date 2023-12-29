public class Pattern1{

    /*
    
        *
        **
        ***
        ****
        *****

        psudo code
        1 : check row and column
        2 : first for loop for row
        3 : inner for loop for, loop end with row th position
        5 : in that for loop, we print the star
    
    */

    public static void main(String[] args) {
        System.out.println("hiiiiii");

        for (int row = 0; row < 5; row++) {

            for (int col = 0; col <= row; col++) {
                
                System.out.print(" "+"*"+" ");

            }
            System.out.println();

        }


    }
}