package MountBlue_2;

import java.util.Scanner;

public class GameOfStones_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            System.out.println(gamesOfStones(n));
        }
    }

    static String gamesOfStones(int n){
        if(n == 1 || n == 7 || n == 10 ) return "Second";
        if(n >= 2 && n <= 6) return "First";

        return "Second";
    }
}
