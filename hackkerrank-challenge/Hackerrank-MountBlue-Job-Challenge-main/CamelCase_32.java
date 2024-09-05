package MountBlue_2;

import java.util.Scanner;

public class CamelCase_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int ans = camelCase(str);
        System.out.println(ans);
    }

    static int camelCase(String str){
        // here we are initializing count to 1 because its a camelcase string means first letter would be lowercase and til the next uppercase letter the count of words is 1
        // and For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase therefore if we found uppercase letter it means we have new word
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) count++;
        }

        return count;
    }
}
/*
ALGORITHM
1. initialized a variable count to 1
2. take a for loop iterate to see if string contains any uppercase characters or not
3. it it contains then increment the value of count by 1 */