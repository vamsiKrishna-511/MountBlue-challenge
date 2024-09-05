package MountBlue_01;

import java.util.Scanner;

public class BreakingTheRecords_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = input.nextInt();
        }

        int[] ans =  breakingRecords(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] breakingRecords(int[] arr) {
        int leastCount = 0;
        int mostCount = 0;

        // The first element is taken as bestRecord and the worstRecord for comparing with the other records
        int bestRecord = arr[0];
        int worstRecord = arr[0];

        // Here we run for loop from i = 1 up to length of an array and compare the current record with previous best and worst record\
        // if current record is greater, then we update the value of bestRecord and increment the mostCount
        // and if current record is less, then we update the value of worstRecord ans increment the leastCount

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > bestRecord) {
                bestRecord = arr[i]; // 25
                mostCount = mostCount + 1; // 2

            }
            if(arr[i] < worstRecord) {
                worstRecord = arr[i]; // 1
                leastCount = leastCount + 1; // 4
            }
        }

        // Now we have the mostCount and leastCount value as the amount of time she broke her records
        // now we just simply create an array of size 2 and initialized with mostCount and leastCount value and return it
//        System.out.println(most + " " + leat);
        int[] ans = {mostCount, leastCount};
        return ans;

    }
}

/*

 */