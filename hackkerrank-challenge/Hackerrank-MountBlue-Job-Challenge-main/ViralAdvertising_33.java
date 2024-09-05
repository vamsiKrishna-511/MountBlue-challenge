package MountBlue_2;

import java.util.Scanner;

public class ViralAdvertising_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int ans = viralAdvertising(n);
        System.out.println(ans);
    }

    public static int viralAdvertising(int n) {

        // declare variables
        int liked = 0;
        int total = 0;

        // on the first when the product is launch they share it with people
        int shared = 5;

        // from day 1 to n  we have to calculate the number of people have liked the product at the end of the given day, beginning with the launch day as day 1
        for(int day = 1; day <= n; day++){
            liked = shared/2;
            shared = liked * 3;
            total = total + liked;
        }
        return total;

    }
}

/*
Approach :
everyday half of the people like the product and they shared it with 3 other people
so on the first day 5 / 2 i.e 3 people liked the product and shared with 3 other people
so we will keep all the record on each day of like and store in total variable
at end of the last day will will have no of people who liked the product so return the total

 */
