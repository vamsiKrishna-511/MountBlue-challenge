package MountBlue_01;

import java.util.Scanner;

public class CompareTheTriplets_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[3]; // Alice's Rating
        int[] b = new int[3]; // Bob's Rating

        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = input.nextInt();
        }

        int[] ans = compareTriplets(a, b);
        for (int i = 0; i < 2; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] compareTriplets(int[] a, int[] b) {
        // Now we create 2 variable to store the  respective rating's
        int aliceRating = 0;
        int bobRating = 0;

        // Now we will take a for loop and iterate over each element andd compare their raintgs
        for (int i = 0; i < 3; i++) {
            // if alice and bob have same rating then we do not have to award them with the points
            // therefore we simply continue and move to the next iteration
            if(a[i] == b[i]){
                continue;
            }

            // Here we are comparing the respective index values of alice's and bob's values whoever has more value will get the one point
            if(a[i] > b[i]){
                aliceRating++;
            }
            else{
                bobRating++;
            }
        }
        //Now let's create an array of size 2 for storing Alice's and Bob's rating and return the array
        int[] ans = {aliceRating, bobRating};
        return ans;
    }
}

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the
two challenges, awarding points on a scale from 1 to 100 for three categories: \
problem clarity, originality, and difficulty.
 */