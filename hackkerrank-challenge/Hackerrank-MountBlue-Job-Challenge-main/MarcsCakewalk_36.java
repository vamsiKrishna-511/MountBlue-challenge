package MountBlue_2;
import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(marcsCatwalk(arr));
    }

    static long marcsCatwalk(int[] arr) {
        Arrays.sort(arr);
        long ans = 0; // in some test case the ans exceeds the range of integers so we need long else some test cases are failing
        int index = 0;

        // We are iterating from length-1 to 0 because the array is in ascending order and we have to need to determine the minimum number of miles marc must walk
        // after every iteration increase the value of index by 1
        // we need to cast to int because the pow method return the result in double
        for (int i = arr.length - 1; i >= 0; i--) {

            //Here we applied Math class and put the formula as described in the question and the power of a given number
            ans +=  Math.pow(2, index) * arr[i];
            index++;
        }
        return ans;
    }
}
/*
Algorithm :
1. first sort the array in ascending order
2.initialized ans and index variables
2. take a for loop from length - 1 to 0 and iterate over an array of each element that is each cupcake and calculate the amount of miles we need to walk that is 2 to the power index and multiply by that with calories of cake
3. store the result in ans variable after every iteration
4. return the ans
 */