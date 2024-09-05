package MountBlue_01;

import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < n ; i++) {
            arr[i] = input.nextInt();
        }
        int ans = stockMerchant(arr, n);
        System.out.println(ans);
    }

    static int stockMerchant(int[] arr, int n){
        /*
        we will count the number of each element i.e. each sock of each color
        and using a frequency array in O(n) time complexity
         */

        // we declare a freq array of size 101, the indices starting from 0 to 100
        // because the maximum number of distinct color is 100
        int[] freq = new int[101];

        // to track the number of distinct pairs of socks
        int countPairs = 0;

        // Now we traverse the array using a for loop and the count the occurrence or frequency of each element in an array and store it in a freq array
        // For every element, we increment the value of that index of the frequency array, which is the same value as the integer value representing the colour
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        System.out.println(Arrays.toString(freq));
        // Now we have the frequency of every element in freq array
        // divide each element that is representing the frequency of each colour of sock by 2 and add the results to a variable countPairs


        for (int i = 0; i < 101; i++) {
            countPairs = countPairs + freq[i]/2;
        }

        return countPairs;

    }
}
