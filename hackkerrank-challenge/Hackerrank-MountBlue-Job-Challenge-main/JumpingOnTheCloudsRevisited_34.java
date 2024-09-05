package MountBlue_2;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int ans = jumpingOnClouds(arr, k, n);
        System.out.println(ans);
    }

    static int jumpingOnClouds(int[] arr, int k, int n) {

        int energy = 100;  // Initially the characters energy level is 100
        int pos = 0; // this is the start position from where the player starts jumping

        while(true){

            // we need to keep on jumping in circular unitl the player land back on cloud 0 again after the end of an array that is until p becomes 0
            // we wil keep on jumping p units until p becomes 0
            pos = (pos + k) % n;

            // if value in array is 1 means its land thunderhead so its energy decreased by 2, and 1 unit of energy is required to make a jump so the total energy will decreased by 3
            // and if its landed on 0 that is on cumulus cloud just 1 unit of energy is requierd so decreased energy by 1
            if(arr[pos] == 1) {
                energy-=3;
            }
            else{
                energy--;
            }

            //if pos = 0, it means he reaches the start again so break the loop.
            if (pos == 0) break;
        }

        // return the energy
        return energy;
    }
}
