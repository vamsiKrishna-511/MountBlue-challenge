package MountBlue_2;

import java.util.Scanner;

public class MarsExploration_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int ans = marsExploration(str);
        System.out.println(ans);
    }

    static int marsExploration(String str) {
        int count = 0;
        String message = "SOS";
        for (int i = 0; i < str.length(); i++) {
            // check if the character at i in string is equal to character at i in message if its not true then increment the count by 1
            if(str.charAt(i) != message.charAt(i % 3)){
                count++;
            }
        }

        return count;
    }
}
/*
Algorithm :
1. initialize a count variable to count the letters is SOS that were altered
2. take a for loop iterater over a string
3. length of string modulo is 3 means each message contains 3 letters, check if the character at i in string is equal to character at i in message if its not true then increment the count by 1

4. at last return the count

if the SOS message was not altered then we have to return 0 as we initialize the count to 0 at first so if it message does not get altered then the count will remain 0
*/