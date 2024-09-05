package MountBlue_01;

import java.util.Scanner;

public class BirthdayCakeCandles_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int ans = birthdayCakeCandles(arr);
        System.out.println(ans);
    }

    static int birthdayCakeCandles(int[] arr){

//        // get the count
//        int[] freq = new int[10];
//        for (int i = 0; i < n; i++) {
//            freq[arr[i]]++;
//        }
//
//        int maxIndex = 1;
//        for (int i = 0; i < freq.length; i++) {
//            if(freq[i] > freq[maxIndex]){
//                maxIndex = freq[i];
//            }
//        }
//
//        return maxIndex;

        /* Find the max element */
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        /* Get the count of max element */
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                count++;
            }
        }

        return count;
    }
}
// SOLUTION 2 : EXCEEDING TIME LIMIT
/*
1. initialize a freq array of size 10 and store and get count of each year
2. Here the count of freq array is 10 because the tallest candle can be from 0 to 9
3. take a maxIndex to store the count of maximum height of candles which occurs at the highest frequnecy
3. take a loop iterate over freq array and check if current element has the highest value than the previous if true update the maxIndex
 */

// SOLUTION 2 :
/*
1.loop through an array and find max value from given candles
2. take count variable to count frequency of max value element
3. take another for loop and and compare the max value to every element in an array\
4. if its true, then increment the value of count by 1
5. return the count
 */
