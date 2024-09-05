package MountBlue_01;

import java.util.Scanner;

public class PlusMinus12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        plusMinus(arr, n);
    }

    static void plusMinus(int[] arr, int n) {
        // we will declare and initialize 3 variables with zero this will use to store count the number of positive, negative and zeroes in array
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroesCount = 0;

        // Then will iterate over an array and count and the count the number positive, negative and zero elements in array
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                positiveCount++;
            } else if(arr[i] < 0){
                negativeCount++;
            } else{
                zeroesCount++;
            }
        }

        // Now we have the count, will divide by it counts by size of an array to find the proportion of occurrence of positive, negative and zero values and prints it
        // for precision we will use String.format method
        System.out.println(String.format("%.6f", (double) positiveCount / n));
        System.out.println(String.format("%.6f", (double) negativeCount / n));
        System.out.println(String.format("%.6f", (double) zeroesCount / n));

    }
}


/*
We can use String.format() method to format the decimal number to some specific
format.

Syntax:

String.format("%.Df", decimalValue);

where D is the number required number of Decimal places.
 */
