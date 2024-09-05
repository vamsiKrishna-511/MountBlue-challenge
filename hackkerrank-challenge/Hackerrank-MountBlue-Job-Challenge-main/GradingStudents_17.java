package MountBlue_01;

import java.util.Scanner;

public class GradingStudents_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int[] ans = gradingStudents(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] gradingStudents(int[] arr) {
        // we will store the updated grades in this ans array
        int[] ans = new int[arr.length];

        /* BRUTEFORCE APPROCH */
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < 38){
//                ans[i] = arr[i];
//            }
//            if(arr[i] >= 38){
//                for (int j = arr[i]; j < 101; j++) {
//                    if(j % 5 == 0){
//                        if(j - arr[i] < 3){
//                            ans[i] = j;
//                            break;
//                        }else{
//                            ans[i] = arr[i];
//                            break;
//                        }
//                    }
//                }
//            }
//        }


        /* BETTER SOLUTION */
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > 37 && arr[i] % 5 > 2){
                ans[i] = arr[i] + (5 - arr[i] % 5);
            } else {
                ans[i] = arr[i];
            }
        }

        return ans;
    }
}
// Brutforce Solution
/*
1. Take a for loop to iterate over an arry
2. check if grade is less than 38 if its assign the update the value in the ans array with respective index
3. and if its greater than 38 then take another loop to iterate from the given grade to 101
4. if the difference between the current grade and next multiple of 5 is less than 3 then update the grade in ans array and break the loop else assign the current grade because we want only next multiple of 5
 */

// BETTER SOLUTION
/*
1. iterate over an array using for loop
2. if arr[i] is greater than 37 and arr[i] % 5 is greater than 2 then add the current element and 5 - arr[i]%2 ans assign to the asn array with respective index value
3. else we know that the given two conditons are failing therefore student must be failing or there is no need to round the grades
 */