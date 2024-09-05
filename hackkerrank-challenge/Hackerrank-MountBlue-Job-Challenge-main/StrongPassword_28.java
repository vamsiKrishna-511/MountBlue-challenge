package MountBlue_2;

import java.util.Scanner;

public class StrongPassword_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // length of the password
        String str = input.next();

        int ans = minimumNumber(str, n);
        System.out.println(ans);
    }

    static int minimumNumber(String str, int n) {
        int count = 0;
        int num = 0, lc = 0, uc = 0, sc = 0;

        for (int i = 0; i < n; i++) {
            int ascii = str.charAt(i);
            // if the character is present then increment the value  of their respective variable by 1
            if(ascii >= 48 && ascii <= 57){
                num++;
            }
            else if(ascii >= 65 && ascii <= 90){
                uc++;
            }
            else if(ascii >= 97 && ascii <= 122){
                lc++;
            }
            else{
                sc++;
            }
        }

        // if the value of these variable is 0 it means that these are the characters are not present in the password string
        // if their respective variable value 0 then increment the count by 1, as count is used to count the characters that need to added in the string to complete the password
        if(num == 0) count++;
        if(lc == 0) count++;
        if(uc == 0) count++;
        if(sc == 0) count++;

        // Now we have the count of missing characters this need to add in a string to complete the password

        // if the length of a string is less than 6 as we need at least 6 characters to complete the password, then we need to add missing character to the string and if the string and after adding if it's still not equal to 6 then we have to add remaining characters so the length should be 6
        // if the length is greater than or equal to 6 we only need missing characters to make the password strong so return the count

        // if the length of string is less than 6 then, 6 - length of string+count will give us the number of characters we need to add to make the password strong besides missing characters so return count+difference of 6 and length+count

        //this thing failing some test cases
//        if(n< 6){
//            return count + (6 - (n + count));
//        }
//        else{
//            return count;
//        }

        // if the count is greater than 6 - length of string then return count else return the 6 - lenght of string
        // if 6 - n is less than count it means the length of string is greater than 6 and it it's not then we need to return the number of character that can make string strong that it should be 6 - n to make string 6 characters long

        return count > (6 - n) ? count : (6 - n);

    }
}
