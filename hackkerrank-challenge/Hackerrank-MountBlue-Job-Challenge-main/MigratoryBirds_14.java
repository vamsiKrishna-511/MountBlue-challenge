package MountBlue_01;

import java.util.Scanner;

public class MigratoryBirds_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int ans = migratoryBird(arr, n);
        System.out.println(ans);
    }

    static int migratoryBird(int[]arr, int n) {
        // It is guaranteed that each type is 1, 2, 3, 4, or 5.
        int types = 5;

        // Get counts of each type bird
        // Here we are taking NUM_TYPES+1 else we will get the index out of bounds error
        int[] freq = new int[types + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        /* Find max */
        // the maxIndex variable will holt the type of number(type of bird) that occurs at the highest frequency
        int maxIndex = 1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}

/*
Note : It is guaranteed that each type is 1, 2, 3, 4, or 5.
1. Get the count of each type of birds and store it in a freq array
2. Now we have the counts of each type just find the maximum occurrence of type and return it
3. take a for loop and iterate over the freq array from 0 to length
4. check whether the current value if greater than the next value in the array then set the maxIndex value to i that is current index
5. at last return the maxIndex
 */