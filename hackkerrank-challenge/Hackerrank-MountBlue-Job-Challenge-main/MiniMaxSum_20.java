package MountBlue_01;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr){
        long min = 0, max = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i < 4){
                min += arr[i];
            }
            if(i > 0){
                max += arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}

/*
Algorithm
1. Initialized variables min and max to store the minimum and maximum value
2. sort the array in ascending order as we have to take the sum of first minimum elements and we have to take the sum of first five maximum elements
3. loop through an array and add the first 4 numbers and store it in a min and add the last 4 numbers and store the sum in max
4. print the space separated min and max value
 */