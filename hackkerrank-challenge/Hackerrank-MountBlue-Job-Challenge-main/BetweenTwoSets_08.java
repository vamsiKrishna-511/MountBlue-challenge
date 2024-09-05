package MountBlue_01;

import java.util.Scanner;

public class BetweenTwoSets_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // the size of the first and the second array
        int n = input.nextInt();
        int m = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
        }

        int ans = getTotalX(a, b, n, m);
        System.out.println(ans);
    }

    static int getTotalX(int[] a, int[] b, int n, int m){
        // count variable to count the number of integers between two sets
        int count = 0;

        //The variable x is to check whether the element we considered is the element between two sets where the elements of the first array are all factors and factor to all elements in the second array
        boolean x = false;

        // We will run three for loops to find the element
        // We have to find the elements between two array so will run the outermost for loop from the last element of first array til less than equal to the first element of second array


        for (int i = a[n-1]; i <= b[0]; i++) {

            //Now inside the first for loop we run another for loop from for the first array from 0 to n
            for (int j = 0; j < n; j++) {

                //to check whether the elements of the first array are all factors of the element we considered
                // if the element we considered is factor to all the element then we set the value of x to true else we set to false ans break the loop for this particular element
                if (i % a[j] == 0) {
                    x = true;
                } else {
                    x = false;
                    break;
                }

            }

            // we run the another for loop inside the outermost for loop to check whether the element we considered is the factor of all the elements of second array
            // before running a second loop will check whether the element we considered is factor to the all element in first array for this will simply check the value of x variable if its true then we run the for loop else we will not because we need a element which will satisfy the both condition if its not satisfying the first condition there is no point in considering the second condition that will give the wrong answer

            if(x){
                for (int k = 0; k < m; k++) {

                    // If the element we considered is the factor of all elements then we wil set the value of x to true else false
                    if (b[k] % i == 0) {
                        x = true;
                    } else {
                        x = false;
                        break;
                    }
                }
            }

            // if the value of x is true then increment the value of count
            // because the element we considered is the right element whose all factors in first array and the element is a factor of all elements in the second array
            if (x){
                count++;
            }
        }

        // at last return the count
        return count;
    }
}


/*
The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
 */