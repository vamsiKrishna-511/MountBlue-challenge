package MountBlue_01;

import java.util.Scanner;

public class SuperReducedString_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(superReducedString(str));
    }

    static String superReducedString(String str) {
        //we will iterate over string and check whether there exit a pair of characters if it exists then we will return the new array excluding same pair character using substring method
        // here we will iterate from the second element that is i = 1 to i < length of string
        for (int i = 1; i < str.length(); i++) {

            // then we will compare the current element with the previous element and if the characters does non match then we simply increment the value of index
            // and if the both the character are same then we will return/ update the string excluding the match characters, for this we are using the substring method of the string class
            if(str.charAt(i) == str.charAt(i - 1)){
                str = str.substring(0, i - 1) + str.substring(i + 1);
                i = 0; // Here we set the index value to 0 because now we have a new string and we have to iterate over string from the beginning again
                // Here first substring method is returning the characters from excluding the duplicates and containing the remaining characters if there are any
                // The second substring method is returning the remaining characters of a string after the first substring removing the characters
                // And we are adding the first and second substring method results to the same string str
            }
        }

        // if the length of the string is 0 then return "Empty string" else return the str
        if(str.length() == 0){
            return "Empty String";
        }
        else {
            return str;
        }

    }
}

/*
The substring(beginIndex, endIndex) is a method of a string class.
it returns a new string that is a substring of the string.
the endIndex is exclusive means if we pass parameters to substring(1, 4)
it will take 1, 2 and 3 and not 4
 */


/*
Reduce a string of lowercase characters in range ascii[‘a’..’z’]
by doing a series of operations. In each operation,
select a pair of adjacent letters that match, and delete them.
 */