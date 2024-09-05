package MountBlue_2;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int ans = minimumAbsoluteDifference(arr);
        System.out.println(ans);
    }

    static int minimumAbsoluteDifference(int[] arr){
        int min = Integer.MAX_VALUE; // stores the maximum value an integer can store

        /* SOLUTION 1 : O(n^2) */
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int temp = Math.abs(arr[i] - arr[j]);
//                if(temp < min){
//                    min = temp;
//                }
//                if(min == 0) return 0;
//            }
//        }

        /* SOLUTIN 2: O(n log n) */
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.abs(arr[i - 1] - arr[i]);
                if(temp < min){
                    min = temp;
                }
                if(min == 0) return 0;
        }

        return min;
    }
}
/*
SOLLTION 1 : WORKS FINE BUT DOES NOT PASSING ALL THE CASES AS TIME COMPLEXITY IS O(n^2)
1. take 2 for loops to iterate over an array
2. find the mim absolute difference for that use math.abs method
3. if temp is less than min then update the min
4. return min
 */

/*
SOLLTION 2:
1. Sort the array so we can traverse to consecutive elements
2. take a for loop from 1 to length of an array
3. then find the difference of arr[i - 1] and arr[i] and store in the temp
4. if temp is less than min then update the min
5. return the min

Dry run :  1 -3 71 68 17
sorted array ; -3 1 17 68 71
diff :
-3 - 1 = 4
1 - 17 = 16
17 - 68 = 51
68 - 71 = 3
so the 3 is the minimum difference


 */