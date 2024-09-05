package MountBlue_01;

import java.util.Scanner;

public class AVeryBigSum_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // size of an array

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        long ans = veryBigSum(arr);
        System.out.println(ans);

    }

    public static long veryBigSum(int[] arr) {
        // we will create a long variable named sum which will store the sum of all the big integers
        long sum = 0;

        // then we iterate over an every element in arr and add in the sum variable
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // and in the last we just return the sum back to the main funtion
        return sum;
    }

}