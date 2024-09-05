package MountBlue_2;

import java.util.Scanner;

public class TowerBreakers_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt(); // the number of test cases

        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt(); // the number of towers
            int m = input.nextInt(); // the height of each tower
            int ans = towerBreakers(n, m);
            System.out.println(ans);
        }
    }

    static int towerBreakers(int n, int m) {
        //the player 1 always goes first, so if the m == 1, that is the height of each tower, then player 1 cannot make any move so player 2 wins as m that is height cannot be reduced less than 1
        // each player wants to make the height of tower 1, because 1 evenly divides all the numbers

        // so the answer is only depends on the number of towers that is odd or even except fo the one when the height of tower is 1 then player 2 wins
        // if the towers are odd then at the end player 1 would reduce the last tower to 1 and player 2 does not have any moves to make as the play very optimally and whatever player 1 does the player 2 copied it
        // if n % 2 == 0 then player 2 wins else player 1

        if(m == 1 || n % 2 == 0) return 2;
        return 1;
    }
}
/*

 */