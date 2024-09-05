package MountBlue_2;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingDay = input.nextInt(); // starting day number
        int endingDay = input.nextInt(); // ending day number
        int k = input.nextInt(); // divisor

        System.out.println(beautifulDays(startingDay, endingDay, k));
    }

    static int beautifulDays(int startingDay, int endingDay, int k) {
        int count = 0;
        for (int i = startingDay; i <= endingDay; i++) {
            if(Math.abs(i - reverse(i)) % k == 0){
                count++;
            }
        }
        return count;
    }

    static int reverse(int i){
        int ans = 0;
        while(i > 0){
            int rem = i % 10;
            ans = ans * 10 + rem;
            i /= 10;
        }
        return ans;
    }
}
/*
1. Initialized a count variable to store the number of beautiful days
2. take a for loop from starting day to ending day both are inclusive
3. calculate the absolute diff between the number and the reverse of the number and if its divisible by k increment the count by 1
4. return the count

to reverse the number, define a method which will return the reverse of the number

 */