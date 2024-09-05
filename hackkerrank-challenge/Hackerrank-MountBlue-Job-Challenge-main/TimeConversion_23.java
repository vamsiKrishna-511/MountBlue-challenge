package MountBlue_2;

import java.util.Scanner;

public class TimeConversion_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String ans = timeConversion(str);
        System.out.println(ans);
    }

    static String timeConversion(String str) {
        String ans = "";
        int n = str.length();

        // to check the time is in AM or PM we use a substring method of string from length of string -2 to length of string and we will compare using equals method
        if(str.substring(n - 2, n).equals("AM")){
            // the startsWith method check if the string is starting with a particular characters or some specific part of a string
            if(str.startsWith("12")){
                ans = "00" + str.substring(2, n - 2);
            }else{
                ans = str.substring(0, n - 2);
            }
        }
        else{
            if(str.startsWith("12")){
                ans = str.substring(0, n - 2);
            }
            else{
                // The integer.parseInt() method converts string to integer
                int ch = Integer.parseInt(str.substring(0, 2));
                if(ch >= 01 && ch <= 11){
                    ch = 12+ch;

                    // string.valueOf converts integer to string
                    ans = String.valueOf(ch) + str.substring(2, n - 2);
                }
            }
        }

        return ans;
    }
}


/*

Given a time in 12-hour AM/PM format, we have to convert it to military (24-hour) time.
Algrithm :
1. Initialized an empty string to store the time after conversion
2. declare a variable to store the length of a string
3. check if the time is in AM or PM
4. if its in AM
    then first we will check if the hour hand is equals to 12 or not
        if its 12 then we add 00 in place of 12 and concat this with string time hand to length - 2 the excluding the 'AM"
        and if its not 12 then we simply assign the string to the new string by excluding the AM part
5. if its PM
    then we check if string starts with 12,
        then we store the string in empty string by excluding PM part for that will use substring method
    if string does not starts with 12,
        then will take integer variable ch and store the first 2 characters of a string and converting them in integer
        then if the ch is greater than or equal to 1 or less than or equal to 11 if it is then add 12 to it and then convert it to string
        then we will add this ch value and string from index 2 to length - 1 that is excluding pm part
6. return the ans
 */