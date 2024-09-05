package MountBlue_01;

import java.util.Scanner;

public class DivisibleSumPairs_19 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // size of an array arr
        int k =  input.nextInt(); // the integer divisor

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int ans = divisibleSumPairs(arr, n, k);
        System.out.println(ans);
    }

    static int divisibleSumPairs(int[] arr, int n, int k){

        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if( (arr[i] +  arr[j]) % k == 0){
                    pairs++;
                }
            }
        }
        return pairs;

    }
}

/*
SOLUTION 1 ALGORITHM
1. initialize a variable pairs
2. take outer for loop to iterate over an array
3. take inner for loop to to add the current and current+1 element and check whether its divisible by k or not
4. if its true, increment the pairs value by 1
5. return the pairs
 */