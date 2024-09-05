package MountBlue_01;

import java.util.Arrays;
import java.util.Scanner;

public class Quicksort1Partition_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // size of an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] ans = quickSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] quickSort(int[] arr, int n) {
        //we create variable to store the pivot that is the first element in an array should be considered as pivot
        int  pivot = arr[0];

        // Now will create another array of same size and copy the elements of original array
        int[] copy = Arrays.copyOf(arr, n);

        int index = 0; // we need this variable to keep track indexes in original aray

        // then we take a for loop and iterate from 1 to the length of an array and compare with pivot
        // here we are iterating over an copy array and sorting the original array
        // here we are not iterating from 0 because the first element of an array is always a pivot
        for (int i = 1; i < n; i++) {
            // If elementless than or equal to pivot  then we will add/update an original array from index 0 and then increment the index value of original array by 1
            if(copy[i] <= pivot){
                arr[index] = copy[i];
                index++;
            }
        }

        //Now we have all the elements less than pivot in original array in the left side
        // now we add our pivot element in the original array and after that we have update right side of an array to complete the sorting of this particular problem
        arr[index] = pivot;
        index++; // so we can add elements greater than pivot in the right side

        //we take a for loop iterate over the copy of array and do the same as we did in the above loop just here we need to check for the condition greater than the pivot element
        for (int i = 1; i < n; i++) {
            if(copy[i] > pivot){
                arr[index] = copy[i];
                index++;
            }
        }

        // Now we have the sorted array arr
        // Now we will just simly return the array
        return arr;
    }
}

/*
First will create another array of same size and copy the elements of original array
then we take a for loop and iterate from 1 to the length of an array and compare with pivot
here we are not iterating from 0 because the first element of an array is always a pivot

 */