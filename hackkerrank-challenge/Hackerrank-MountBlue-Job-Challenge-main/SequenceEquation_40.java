package MountBlue_2;

import java.util.Scanner;

public class SequenceEquation_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // the number of elements in the sequence
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] ans = permutationEquation(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] permutationEquation(int[] p) {

        int[] ans = new int[p.length];
        int x = 1; // x increments form 1 to n

        for (int i = 0; i < p.length; i++) {
            int y = 0; // y is the index where the x is located and we have to return the index where y is located
            for (int j = 0; j < p.length; j++) {
                if(p[j] == x){
                    y = j + 1; // p[y] will give us value of x, now we have to find out p[p[y]] which gives value of x
                    break;
                }
            }
            for (int k = 0; k < p.length; k++) {
                if(p[k] == y){
                    ans[i] = k + 1;
                    break;
                }
            }
            x++;
        }

        return  ans;


        // second solution O(n)
//        // p(x) is a one-to-one function, so it has an inverse of p(x) we need to find a y where p(p(y)) == x, where n is from 1 to n
//        // y = p_Inverse[p_Inverse[x]] which is the version of the equation we use to calculate and store in an ans array and return in
//        int n = p.length;
//        int[] p_inverse = new int[n + 1]; // we are taking the array of size n + 1 because we are taking x from 1
//        int[] ans = new int[n];
//
//        for(int x = 1; x <= n; x++){
//            int px = p[x - 1];
//            p_inverse[px] = x;
//        }
//
//        for(int x = 1; x <= n; x++){
//            int y = p_inverse[p_inverse[x]];
//            ans[x - 1] = y;
//        }
//
//        return  ans;
    }
}
