package MountBlue_01;

import java.util.Scanner;

public class StairCase_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        staircase(n);
    }

    static void staircase(int n) {

        // We run two for loop outer loop for row and inner loop for column
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                // add value of i and j if it's greater than n then we simply print # else print empty value
                if((i + j) > n ){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            // after the inner loop we have go the next line so this following method for new line
            System.out.println();
        }
    }
}


/*

This is a staircase of size N = 4:

   #
  ##
 ###
####

 */