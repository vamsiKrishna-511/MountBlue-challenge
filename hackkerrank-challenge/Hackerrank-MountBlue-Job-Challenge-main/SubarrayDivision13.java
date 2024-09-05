package MountBlue_01;

import java.util.Scanner;


public class SubarrayDivision13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Size of an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int day = input.nextInt(); // Ron's birth day
        int month = input.nextInt(); // Ron's birth month

        int ans = birthDay(arr, day, month, n);
        System.out.println(ans);
    }

    static int birthDay(int[] arr, int day, int month, int n){
        // Variable to count the number of ways the bar can be divided
        int count = 0;

        // We will take two for loops, the outer for loop is from i=0 to i < n + month
        for (int i = 0; i < arr.length - month; i++){ // 1 2 1 3 2
            int sum = 0;                         // d=3 m=2

            for (int j = i; j < i + month; j++){
                sum = sum + arr[j];
            }

            // Here if the sum is equal to the ron's birth date then we increment the count as lily's conditions got satisfied and she can share a chocolate bar with ron
            if (sum == day) {
                count++;
            }
        }
        return count;
    }
}

/*
Algorithm to solve this problem
1. Declare a variable to count the number of segments which satisfy  the given two conditions
2. use a loop to iterate over the bar
3. Declare a variable sum inside loop for checking if this variables array value if equal to ron's birth date after each segment's iteration
4. use nested loop inside the first loop to iterate over the segments
5. check if sum's value is equal to the ron's birth date, if true increment the count by 1
6. return the count

 */

/*
5
1 2 1 3 2
3=day 2=month

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
 */