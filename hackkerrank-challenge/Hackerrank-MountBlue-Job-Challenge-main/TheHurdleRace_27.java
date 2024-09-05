package MountBlue_2;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // the number of hurdles or size of an array
        int k = input.nextInt(); // the maximum height a character can jump

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int ans = hurdleRace(arr, k);
        System.out.println(ans);
    }

    static int hurdleRace(int[] arr, int k){

        //We have to find out how many doses of the potion must the character take to be able to jump all of the hurdles
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        // if the k that is the maximum height to which character can jump is greater than or equal to the maximum element that is the maximum height of hurdle then there is no need to take any magic potion therefore return 0
        // if the k is less than max then we need to take the potion to pass tallest hurdle, therefore the height k should be greater than or equal to max therefore max - k will give the number of potions
        if(k >= max){
            return 0;
        }
        else{
            return max - k;
        }
    }
}

/*
ALGORITHM
1. first find the maximum element of an array
    for that sort the array in descending order and the first element would be the max element

 */
