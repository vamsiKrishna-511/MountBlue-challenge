package MountBlue_01;

import java.util.Scanner;

public class DiagonalDifference_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int ans = diagonalDifference(arr, n);
        System.out.println(ans);
    }
    
    static int diagonalDifference(int[][] arr, int n){
        // Initialize variable to store the sums of diagonals
        int right = 0, left = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                //finding the sum of left-to-right diagonal
                if(i == j){
                    right += arr[i][j];
                }

                //finding the sum of right-to-left diagonal
                if(i == n - 1 - j){
                    left += arr[i][j];
                }
            }
        }
        //absolute difference of the sums across the diagonals
        int ans = Math.abs(right - left);
        return ans;
    }
}

/*
1. Calculate the sums across the two diagonals of a square matrix
2. Along the first diagonal of the matrix, row index = column index that is  lies on the first diagonal if i = j
3. Along the other diagonal, row index = n – 1 – column index that is mat[i][j] lies on the second diagonal if i = n-1-j
4. By using two loops we traverse the entire matrix and calculate the sum across the diagonals of the matrix.
 */